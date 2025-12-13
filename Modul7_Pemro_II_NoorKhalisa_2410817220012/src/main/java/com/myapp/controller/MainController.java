package com.myapp.controller;

import com.myapp.model.MonthlySub;
import com.myapp.model.Subscription;
import com.myapp.model.YearlySub;
import com.myapp.repository.DataRepo;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML private TableView<Subscription> subscriptionTable;
    @FXML private TableColumn<Subscription, String> colName;
    @FXML private TableColumn<Subscription, String> colType;
    @FXML private TableColumn<Subscription, Double> colPrices;
    @FXML private TableColumn<Subscription, LocalDate> colDate;
    @FXML private TableColumn<Subscription, Double> colAnnual;

    @FXML private TextField inputName;
    @FXML private TextField inputPrice;
    @FXML private ComboBox<String> inputType;
    @FXML private DatePicker inputDate;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colType.setCellValueFactory(new PropertyValueFactory<>("type"));
        colPrices.setCellValueFactory(new PropertyValueFactory<>("price"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        colAnnual.setCellValueFactory(data -> new SimpleObjectProperty<>(data.getValue().calculateAnnualCost()));

        inputType.getItems().addAll("Bulanan", "Tahunan");
        subscriptionTable.setItems(DataRepo.getSubcriptionList());

        subscriptionTable.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                inputName.setText(newSelection.getName());
                inputPrice.setText(String.valueOf(newSelection.getPrice()));
                inputType.setValue(newSelection.getType());
                inputDate.setValue(newSelection.getDueDate());
            }
        });
    }

    @FXML
    private void handleSave() {
        try {
            String name = inputName.getText();
            String priceText = inputPrice.getText();
            String type = inputType.getValue();
            LocalDate date = inputDate.getValue();

            if (name.isEmpty() || priceText.isEmpty() || type == null || date == null) {
                showAlert("Error", "All fields must be filled!");
                return;
            }

            double price = Double.parseDouble(priceText);
            Subscription newSub;

            if ("Bulanan".equals(type)) {
                newSub = new MonthlySub(name, price, date);
            } else {
                newSub = new YearlySub(name, price, date);
            }

            DataRepo.addSubscription(newSub);
            handleClear();
        } catch (NumberFormatException e) {
            showAlert("Error", "Price must be a valid number!");
        } catch (Exception e) {
            showAlert("Error", "An error occured: " + e.getMessage());
        }
    }

    @FXML
    private void handleUpdate() {
        Subscription selected = subscriptionTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            try {
                selected.setName(inputName.getText());
                selected.setPrice(Double.parseDouble(inputPrice.getText()));

                if (inputDate.getValue() != null) {
                    selected.setDueDate(inputDate.getValue());
                }

                subscriptionTable.refresh();
                handleClear();
            } catch (NumberFormatException e) {
                showAlert("Error", "Price must be a valid number!");
            }
        } else {
            showAlert("Warning", "Please select an item from the table first!");
        }
    }

    @FXML
    private void handleDelete() {
        Subscription selected = subscriptionTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            DataRepo.deleteSubscription(selected);
            handleClear();
        } else {
            showAlert("Warning", "Please select an item to delete!");
        }
    }

    @FXML
    private void handleClear() {
        inputName.clear();
        inputPrice.clear();
        inputType.setValue(null);
        inputDate.setValue(null);
        subscriptionTable.getSelectionModel().clearSelection();
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}

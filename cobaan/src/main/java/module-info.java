module com.example.cobaan {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cobaan to javafx.fxml;
    exports com.example.cobaan;
}
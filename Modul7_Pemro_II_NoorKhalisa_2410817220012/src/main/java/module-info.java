module com.myapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.myapp to javafx.fxml;
    opens com.myapp.controller to javafx.fxml;
    opens com.myapp.model to javafx.base;
    exports com.myapp;
    exports com.myapp.controller;
}
module com.example.modifiedcontactsapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.modifiedcontactsapp to javafx.fxml;
    exports com.example.modifiedcontactsapp;
}
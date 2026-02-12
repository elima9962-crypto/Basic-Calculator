module org.example.basiccalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.basiccalculator to javafx.fxml;
    exports org.example.basiccalculator;
    exports org.example.basiccalculator.controller;
    opens org.example.basiccalculator.controller to javafx.fxml;
}
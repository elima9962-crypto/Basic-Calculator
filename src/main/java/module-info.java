module org.example.basiccalculator {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.example.basiccalculator to javafx.fxml;

    opens org.example.basiccalculator.controller to javafx.fxml;

    exports org.example.basiccalculator;
}
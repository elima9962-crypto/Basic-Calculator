package org.example.basiccalculator.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.example.basiccalculator.model.Calculator;

public class Calculator_Controller {

    @FXML
    private Label display;
    private Calculator model = new Calculator();
    private double num1 = 0;
    private String operator = "";
    private boolean start = true;
    @FXML
    protected void onNumberClicked(ActionEvent event) {
        String number = ((Button)event.getSource()).getText();
        if (start) {
            display.setText(number);
            start = false;
        } else  {
            display.setText(display.getText() + number);
        }
    }

    @FXML
    protected void onOperatorClicked(ActionEvent event) {
        String op =  ((Button)event.getSource()).getText();

        if (op.equals("C")) {
            display.setText("C");
            operator = "+";
            start = true;
            return;
        }

        if (op.equals("=")) {
            if (operator.isEmpty()) return;

            double num2  = Double.parseDouble(display.getText());

            double result = model.Calculate(num1, num2, operator);
            display.setText(String.valueOf(result));
            start = true;

        } else {
            operator = op;
            num1 = Double.parseDouble(display.getText());
            start = true;
        }
    }
}

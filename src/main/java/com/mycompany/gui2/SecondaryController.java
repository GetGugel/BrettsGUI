package com.mycompany.gui2;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class SecondaryController {

    @FXML
    private Button secondaryButton;
    @FXML
    private Label weekTitle;
    @FXML
    private Label timeDisplay;
    @FXML
    private Label dayTitle;
    @FXML
    private Label selectDayTitle;
    @FXML
    private DatePicker selectDayDatePicker;
    @FXML
    private Button submitEditButton;

    
    @FXML
    private void setCustomDayTable(ActionEvent event) {
    }

    @FXML
    private void editSchedule(ActionEvent event) {
    }
}
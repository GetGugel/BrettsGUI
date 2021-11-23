package com.mycompany.gui2;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class SecondaryController1 {

    @FXML
    private TextField createFirstName;
    @FXML
    private TextField createLastName;
    @FXML
    private TextField createCoachName;
    @FXML
    private TextField createUserName;
    @FXML
    private TextField createPassword;
    @FXML
    private TextField createPassword2;
    @FXML
    private Button createAccountButton;
    @FXML
    private TextField signUpDayField;
    @FXML
    private CheckBox signUpCheck1;
    @FXML
    private CheckBox signUpCheck2;
    @FXML
    private CheckBox signUpCheck3;
    @FXML
    private CheckBox signUpCheck4;
    @FXML
    private CheckBox signUpCheck5;
    @FXML
    private CheckBox signUpCheck6;
    @FXML
    private CheckBox signUpCheck7;
    @FXML
    private CheckBox signUpCheck8;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }


}
package com.mycompany.gui2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javafx.application.Platform;
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
    private CheckBox signUpCheck9;
    @FXML
    private CheckBox signUpCheck10;
    @FXML
    private CheckBox signUpCheck11;
    @FXML
    private CheckBox signUpCheck12;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void writeToTxt(ActionEvent event) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(createFirstName.getText().toString()+ "\n");
        
        File file =new File("C:\\Users\\dorje\\Desktop\\login.txt");
        FileWriter W = new FileWriter(file);
        Scanner S = new Scanner(file);
        
        W.write(sb.toString());
        W.close();
        
        //Platform.exit();//closes window
    }


}
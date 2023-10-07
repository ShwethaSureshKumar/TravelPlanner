package com.example.travelplanner;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    private Label label_login;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    public void setUserInformation(String username){
        label_login.setText("Hi "+username+"!!Login successful");
    }
}

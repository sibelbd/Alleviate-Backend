package View_Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

import static javafx.scene.paint.Color.GREEN;
import static javafx.scene.paint.Color.RED;

public class patientRecordsAccessLoginController {

    public String phoneNumber = "555-555-5555";
    public String dob = "01/01/2000";
    public Label welcomeMessage;
    public Label warningPrompt;
    public TextField phoneNumberField;
    public TextField dobField;
    public Button loginButton;

    // Method to authenticate user
    @FXML
    public void authenticateUser(ActionEvent e) throws IOException {
        // Authenticate user and print success
        if (phoneNumberField.getText().equals(phoneNumber) && dobField.getText().equals(dob)) {
            warningPrompt.setTextFill(GREEN);
            warningPrompt.setText("Login Successful");
            //SQL_Connection.init_connection();
            Model.changeScene.changeScene(e, "/View_Controller/mainPage.fxml");
        } else {
            warningPrompt.setTextFill(RED);
            warningPrompt.setText("Login Failed. Invalid Credentials.");
        }

    }

}
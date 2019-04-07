package View_Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

import static javafx.scene.paint.Color.GREEN;
import static javafx.scene.paint.Color.RED;

public class loginNurseController{

    public TextField usernameField;
    public PasswordField passwordField;
    public Button loginButton;
    public Label warningPrompt;
    public Label welcomeMessage;
    private String username = "test";
    private String password = "test";


    // Method to authenticate user
    @FXML
    public void authenticateUser(ActionEvent e) throws IOException {
        // Authenticate user and print success
        if (usernameField.getText().equals(username) && passwordField.getText().equals(password)){
                warningPrompt.setTextFill(GREEN);
                warningPrompt.setText("Login Successful");
            //SQL_Connection.init_connection();
            Model.changeScene.changeScene(e, "/View_Controller/patientRecordsAccessLogin.fxml");
        }
        else{
                warningPrompt.setTextFill(RED);
                warningPrompt.setText("Login Failed. Invalid Credentials.");
        }

    }

}
package View_Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.io.IOException;

public class mainPageController {
    public Button changePatient;
    public Button logOut;

    public void changePatient(ActionEvent actionEvent) throws IOException {
        Model.changeScene.changeScene(actionEvent, "/View_Controller/patientRecordsAccessLogin.fxml");
    }

    public void logOut(ActionEvent actionEvent) throws IOException {
        Model.changeScene.changeScene(actionEvent, "/View_Controller/loginNurse.fxml");
    }
}

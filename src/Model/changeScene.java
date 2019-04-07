package Model;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class changeScene {

    public static void changeScene(ActionEvent e, String FXML_path) throws IOException {
        Parent newParent = FXMLLoader.load(changeScene.class.getResource(FXML_path));
        Scene newScene = new Scene(newParent);
        newScene.getStylesheets().add("res/bootstrap3.css");
        //sets stage by pulling information from current stage, adding the scene to stage, and making stage visible
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(newScene);
        stage.show();
    }
}

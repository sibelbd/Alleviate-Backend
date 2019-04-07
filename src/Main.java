import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("View_Controller\\loginNurse.fxml"));
        primaryStage.setTitle("Alleviate Health Record System");
        primaryStage.setScene(new Scene(root, 400, 350));
        primaryStage.getScene().getStylesheets().add("res/bootstrap3.css");
        // primaryStage.setMaximized(true);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
package versuch_13;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {
    private Model model;
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
      /*FXMLLoader fxmlLoader = new FXMLLoader();
      fxmlLoader.setLocation(this.getClass().getResource("primary.fxml"));
      
      Parent root = fxmlLoader.load();
      
      PrimaryController controller = (PrimaryController) fxmlLoader.getController();
      controller.registerBindings();
      
      Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.show(); */
      scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}
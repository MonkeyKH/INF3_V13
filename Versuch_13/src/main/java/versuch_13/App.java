package versuch_13;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

  @Override
  public void start(Stage stage) throws IOException
  {
    FXMLLoader fxmllLoader = new FXMLLoader();
    fxmllLoader.setLocation(this.getClass().getResource("view.fxml"));
    
    Parent root = fxmllLoader.load();
    
    Model model = new Model();
    PrimaryController controller = (PrimaryController)fxmllLoader.getController();
    controller.setModel(model);
    controller.registerBindings();
    
    Scene scene = new Scene(root);
    stage.setScene(scene);
    
    stage.show();
  }
    public static void main(String[] args) {
        launch();
    }

}
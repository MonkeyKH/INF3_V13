package versuch_13;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

  
    @FXML
    private Label label;
    
    @FXML
    private TextField textFeld;
    
    @FXML
    private Button button;
    
    @FXML
    private void buttonAction(ActionEvent evt)
    {
      //model.returnALabel;?
    }
    
    public void registerBindings()
    {
      label.textProperty().bind(textFeld.textProperty());
    }
    
}

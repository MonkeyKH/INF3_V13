package versuch_13;

import java.io.IOException;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
    private Model model;

    @FXML
    private Button button;

    @FXML
    private Label label;

    @FXML
    private TextField textFeld;

    @FXML
    void buttonAction(ActionEvent event) {
      model.uebersetzen();
    }

    public void registerBindings()
    {
      label.textProperty().bind(textFeld.textProperty());
      Bindings.bindBidirectional(textFeld.textProperty(),model.getString());
    }
}
/*
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
*/
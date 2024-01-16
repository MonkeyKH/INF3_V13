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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;

public class PrimaryController {
    private Model model;

    @FXML
    private Button button;

    @FXML
    private TextArea label;

    @FXML
    private TextField textFeld;

    @FXML
    void buttonAction(ActionEvent event) {
      model.uebersetzen(textFeld.getText());
    }

    public void registerBindings()
    {
      StringConverter<Number> converter = new NumberStringConverter();
      Bindings.bindBidirectional(label.textProperty(), model.getstringInfotext());
     /* label.textProperty().bind(textFeld.textProperty());
      Bindings.bindBidirectional(textFeld.textProperty(),model.getStringInput());
    */}
    public void setModel(Model model)
    {
      this.model = model;
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
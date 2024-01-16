/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package versuch_13;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Kieran
 */
public class Model 
{
  private StringProperty stringInput;
  private StringProperty stringInfotext;

  public Model()
  {
    stringInput = new SimpleStringProperty("");
    stringInfotext = new SimpleStringProperty("");
  }
  
  public void uebersetzen(String newText)
  {
    //stringInfotext.setValue(getStringInput().get());
    stringInput.set(newText);
    stringInfotext.set(new StringBuilder(stringInput.get()).toString().toUpperCase());
 
    
  }
  
  public StringProperty getStringInput()
  {
    return stringInput;
  }  
  
  public StringProperty getstringInfotext()
  {
    return stringInfotext;
  }
}

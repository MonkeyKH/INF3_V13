/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package versuch_13;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Kieran
 */
public class Model 
{
  private SimpleStringProperty string;
  private SimpleStringProperty stringInfotext;

  public Model()
  {
    string = new SimpleStringProperty();
    stringInfotext = new SimpleStringProperty();
  }
  
  public void uebersetzen()
  {
    stringInfotext.setValue(getString().get());
  }
  
  public SimpleStringProperty getString()
  {
    return string;
  }  
  
  public SimpleStringProperty getstringInfotext()
  {
    return stringInfotext;
  }
}

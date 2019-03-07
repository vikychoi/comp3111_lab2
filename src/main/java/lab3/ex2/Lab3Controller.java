package lab3.ex2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class Lab3Controller {

    @FXML
    private Button button1;

    @FXML
    private Label label1;

    @FXML
    private TextField textField;
    
    

    @FXML
    void KeyInput(KeyEvent event) {
    	event.getCharacter();
    }

    @FXML
    void buttonPressed(ActionEvent event) {
    	label1.setText(textField.getText());
    }

}
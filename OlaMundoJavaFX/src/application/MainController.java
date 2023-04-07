package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {
	@FXML
	Label lblOlaMundo;
	@FXML
	Button btnOlaMundo;
	
	public void mostarMenssagem() {
		lblOlaMundo.setText("Olá Mundo JavaFX");
	}
}

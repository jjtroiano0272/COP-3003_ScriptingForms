// This whole file is for handling  IO & peripherals--keyboard & mouse

package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class FXMLExampleController {

	// This makes actiontarget variable to the sign in button when its pressed.
	@FXML private Text actiontarget;

	@FXML protected void handleSubmitButtonAction(ActionEvent event) {
		actiontarget.setText("Sign in button pressed");
	}}

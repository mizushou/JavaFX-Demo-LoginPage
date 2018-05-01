package sample;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginPageController {

    private Stage thisWindow;

    private Scene thisScnen;
    private Scene nestScnen;

    @FXML
    TextField userTextField;

    @FXML
    TextField passWordTextField;

    @FXML
    Button authButton;

    @FXML
    Text outputText;

    @FXML
    public void authButtonClicked() {

        String user = userTextField.getText();
        String password = passWordTextField.getText();

        if(authenticate(user, password)) {
            thisWindow.setScene(nestScnen);
        } else {
            outputText.setFill(Color.FIREBRICK);
            outputText.setText("Authentication Error");
        }
    }

    public boolean authenticate(String user, String password) {
        if(user.equals("mizushou") && password.equals("mizushou")) {
         return true;
        }
        return false;
    }

    public Stage getThisWindow() {
        return thisWindow;
    }

    public void setThisWindow(Stage thisWindow) {
        this.thisWindow = thisWindow;
    }

    public Scene getThisScnen() {
        return thisScnen;
    }

    public void setThisScnen(Scene thisScnen) {
        this.thisScnen = thisScnen;
    }

    public Scene getNestScnen() {
        return nestScnen;
    }

    public void setNestScnen(Scene nestScnen) {
        this.nestScnen = nestScnen;
    }
}

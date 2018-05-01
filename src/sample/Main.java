package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene loginScene, mypageScene;

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;

        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("loginPage.fxml"));
        Parent loginPageRoot = loader1.load();

        FXMLLoader loader2 = new FXMLLoader(getClass().getResource("myPage.fxml"));
        Parent myPageRoot = loader2.load();

        loginScene = new Scene(loginPageRoot, 300, 275);
        window.setTitle("JavaFX-Demo-Login");
        window.setScene(loginScene);

        //MyPage
        mypageScene = new Scene(myPageRoot, 300, 275);

        //Set next page in login page.
        LoginPageController loginPageCtrl = loader1.getController();
        loginPageCtrl.setThisWindow(window);
        loginPageCtrl.setNestScnen(mypageScene);

        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

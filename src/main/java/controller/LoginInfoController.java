package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginInfoController {

    Stage stage=new Stage();

    public TextField emailTxt;
    public PasswordField passwordTxt;

    public void LoginOnAction(ActionEvent actionEvent) {
        String userName=emailTxt.getText();
        String Password=passwordTxt.getText();

        if ("Admin@gmail.com".equals(userName) && "Admin123".equals(Password)){
            try {
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/dashboard.fxml"))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.show();
        }else {

            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Invalid UserName & Password");
            alert.setContentText("Enter Valid User Name & Password");
            alert.showAndWait();
        }

    }

    public void ForgottenPasswordOnAction(ActionEvent actionEvent) {
    }

    public void signUpOnAction(ActionEvent actionEvent) {
    }
}

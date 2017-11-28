package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class prospectInfoController  implements Initializable{


    @Override
    public void initialize(URL location, ResourceBundle resources){

    }

    public void changeScreenMainPage(ActionEvent actionEvent) throws IOException {

        Node node = (Node) actionEvent.getSource();
        javafx.stage.Stage stage = (Stage) node.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("mainPage.fxml"));
        Scene scene = new Scene(parent);

        stage.setScene(scene);
        stage.show();

    }
}

package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

@Component
public class MainPageController implements Initializable {

    @FXML
    private Button buttonManagement;

    @FXML
    private Button buttonSales;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void changeScreenManagementOptions(ActionEvent actionEvent) throws IOException {

        Node node = (Node) actionEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("managementOptions.fxml"));
        Scene scene = new Scene(parent);

        stage.setScene(scene);
        stage.show();

    }

    public void changeScreenSalespersonHomepage(ActionEvent actionEvent) throws IOException {

        Node node = (Node) actionEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("salespersonHomepage.fxml"));
        Scene scene = new Scene(parent);

        stage.setScene(scene);
        stage.show();

    }


}

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
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ManagementOptionsController implements Initializable {

    @FXML
    private Button buttonEmployeeManagement;

    @FXML
    private Button buttonViewReports;

    @FXML
    private Button buttonMainPage;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void changeScreenEmployeeManagement(ActionEvent actionEvent) throws IOException {

        Node node = (Node) actionEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("employeeManagement.fxml"));
        Scene scene = new Scene(parent);

        stage.setScene(scene);
        stage.show();

    }

    public void changeScreenMainPage(ActionEvent actionEvent) throws IOException {

        Node node = (Node) actionEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("mainPage.fxml"));
        Scene scene = new Scene(parent);

        stage.setScene(scene);
        stage.show();

    }

    public void changeScreenManagementReports(ActionEvent actionEvent) throws IOException {

        Node node = (Node) actionEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("managementReports.fxml"));
        Scene scene = new Scene(parent);

        stage.setScene(scene);
        stage.show();

    }
}

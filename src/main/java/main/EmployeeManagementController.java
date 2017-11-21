package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EmployeeManagementController implements Initializable {

    @FXML
    private TableView<?> tableViewSalesperson;

    @FXML
    private Button buttonAdd;

    @FXML
    private Button buttonUpdate;

    @FXML
    private Button buttonDelete;

    @FXML
    private Button buttonMainPage;

    @FXML
    private Label lableEmployeeManagement;

    @FXML
    private TextField textFieldSearchBar;

    @FXML
    private Button buttonSubmit;

    @FXML
    private Label labelIDNumber;

    @FXML
    private Label labelFirstName;

    @FXML
    private Label labelLastName;

    @FXML
    private Label labelEmail;

    @FXML
    private Label labelPhoneNumber;

    @FXML
    private TextField textFieldIDNumber;

    @FXML
    private TextField textFieldFirstName;

    @FXML
    private TextField textFieldLastName;

    @FXML
    private TextField textFieldEmail;

    @FXML
    private TextField textFieldPhoneNumber;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void changeScreenMainPage(ActionEvent actionEvent) throws IOException {

        Node node = (Node) actionEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("mainPage.fxml"));
        Scene scene = new Scene(parent);

        stage.setScene(scene);
        stage.show();

    }
}

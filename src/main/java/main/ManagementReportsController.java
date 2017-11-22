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

public class ManagementReportsController implements Initializable {

    @FXML
    private TableView<?> tableViewPotentialSales;

    @FXML
    private Label labelTotalPotentialSalesNumber;

    @FXML
    private TableView<?> tableViewSalesSalesperson;

    @FXML
    private TextField textFIeldJanuary;

    @FXML
    private TextField textFieldFebruary;

    @FXML
    private TextField textFieldMarch;

    @FXML
    private TextField textFieldApril;

    @FXML
    private TextField textFieldMay;

    @FXML
    private TextField textFieldJune;

    @FXML
    private TextField textFieldJuly;

    @FXML
    private TextField textFieldAugust;

    @FXML
    private TextField textFieldSeptember;

    @FXML
    private TextField textFieldOctober;

    @FXML
    private TextField textFieldNovember;

    @FXML
    private TextField textFieldDecember;

    @FXML
    private Button buttonMainPage;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

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

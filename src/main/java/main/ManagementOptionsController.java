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

    public void changeScreenMainPage(ActionEvent actionEvent) throws IOException {

        Node mainPageNode = (Node) actionEvent.getSource();
        Stage mainPageStage = (Stage) mainPageNode.getScene().getWindow();
        Parent mainPageParent = FXMLLoader.load(getClass().getResource("mainPage.fxml"));
        Scene mainPageScene = new Scene(mainPageParent);

        mainPageStage.setScene(mainPageScene);
        mainPageStage.show();

    }
}

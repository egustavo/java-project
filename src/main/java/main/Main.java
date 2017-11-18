package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main extends Application {

    private Parent root;
    private ConfigurableApplicationContext springContext;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void init() throws Exception {

        // Get the spring context
        springContext = SpringApplication.run(Main.class);
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main.fxml"));

        // Tell JavaFX to use the spring factory to create the controller(s)
        fxmlLoader.setControllerFactory(springContext::getBean);
        root = fxmlLoader.load();
        super.init();
    }

    @Override
    public void start(javafx.stage.Stage primaryStage) throws Exception {
        primaryStage.setTitle("Cougar CRMS");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}

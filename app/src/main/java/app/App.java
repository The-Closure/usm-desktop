package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(
            new Scene(
                new StackPane(
                    new Label(
                        "hello world"           
                    )
                ),
                400,
                400
            )
        );
        stage.show();
    }
}

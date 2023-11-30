package swingborder.flyweight;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {

            FlowPane pane = new FlowPane();
            pane.setBorder(BorderFactory.INSTANCE.getBorder());

            pane.setVgap(6);
            pane.setHgap(5);
            pane.setPrefWrapLength(2);
            pane.getChildren().add(new Button("Start"));
            pane.getChildren().add(new Button("Stop"));
            Button reset = new Button("Reset");
            reset.setBorder(BorderFactory.INSTANCE.getBorder());
            pane.getChildren().add(reset);

            pane.getChildren().add(new TextField("Samat kehykset = " + (pane.getBorder() == reset.getBorder())));

            Scene scene = new Scene(pane, 400, 400);
            primaryStage.setScene(scene);

            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

//    private static Scene scene;
//
//    @Override
//    public void start(Stage stage) throws IOException {
//        scene = new Scene(loadFXML("primary"), 640, 480);
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    static void setRoot(String fxml) throws IOException {
//        scene.setRoot(loadFXML(fxml));
//    }
//
//    private static Parent loadFXML(String fxml) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
//        return fxmlLoader.load();
//    }
//
//    public static void main(String[] args) {
//        launch();
//    }
}

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application {
        @Override
        public void start(Stage stage) throws Exception {
                FXMLLoader fxmlLoader = new
                FXMLLoader(getClass().getResource("MainView.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                stage.setTitle("JavaFX Application");
                stage.setScene(scene);
                stage.show();
                scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        }
        public static void main(String[] args) {
                launch();
        }
}

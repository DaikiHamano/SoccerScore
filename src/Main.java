import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("views/view.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        //for removing mini and max button
        stage.initStyle(StageStyle.UTILITY);
        stage.show();
    }
}

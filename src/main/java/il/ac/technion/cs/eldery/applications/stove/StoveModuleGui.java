package il.ac.technion.cs.eldery.applications.stove;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StoveModuleGui extends Application {
    public static void main(final String[] args) {
        launch(args);
    }

    @Override public void start(final Stage s) throws Exception {
        final Parent root = FXMLLoader.load(getClass().getResource("stove_app_ui.fxml"));
        final Scene scene = new Scene(root);
        s.setTitle("Stove Application");
        s.setScene(scene);
        s.setWidth(350);
        s.show();
    }
}
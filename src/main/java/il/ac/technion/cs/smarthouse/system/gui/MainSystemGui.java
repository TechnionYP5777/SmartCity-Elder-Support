package il.ac.technion.cs.smarthouse.system.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainSystemGui extends Application {
    
    private static final String APP_NAME = "SmartHouse";
    
    public static void main(final String[] args) {
        launch(args);
    }

    @Override public void start(final Stage s) throws Exception {
        
        System.out.println("Initializing system ui...");

        s.setOnCloseRequest(e -> {
            System.out.println("System closing...");
            // TODO: close other threads from here, or just do this:
            System.exit(0);
        });
        
        final FXMLLoader loader = new FXMLLoader(getClass().getResource("main_system_ui.fxml"));
        final Scene scene = new Scene(loader.load(), 1000, 800);
        s.setTitle("System Controller");
        s.setTitle(APP_NAME);
        s.getIcons().add(new Image(getClass().getResourceAsStream("house-icon.png")));
        s.setScene(scene);
        s.show();

        s.setOnCloseRequest(e -> {
            System.out.println("System closing...");
            // TODO: close other threads from here, or just do this:
            System.exit(0);
        });
    }
}

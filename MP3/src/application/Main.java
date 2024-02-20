package application;
	
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;


@SuppressWarnings("unused")
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Image icon = new Image("icon.png");
			primaryStage.getIcons().add(icon);
			
			
			primaryStage.setTitle("Music Player");
			
			Parent root1 = FXMLLoader.load(getClass().getResource("extension .fxml"));
			Scene scene = new Scene(root1);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			primaryStage.setResizable(false);
			primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {

				@Override
				public void handle(WindowEvent arg0) {
					Platform.exit();
					System.exit(0);
					
				}
				
			});
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

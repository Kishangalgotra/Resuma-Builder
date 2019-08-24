package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Transition.fxml"));
			Scene scene = new Scene(root,762,600);
			primaryStage.setScene(scene);
			primaryStage.centerOnScreen();
			primaryStage.setResizable(false);
			primaryStage.setTitle("RESUMA BUILDER");
			primaryStage.show();
			
		} catch(Exception e) {
	       }
	}
	public static void main(String[] args) throws InterruptedException {
		launch(args);	
	}
}

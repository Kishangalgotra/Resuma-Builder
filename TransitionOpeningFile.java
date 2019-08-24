package application;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.PathTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.util.Duration;

public class TransitionOpeningFile implements Initializable   {

	@FXML
    AnchorPane anchorpane;
	@FXML
	Button button;
	@FXML
	boolean file22;
	@FXML
	Circle circle;
	@FXML
	Circle circle3;
	@FXML
	Circle circle2;
	@FXML
	Circle circle4;
	@FXML
	Line line21;
	@FXML
	Line line11;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		@SuppressWarnings("unused")
		boolean file22=new File("C:/resuma").mkdirs();
		transition(circle, 1);
		transition(circle2,2);
		transition2(circle3,1);
		transition2(circle4,2);	}
	
	
	 void transition(Circle str,double d)
	 {
        Line line=new Line(0,364,0,-90);
		PathTransition transition =new PathTransition();
		transition.setNode(str);
		transition.setDuration(Duration.seconds(d));
		transition.setPath(line);
		transition.play();
	 }
	 
	 
	 void transition2(Circle str,double d)       {
        Line line=new Line(0,-200,0,105);
		PathTransition transition =new PathTransition();
		transition.setNode(str);
		transition.setDuration(Duration.seconds(d));
		transition.setPath(line);
		transition.play();                       }
	
	 
	 //method for Scene change
	public void second () 
	{
	 AnchorPane anchor = null;
	try {
		anchor = (AnchorPane)FXMLLoader.load(getClass().getResource("Personalinformation1.fxml"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 anchorpane.getChildren().add(anchor);	
	}
	
}

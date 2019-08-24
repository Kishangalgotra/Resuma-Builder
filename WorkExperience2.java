package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class WorkExperience2 implements Initializable {

	@FXML
	Button backbutton;
	@FXML
	Button next;
	@FXML
	Button submit;
	@FXML
	AnchorPane anchorpane;
	@FXML 
	TextArea textarea;
	@FXML
	File file;
	ReadWrite sub = new ReadWrite();
	int i=0;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		file=new File("C:\\resuma\\third.txt");
		
		try {
			if(file.createNewFile())
			{
				System.out.println("third file is created");
			}
			else
			{
				System.out.println(" third file is not created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
            try {
                hui();
            } catch (IOException ex) {
                Logger.getLogger(WorkExperience2.class.getName()).log(Level.SEVERE, null, ex);
            }
	}  
	
	//for next and previous ui
	public void fourth(ActionEvent event) throws IOException
	{
		AnchorPane anchor3=(AnchorPane)FXMLLoader.load(getClass().getResource("technicalskill.fxml"));
		anchorpane.getChildren().add(anchor3);
	}
	public void second(ActionEvent event2) throws IOException
	{
		AnchorPane anchor2=(AnchorPane)FXMLLoader.load(getClass().getResource("PersonalInformation1.fxml"));
		anchorpane.getChildren().add(anchor2);
	}
	
	//for SUBMITTING DATA
	public void submit() throws Exception 
         {
            sub.fills(file, null, textarea);
	     }
	
	//CODE FOR INITIALIZATION OF DATA TO UI
	void hui()throws IOException
	   {
           sub.get(file, null, textarea);
        }
	 	
 }

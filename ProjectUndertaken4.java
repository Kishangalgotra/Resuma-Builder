package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ProjectUndertaken4 implements Initializable {
      
	@FXML
	Button backfourth;
	@FXML
	AnchorPane anchorpane;
	@FXML
	Button next;
	@FXML
	Button submit;
	@FXML
	TextField  text1;
	@FXML
	TextArea  text2;
	@FXML
	TextArea  text3;
	File file1;
	File file2;
	File file3;
    ReadWrite sub = new ReadWrite();
        
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// TODO Auto-generated method stub
		file1 =new File("C:\\resuma\\fifth1.txt");
		file2 =new File("C:\\resuma\\fifth2.txt");
		file3 =new File("C:\\resuma\\fifth3.txt");
		try {
			if(file1.createNewFile() && file2.createNewFile() && file3.createNewFile())
                        {
                            System.out.println("file is created");
			}
			else 
			{
			    System.out.println("file is not created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                try
                {
                   read();
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
	}
	
	//function for back and forward
	
        @FXML
	 public void sixth(ActionEvent e) throws IOException
      {
  	   AnchorPane anchor=(AnchorPane)FXMLLoader.load(getClass().getResource("WorkedProjectsecondphase.fxml")); 
  	   anchorpane.getChildren().add(anchor);
       submit();
      }
        @FXML
	 public void fourth(ActionEvent e) throws IOException
      {
  	   AnchorPane anchor1=(AnchorPane)FXMLLoader.load(getClass().getResource("technicalskill.fxml")); 
  	   anchorpane.getChildren().add(anchor1);
       submit();
      }
	 
	  //DATA to be submitted 
       @FXML
       void submit() throws IOException
       {
         sub.fills(file1, text1, null);
         sub.fills(file2, null, text2);
         sub.fills(file3, null, text3);
       }
	   
	   //CODE FOR INITIALIZATION OF DATA TO FILE
	   void read() throws IOException
	    {
           sub.get(file1, text1, null);
           sub.get(file2, null, text2);
           sub.get(file3, null, text3);
	    }
  }

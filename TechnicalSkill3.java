package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
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

public class TechnicalSkill3 implements Initializable {
	@FXML
	Button backthird;
	@FXML
	AnchorPane anchorpane;
	@FXML
	Button button;
	@FXML
	TextField text1; 
	@FXML
	TextField text2;
	@FXML
	TextField text3;
	@FXML
	TextField text4;
	@FXML
	TextField text5;
	@FXML
	TextArea text6;
	@FXML
	File file1;
	@FXML
	File file2;
	@FXML
	File file3;
	@FXML
	File file4;
	@FXML
	File file5;
	@FXML
	File file6;
	@FXML
	Button submit;
	ReadWrite sub = new ReadWrite();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		
		file1 =new File("C:\\resuma\\fourth1.txt"); 
		
		
		file2 =new File("C:\\resuma\\fourth2.txt");
		
		
		file3 =new File("C:\\resuma\\fourth3.txt");
		
		
		file4 =new File("C:\\resuma\\fourth4.txt");
		
		
		file5 =new File("C:\\resuma\\fourth5.txt");
		
		
		file6 =new File("C:\\resuma\\fourth6.txt");
		
		try {
			if(file1.createNewFile() && file2.createNewFile() && file3.createNewFile() && file4.createNewFile() && file5.createNewFile() && file6.createNewFile())
			{
				System.out.println("fourth file volume is created");
			}
			else 
			{
				System.out.println("fourth  file volume is not created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}try
                {
		read();
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
		
	}
       //next and back function	
        public void fifth(ActionEvent event)throws IOException
        {
        	AnchorPane anchorth=(AnchorPane)FXMLLoader.load(getClass().getResource("Projectundertaken.fxml"));
			anchorpane.getChildren().add(anchorth);
            submit();
        }
        public void third(ActionEvent event)throws IOException
          {
        	AnchorPane anchor=(AnchorPane)FXMLLoader.load(getClass().getResource("WorkExperience2.fxml"));
		    anchorpane.getChildren().add(anchor);
            submit();
          }
        
        @FXML
        //data loading function
        void submit() throws IOException
        {
            sub.fills(file1, text1, null);
            sub.fills(file2, text2, null);
            sub.fills(file3, text3, null);
            sub.fills(file4, text4, null);
            sub.fills(file5, text5, null);
            sub.fills(file6, null, text6);	
        }
        
        void read() throws IOException
         {
            sub.get(file1, text1, null);
            sub.get(file2, text2, null);
            sub.get(file3, text3, null);
            sub.get(file4, text4, null);
            sub.get(file5, text5, null);
            sub.get(file6, null, text6);	
         }
} 
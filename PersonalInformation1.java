package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class PersonalInformation1 implements Initializable{
 
	@FXML
	TextField name;
	@FXML
	TextField contact;
	@FXML
	TextField email;
	@FXML
	TextArea address;
	@FXML
	TextField position;
	@FXML
	AnchorPane anchor2;
	@FXML
	Button button1;
	@FXML
	Button submit;
	@FXML
	boolean file21;
	@FXML 
	static File file;
	@FXML
	static File file1;
	@FXML
	static File file2;
	@FXML
	File file3;
	@FXML
	File file4;
	@FXML
               FileReader fr;	
	@FXML
	Document doc;
	@FXML
	PdfWriter writer;
              ReadWrite readwrite = new ReadWrite();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		file =new File("C:\\resuma\\file.txt");
		file1=new File("C:\\resuma\\file1.txt");
		file2=new File("C:\\resuma\\file2.txt");
		file3=new File("C:\\resuma\\file3.txt");
		file4=new File("C:\\resuma\\file4.txt");
		
		try {
		if(file.createNewFile() && file1.createNewFile() && file2.createNewFile() && file3.createNewFile() && file4.createNewFile())
			{System.out.print("second  file volume is  created");}
			else
			{System.out.println("second file volume is not created");}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
            try {
                init();
            } catch (IOException ex) {
                Logger.getLogger(PersonalInformation1.class.getName()).log(Level.SEVERE, null, ex);
            }
      }	
	
	 //FOR NEXT USER INTERFACE
     public void third() throws IOException
      {
        AnchorPane anchor=(AnchorPane)FXMLLoader.load(getClass().getResource("WorkExperience2.fxml")); 
        anchor2.getChildren().add(anchor);
        submit();
      }
          
     //for submitting data
     public void submit() throws IOException
      {   
	    readwrite.fills(file,name,null);
        readwrite.fills(file1,contact,null);
        readwrite.fills(file2,email,null);
        readwrite.fills(file3,null,address);
        readwrite.fills(file4,position,null);
      }
    
     //FOR INITIALIZING DATA ON SCREEN
     void init() throws IOException
      {
         readwrite.get(file,name,null);
    	 readwrite.get(file1,contact,null);
         readwrite.get(file2,email,null);
         readwrite.get(file3,null,address);
         readwrite.get(file4,position,null);
 	 }
   }
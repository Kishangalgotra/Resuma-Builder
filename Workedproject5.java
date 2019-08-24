package application;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.List;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.log.Logger;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Workedproject5 implements Initializable {
	PdfContentByte canvas;
	@FXML
	AnchorPane anchorpane;
	@FXML
	Button backfifth;
	@FXML
	Button button; 
	@FXML
	Button NEXTUI; 
	@FXML
	TextField text1;
	@FXML
	TextArea  text2;
	@FXML
	TextArea  text3;
	@FXML
	Button submit;
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
	File file7;
	@FXML
	File file8;
	@FXML
	File file9;
	@FXML
	File file10;
	@FXML
	File file11;
	@FXML
	File file12;
	@FXML
	File file13;
	@FXML
	File file14;
	@FXML
	File file15;
	@FXML
	File file16;
	@FXML
	File file17;
	@FXML
	File file18;
	@FXML
	String string1;
	@FXML
	String string2;
	@FXML
	String string3;
	@FXML
	Document doc;
	@FXML
	Font boldFont;
    //@FXML
    //Button button3;       
    ReadWrite sub = new ReadWrite();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	    boldFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
		file1=new File("C:\\resuma\\sixth1.txt");
		file2=new File("C:\\resuma\\sixth2.txt");
		file3=new File("C:\\resuma\\sixth3.txt");
		file4=new File("C:\\resuma\\file.txt");
		file5=new File("C:\\resuma\\file1.txt");
		file6=new File("C:\\resuma\\file2.txt");
		file7=new File("C:\\resuma\\file3.txt");
		file8=new File("C:\\resuma\\file4.txt");
		file9=new File("C:\\resuma\\fourth6.txt");
		file10=new File("C:\\resuma\\third.txt");
		file11=new File("C:\\resuma\\fourth1.txt");
		file12=new File("C:\\resuma\\fourth2.txt");
		file13=new File("C:\\resuma\\fourth3.txt");
		file14=new File("C:\\resuma\\fourth4.txt");
		file15=new File("C:\\resuma\\fourth5.txt");
		file16=new File("C:\\resuma\\fifth1.txt");
		file17=new File("C:\\resuma\\fifth2.txt");
		file18=new File("C:\\resuma\\fifth3.txt");
		try {
			if(file1.createNewFile()  && file2.createNewFile() && file3.createNewFile())
			{
			  System.out.println("sixth file is created");}
			else
			{System.out.println("sixth file not created");}
		} catch (IOException e) {
		  // TODO Auto-generated catch block
		  e.printStackTrace();
		}
                try
                 { read();}
                 catch(IOException e)
                  {}
	   }
        
	//
    @FXML
    public void fifth(ActionEvent event) throws IOException
    {
      AnchorPane anchor = (AnchorPane)FXMLLoader.load(getClass().getResource("Projectundertaken.fxml")); 
      anchorpane.getChildren().add(anchor);
    }
    
    @FXML
    public void seventh(ActionEvent e) throws IOException
    {
  	   AnchorPane anchor1=(AnchorPane)FXMLLoader.load(getClass().getResource("lastone.fxml")); 
  	   anchorpane.getChildren().add(anchor1);
    }
    
    @FXML
    void submit() throws IOException, DocumentException {
        sub.fills(file1, text1, null);
        sub.fills(file2, null, text2);
        sub.fills(file3, null, text3);
    	
    	//instructions for pdfwriting
    	doc=new Document();
    	FileOutputStream pdd = new FileOutputStream("C:\\resuma\\man.doc");
    	PdfWriter writer = PdfWriter.getInstance(doc, pdd);
    	doc.open();
    	String user = "ADDRESS";
        canvas = writer.getDirectContent();
        Rectangle rect = new Rectangle(36, 36, 559, 806);
        rect.setBorder(Rectangle.BOX);
        rect.setBorderWidth(2);
        canvas.rectangle(rect);
        
        doc.addTitle("RESUMA"); 
    	doc.add(new Phrase("\n"+" "+fileraeder(file4).toUpperCase(),FontFactory.getFont(FontFactory.COURIER_BOLD, 15)));
    	doc.add(new Paragraph("\n"));
    	doc.add(new Paragraph("    " +fileraeder(file8).toString().toUpperCase()));
    	doc.add(new Paragraph("    " +fileraeder(file5).toString().toUpperCase()));
    	doc.add(new Paragraph("    " +fileraeder(file6).toString()));
    	doc.add(new Paragraph("\n" +" "+  user +" ",FontFactory.getFont(FontFactory.COURIER_BOLD, 15)));
    	doc.add(new Paragraph("\n"));
    	ChunkFormData(file7);
    	
    	doc.add(new Paragraph("\n WORK EXPERIENCE\n\n",FontFactory.getFont(FontFactory.COURIER_BOLD, 15)));
    	
    	ChunkFormData(file10);
    	
    	doc.add(new Paragraph("\n TECHNICAL SKILLS: \n\n",FontFactory.getFont(FontFactory.COURIER_BOLD, 15)));
    	doc.add(new Paragraph("   Advanced technology   :"+"  " +fileraeder(file11)));
    	doc.add(new Paragraph("   Language known          :"+"  " +fileraeder(file12)));
    	doc.add(new Paragraph("   Operating system         :"+"  " +fileraeder(file13)));
    	doc.add(new Paragraph("   Embeded cores            :"+"  " +fileraeder(file14)));
    	doc.add(new Paragraph("   Tools technology          :"+"  " +fileraeder(file15)));
    	doc.add(new Paragraph("\n GOOD KNOWLEDGE         \n\n",FontFactory.getFont(FontFactory.COURIER_BOLD, 15) ));
    	ChunkFormData(file9);
    	//AreaBreak brea = new AreaBreak();
    	List list = new List();
    	doc.add(new Paragraph("\n\n\n PROJECT UNDERTAKEN:     \n\n",FontFactory.getFont(FontFactory.COURIER_BOLD, 15)));
    	doc.add(new Paragraph("   PROJECT NAME                    :   " +fileraeder(file16)));
    	doc.add(new Paragraph("  \n   Role description                      :   "));
    	ChunkFormData(file17);
    	doc.add(new Paragraph("  \n   Hardware used                       :   "));
    	ChunkFormData(file18);
    	doc.add(new Paragraph(" \n   SECOND PROJECT NAME       : "+fileraeder(file1)));
    	doc.add(new Paragraph(" \n   Role Description                       :"));
    	ChunkFormData(file2);
    	Rectangle rect1 = new Rectangle(36, 36, 559, 806);
        rect1.setBorder(Rectangle.BOX);
        rect1.setBorderWidth(2);
        canvas.rectangle(rect1);
    	doc.add(new Paragraph(" \n   Hardware used                           :"));
    	ChunkFormData(file3);
    	doc.close();
    	writer.close();   	
    }
    
    String fileraeder(File file) throws IOException
      {
    	 Rectangle rect = new Rectangle(36, 36, 559, 806);
         rect.setBorder(Rectangle.BOX);
         rect.setBorderWidth(2);
         canvas.rectangle(rect);
    	 String list = new String();
    	 String str=null;
    	 FileReader reader=new FileReader(file);
    	 @SuppressWarnings("resource")
	     BufferedReader buffer=new BufferedReader(reader);
    	 while((str=buffer.readLine())!=null)
    	  { list = str;}
    	  return list;
    }
    
     void file(File file) throws IOException, DocumentException {
    	 Rectangle rect = new Rectangle(36, 36, 559, 806);
         rect.setBorder(Rectangle.BOX);
         rect.setBorderWidth(2);
         canvas.rectangle(rect);
    	 String list = new String();
     	 String str=null;
     	 FileReader reader=new FileReader(file);
     	 @SuppressWarnings("resource")
 		 BufferedReader buffer=new BufferedReader(reader);
     	 while((str = buffer.readLine())!=null)
     	  { list = str;
     	    doc.add(new Paragraph("     "+list));
     	  }	
    }
     
     //Function for putting data in the chunk form
     //File passed as parameter of which data will be used
     //it returns a String in above code and print all the data followed by chunks
     void ChunkFormData(File file) throws IOException, DocumentException {
     	//String list = new String();
      	String str = null;
      	//Reader obj is used for reading data from file
      	FileReader reader = new FileReader(file);
      	@SuppressWarnings("resource")
  		BufferedReader buffer = new BufferedReader(reader);
      	while((str = buffer.readLine())!=null)
      	 {
      	   Font font = new Font();
      	   Chunk bullet = new Chunk("\u2022", font);
      	   doc.add(new Paragraph("   "+bullet+"  "+ str));
      	 }	
       } 
    
     //read function is used here fr resding data from file 
     //and putting readed data to user interfce textfield
     @FXML
     void read() throws IOException
      { sub.get(file1, text1, null);
        sub.get(file2, null, text2);
        sub.get(file3, null, text3);}
  }

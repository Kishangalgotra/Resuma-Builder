
package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ReadWrite {
    
	///FOR writing the content to file
     void fills(File file,TextField text,TextArea text2) throws IOException
       {
         String temp ;
         FileWriter writer = new FileWriter(file);
         if(text != null)
         {
             temp = text.getText();
             System.out.println(temp);
             writer.write(temp);
             writer.close();
         }
         else
         {
             temp = text2.getText();
             writer.write(temp);
             writer.close();
         }   
     }
     
     //For reading data from file and showing them in software
     void get(File file,TextField text ,TextArea text2) throws IOException
     {
         FileReader reader = new FileReader(file);
         BufferedReader brw =new BufferedReader(reader);
         String scurrent ;
         if(text != null)
         {
           while((scurrent = brw.readLine() ) != null)
           {
             text.appendText(scurrent);
           }
         }
         else
           {
             while((scurrent = brw.readLine() ) != null)
              {
                text2.appendText(scurrent);
                text2.appendText("\n");
              }
         }   
                      try
                         {
                          if(brw == null) 
                              brw.close();
             
                          if(reader == null)
                              reader.close();
                         }
                     catch(IOException e){
       }
                 
     }
     
}

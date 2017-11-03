/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

/**
 *
 * @author usuario
 */
public class Kata4 {
   

    /**
     * @param args the command line arguments
     */
    private List<Mail> mailList;
    private Histogram<String> histogram;
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        Kata4 kata4 =  new Kata4();
        kata4.execute();
 
    }
    
    public void execute() throws FileNotFoundException, IOException{
        input();
        process();
        output();
    }
    private void input() throws FileNotFoundException, IOException{
        String filename = "C:\\Users\\usuario\\Desktop\\emails.txt";
        mailList = MailListReader.read(filename);  
    }
    
    private  void process(){
       
        histogram = MailHistogramBuilder.build(mailList);
    }
    private void output(){
         HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
}

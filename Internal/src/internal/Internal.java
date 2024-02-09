/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package internal;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author micha
 */
public class Internal {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
    UIManager.setLookAndFeel( new com.formdev.flatlaf.FlatLightLaf() );
} catch( UnsupportedLookAndFeelException ex ) {
    System.err.println( "Failed to initialize LaF" );
}
         Ingridient[] ing=initialiseIngridients();
         Excercise[] exc=initialiseExcercises();
         Person user = initialiseUser() ;
         System.out.print(user);
         Frame frame = new Frame(ing,exc,user);
         frame.setVisible(true);
      

    }
         public static Ingridient[] initialiseIngridients(){
        Ingridient[] ing=null;
        StringTokenizer st = null;
        StringTokenizer st2 = null;
        BufferedReader br = null;
        String line ;
        int i=0 ;
        try {
         
            br = new BufferedReader(new FileReader(new File("..\\Internal\\resources\\ingridients\\dataIngridients.txt")));
            
        }
        catch(FileNotFoundException fnfe) {
        }
        try {
            if((line=br.readLine())==null){ 
                JOptionPane.showMessageDialog(null,"Data File is empty!");
            
            }
            else { 
                int size = Integer.parseInt(line.substring(0,line.indexOf("@")));
                ing = new Ingridient[size];
            }
            
            while((line=br.readLine())!=null) { 
                st2= new StringTokenizer(line, "@");
                st2.nextToken();
                
                 ing[i]=new Ingridient() ;
                st= new StringTokenizer(line, "@");
                
              st.nextToken();
                ing[i].setName(st.nextToken());
                ing[i].setEnergy(Short.parseShort(st.nextToken()));
                ing[i].setProtein(Float.parseFloat(st.nextToken().replace(",",".")));
                ing[i].setCarbohydrates(Float.parseFloat(st.nextToken().replace(",",".")));
                ing[i].setSugars(Float.parseFloat(st.nextToken().replace(",",".")));
                ing[i].setFat(Float.parseFloat(st.nextToken().replace(",",".")));
                i++;
                
            }
            
        }
        catch (NullPointerException | IOException npe) {               
        }
                
        return Arrays.copyOf(ing, i);
    }



public static Excercise[] initialiseExcercises() {
          
        StringTokenizer st = null; //string tokenizer initialisation
        BufferedReader br = null; //buffere reader initialisation
        String line ;
        Excercise [] exc = null; // an array of excercise class objects is initialised
        int i=0 ;
        try {
            br = new BufferedReader(new FileReader(new File("..\\Internal\\resources\\excercises\\dataExcercises.txt"))); // feed buffered reader the text file with data    
        }
        catch(FileNotFoundException fnfe) { //exception is caught if there is no data file
            JOptionPane.showMessageDialog(null,fnfe.getMessage()); 
        }
        try {
            if((line=br.readLine())==null){ //assigne variable "line" first line from buffered reader at the same time checking if the file is not empty
                JOptionPane.showMessageDialog(null,"Data File is empty!"); // if the data file is empty the user is notified 
                System.exit(1); // termination with positive error code
            }
            else { 
                int size = Integer.parseInt(line); // datafile is structured such that the first line is the number of objetcts stored in the file
                exc = new Excercise[size]; // An array is given appropriate size
            }
           
            while((line=br.readLine())!=null) { // iterate over each line in the file fetching the data from buffered reader to the variable "line"
                st= new StringTokenizer(line, " "); //split lines according to established format 
                st.nextToken(); // first token is an index so get next token
                exc[i]=new Excercise() ; // create new object in array
                exc[i].setEnergy(Float.parseFloat(st.nextToken()));  // set the appropirate value for the field of the object
                String name="" ; 
                while(st.hasMoreTokens()){ // get the name of the object
                name+=st.nextToken()+" ";
                }
                exc[i].setName(name); // set the name of the object
                i++; // increment the index of the array
             
            }   
        }
        catch (NullPointerException | IOException npe) { //exception is caught if buffered reader points to null      
            JOptionPane.showMessageDialog(null, npe.getMessage());
        }
                
        return Arrays.copyOf(exc, i); // return the array with data 
    }

    public static Person initialiseUser() {
        StringTokenizer st = null;
        BufferedReader br = null;
        String line ;
        Person p= new Person();
        try {
         
            br = new BufferedReader(new FileReader(new File("..\\Internal\\resources\\user_data\\user_data.txt")));
            
        }
        catch(FileNotFoundException fnfe) {
            return p;
        }
       

            
        try {
            st= new StringTokenizer(br.readLine(),",");
        } catch (IOException ex) {
            Logger.getLogger(Internal.class.getName()).log(Level.SEVERE, null, ex);
        }
                p.setAge(Short.parseShort(st.nextToken()));
                System.out.print(p.getAge());
                p.setTarget(Float.parseFloat(st.nextToken()));
                p.setWeight(Float.parseFloat(st.nextToken()));
                p.setHeight(Short.parseShort(st.nextToken()));
                p.setGender(Boolean.parseBoolean(st.nextToken()));
                p.recalculateBMR();
             
            
            
            
            
        return p;
    }

}

    
    



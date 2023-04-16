import java.io.*;
import java.util.*;
import java.lang.*;
public class Files{
   public static void main(String[] args){
      final Formatter x;
      try{
         x = new Formatter("Zia.txt");// check if the file exist, creates if not
         System.out.println("File has been created!");
      }
      catch(Exception e){
         System.out.println("You got an error");
      }
      
      File y = new File("Zia.txt");
      if (y.exists())// check if the file exist 
         System.out.println(y.getName() + " exist!");
      else 
      System.out.println("File does not exist");
   }
}
import java.util.*; 
import java.io.*;

class Main {  
  public static String SimpleSymbols(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       
    if(str.matches("([+=0-9]*(([+][a-z])*[+])[+=0-9]*)*"))
        return "true";
    return "false";
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(SimpleSymbols(s.nextLine())); 
  }   
  
}
import java.util.*; 
import java.io.*;

class Main {  
  public static int PentagonalNumber(int num) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       
    return 1+5*((num-1)*num/2);
    
  }
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(PentagonalNumber(s.nextLine())); 
  }   
  
}
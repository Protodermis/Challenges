import java.util.*; 
import java.io.*;

class Main {  
  public static String LetterCapitalize(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    String s = "";
    for(int i=0; i < str.length(); i++){
        char c = str.charAt(i);
        if((c >= 97 && c <= 122) && (i == 0 || str.charAt(i-1) == ' '))
            s += (char) (c - 32);
        else
            s += c;
    }
    return s;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterCapitalize(s.nextLine())); 
  }   
  
}
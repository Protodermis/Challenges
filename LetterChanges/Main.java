import java.util.*; 
import java.io.*;

class Main {  
  public static String LetterChanges(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    
    String s = "";
    for(int i=0; i < str.length(); i++) {
        char c = str.charAt(i);
        if(c == 'z')
            s += 'A';
        else if(c == 'd' || c == 'h' || c == 'n' || c == 't')
            s += (char) (c - 31);
        else if(c >= 'a' && c < 'z')
            s += (char) (c + 1);
        else s+= c;
    }
    return s;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterChanges(s.nextLine())); 
  }   
  
}
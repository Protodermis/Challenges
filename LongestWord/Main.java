import java.util.*; 
import java.io.*;

class Main {  
  public static String LongestWord(String sen) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    char[] array = sen.toCharArray();
    int len = 0, maxLen = 0, index = 0, maxIndex = 0;
    
    for(int i = 0; i < sen.length(); i++){
        char c = array[i];
        
        if(c > 48 && c < 58 || c > 64 && c < 91 || c > 96 && c < 123) {
            if(len==0) index = i;
            len++;
        } else {
            if(len > maxLen){
                maxLen = len;
                maxIndex = index;
            }
            len = 0;
        }
    }
    if(len > maxLen) {
        maxLen = len;
        maxIndex = index;
    }
    sen = sen.substring(maxIndex, maxIndex+maxLen);   
    return sen;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }   
  
}
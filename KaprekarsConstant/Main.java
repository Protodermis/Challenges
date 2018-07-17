import java.util.*; 
import java.io.*;

class Main {  
  
  public static int KaprekarsConstant(int num) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    int rounds = 0;
    while(num != 6174) {
        rounds++;
        while(num < 1000)  // add zeroes
            num *= 10;
        char[] numArray = String.valueOf(num).toCharArray();
        Arrays.sort(numArray);
        int orderedNum = Integer.parseInt(String.valueOf(numArray));
        StringBuilder sb = new StringBuilder (String.valueOf(numArray));
        num = Integer.parseInt(sb.reverse().toString());
        num -= orderedNum;
    }
    
    return rounds;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(KaprekarsConstant(s.nextLine())); 
  }   
  
}
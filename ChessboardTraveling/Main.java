import java.util.*; 
import java.io.*;

class Main {  
  public static int ChessboardTraveling(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    
    int x = str.charAt(1);
    int y = str.charAt(3);
    int a = str.charAt(6);
    int b = str.charAt(8);
    int passes = a-x+1;
    int[] solutionCalc = new int[b-y+1];
    solutionCalc[0] = 1;
    for(int i=0; i<passes; i++) {
        for(int j=1; j<solutionCalc.length; j++) {
            solutionCalc[j] = solutionCalc[j] + solutionCalc[j-1];
        }
    }
    
    return solutionCalc[b-y];
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ChessboardTraveling(s.nextLine())); 
  }   
  
}
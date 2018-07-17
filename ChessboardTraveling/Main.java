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
    int[][] solutionTab = new int[a-x+1][b-y+1];
    
    for(int i=0; i<solutionTab.length; i++) {
        for(int j=0; j<solutionTab[i].length; j++) {
            if(i == 0 || j == 0) {
                solutionTab[i][j] = 1;
                continue;
            }
            solutionTab[i][j] = solutionTab[i-1][j] + solutionTab[i][j-1];
        }
    }
    
    return solutionTab[a-x][b-y];
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ChessboardTraveling(s.nextLine())); 
  }   
  
}
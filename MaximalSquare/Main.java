import java.util.*; 
import java.io.*;

class Main {  
  public static int MaximalSquare(String[] strArr) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    int maxSize = 1;
    
    for(int i=0; i<strArr.length-1; i++) {
        for(int j=0; j<strArr[i].length()-1; j++) {
            
            int curSize = getSquareSize(strArr, i, j);
            if(curSize>maxSize)
                maxSize = curSize;
        }
    }
    
    return maxSize*maxSize;
    
  }
  
  /* Returns the side length of the square whse upper left corner
     is defined by i and j */
  public static int getSquareSize(String[] strArr, int i, int j) {
    char c = strArr[i].charAt(j);
    int squareSize = 1;
    
    for(int m=1; m+i<strArr.length && m+j<strArr[i].length(); m++) {
        for(int n=0; n<m; n++) {
            if(c==strArr[i+m].charAt(j+n) && c==strArr[i+n].charAt(j+m)) 
                continue;
            else return squareSize;
        }
        
        if(c==strArr[i+m].charAt(j+m))
            squareSize++;
        else return squareSize;
    }
    
    return squareSize;
  }
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(MaximalSquare(s.nextLine())); 
  }   
  
}
import java.io.*;
import java.util.*;

public class Nim
{
    public static void main( String[] args )
  {
    int stones = 12;
    int stonesTaken;

    Scanner input = new Scanner(System.in);

    //loop until game ends
    while(stones > 0){
    //prompt user for input: num of stones
    System.out.println("How many stones would you like to remove (1, 2, or 3)?");
    stonesTaken = input.nextInt();
    stones -= stonesTaken;
    System.out.println("Stones remaining " + stones);
      //calculate # of stones remaining, print
    if(stones == 0){
      System.out.println("You win!");
    }
    //check for win
    
    //machine turn
      
    //calculate # of stones remaining, print

    //check for win
    
  }
  }
}
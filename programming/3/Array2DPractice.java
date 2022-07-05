import java.io.*;
import java.util.*;

/**
 * Array2DPractice by Team LucidThinkeren
 * Ed Hawkins
 * collaborators: Maxwell (Maxwoodi), Latoya (BolandTech)
 */

/**
   INSTRUCTIONS:
   Place this file in a folder named programming/3/.
   This file contains the following completed method. Use it as a model
   to help you with the other methods:
   - buildBoard
   This file also contains stubs (empty methods) for the following
   methods (split into 3 levels):
   Basic level (complete all):
   - printBoard *
   - copyBoard *
   Intermediate level (complete Basic methods plus this method):
   - explodeSquare *
   Advanced level (complete Basic + Intermediate + these two methods):
   - explodeAllChar *
   - downString
   The routines with the * will be particularly helpful for the
   Conway's Game of Life project that you'll work on after this one.
*/


/**
   creates and returns a 2D array of size rowsxcols chars. All elements
   in the 2D array will be set to the char value.
   Ex: buildBoard(3,4,'x') will return this 2D array:
   xxxx
   xxxx
   xxxx
   xxxx
   Use this completed method as an example to help you with some of the
   other methods.
*/

public class Array2DPractice
{
  public static char[][] buildBoard( int rows, int cols, char value )
  {
    char[][] board = new char[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        board[i][j]=value;
      }
    }
    return board;
  }

  /**
     pretty prints a 2D array of characters
     This should print the array as a grid
  */
  public static void printBoard( char[][] board )
  {
    /* MAX WROTE PRINT BOARD - AWESOME!!! */
    for(int row = 0; row < board.length; row++)
      {
        for(int col = 0; col < board[row].length; col++)
          {
           System.out.print(board[row][col]+" ");
           
          }
      System.out.println();
      }
  }

  /**
     Parameters:
     board - a 2D array of char
     row - the row you want to set
     value - the value to set all the elements in row
     Returns:
     Nothing
     Change the 2D array board so that all the elements in the
     specified row are set to value.
     Ex: Given array:
     xxxx
     xxxx
     xxxx
     xxxx
     setRow(board,2,'@') will change board to
     xxxx
     xxxx
     @@@@
     xxxx
  */
  public static void setRow( char[][] board, int row, char value )
  {
    /* MAX WROTE SET ROW - AWESOME!!! */
    for(int col = 0; col < board[row].length; col++)
      {
        board[row][col] = value;
      }
  }


  /**
     creates and returns a new 2D array of char the same size as
     original and copies all the elements
  */
  public static char[][] copyBoard( char[][] original )
  {
    /* MAX WROTE COPY BOARD - AWESOME!!! */
    char[][] new2DArray = new char[original.length][original[0].length];

    for(int r = 0; r < original.length; r++)
      {
      for(int col = 0; col < original[r].length; col++)
        {
          new2DArray[r][col] = original[r][col];
        
        } 
      }
    return new2DArray;
  }


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board
     Returns:
     nothing
     A location in a 2D array can be though of as having 6
     neighbors.  In the below 2D array, the neighbors of the element
     marked Q are the numbered elements.
     oooooo
     o123oo
     o4Q5oo
     o678oo
     oooooo
     This method should change all the neighbor cells (elements) to an X
     but not change the element at row,col
     Ex:
     Given the 2D array
     QQQQQ
     QQQQQ
     QQQQQ
     QQQQQ
     explodeSquare(board,1,1) will change the array to
     XXXQQ
     XQXQQ
     XXXQQ
     QQQQQ
     Note: Make sure to correctly handle the cases when you try
     to explode an element on the edges.
  */
  public static void explodeSquare( char[][] board, int row, int col )
  {
    /* YOUR AWESOME CODE HERE */
  int lowRow = row-1;
  int highRow = row+1;
  int lowCol = col-1;
  int highCol = col+1;
  if (row==0){lowRow=row;
            }
  if (row==board.length-1){highRow=row;
                         }
  if (col==0){lowCol=col;
            }
  if (col==board[0].length-1){highCol=col;
                     }
   for(int r = lowRow; r <= highRow; r++)
      {
        for(int c = lowCol; c <= highCol; c++)
          {
            if( r!= row || c != col)
            {
             board[r][c] = 'X';
            }
          } 
      }
    
  }

  /**
     This method will search through the 2D array board and it will
     explode each square that contains the char c (using the above
     definition of exploding).
     Example:
     Given the array
     qXzXq
     qXXXq
     qqqqq
     XXXqq
     XzXqq
     XXXXX
     qqqXz
     explodeAllchar(board,'z') will change board to:
  */
  public static void explodeAllChar(char[][] board, char c)
  {
    /* YOUR AWESOME CODE HERE */
  }


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board
     word - a String that you want to insert into the board.
     This will insert the parameter word into board in the downward
     direction. See examples below
     Example:
     Given this array
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     downString(board,1,1,"Hello") will change board to:
     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxxxx
     xOxxxx
     xxxxxx
     Given the above array, downString(board,4,3,"World") will
     change board to:
     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxWxx
     xOxOxx
     xxxRxx
     Note that the method has to stop at the bottom of the array.
  */
  public static void downString( char[][] board, int row, int col, String word )
  {
    /* YOUR AWESOME CODE HERE */
  }


  public static void main( String[] args )
  {
    char[][] b = buildBoard(5,10,'z');
    printBoard(b);
    //setRow(b,2,'M');
    System.out.println();
    printBoard(b);
    System.out.println();
    explodeSquare(b,2,2);
    printBoard(b);
    System.out.println();
    explodeSquare(b,0,2);
    printBoard(b);
    System.out.println();
    explodeSquare(b,2,9);
    printBoard(b);
    System.out.println();
    explodeSquare(b,0,0);
    printBoard(b);
    System.out.println();
    explodeSquare(b,4,9);
    printBoard(b);
    System.out.println();
    /*
      Note, you can directly set elements in the board
      using array notation like b[3][2]='z' and you
      can use array notation to also access individual
      elements
    */
  }
}
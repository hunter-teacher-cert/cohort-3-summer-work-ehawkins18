import java.io.*;
import java.util.*;


/**
 * Time class by Team Timex
 * Ed Hawkins
 * collaborators: Thea, Elizabeth, Chris
 */

/**
   INSTRUCTIONS:
   This file contains the Driver starter code for our Time class.
   
   Add code in main to test all your methods
   
   Place this file in a folder named programming/5/Driver.java
*/

public class Driver {

  public static void main(String[] args) {

  	//declare a var of appropriate type to assign an instance of Time to
  	Time t1;
  
  	//assign var the address of a newly-apportioned Time object
  	t1 = new Time();

    //declare & assign a specific time
    Time t2 = new Time(14, 45, 30);

    //print out t1 and t2 
    System.out.println("Time t1 is: " + t1);
    System.out.println("Time t2 is: " + t2);

    //Check if t1 and t2 are the same
    System.out.println("Are t1 & t2 the same? " +  t1.equals(t2));

    //Add some time to t1
    t1.add(new Time(2, 30, 45));
    System.out.println("After adding 2 hr, 30 min, and 45 sec, t1 is: " + t1);

    //Compare t1 and t2
    System.out.println("The difference between t1 and t2 is " +  t1.compareTo(t2)+" sec.");

    //Add some time to t1
    t1.add(new Time(10,50,8));
    System.out.println("After adding 10 hours, 50 min, and 8 sec, t1 is: " + t1);

    //Check if t1 and t2 are equal
    System.out.println("Does t1 equal t2? " +  t1.equals(t2));
     
  }//end main()

}//end class
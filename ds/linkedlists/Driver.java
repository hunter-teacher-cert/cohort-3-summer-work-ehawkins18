import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    //System.out.println("running");
    l.add("five");
    l.add("four");
    l.add("three");
    l.add("two");
    l.add("one");
    l.add("zero");
    System.out.println();
    System.out.println("The list is:");
    System.out.println(l);
    System.out.println();
    System.out.print("The size of the list is: ");
    System.out.println(l.size());
    System.out.println();
    System.out.print("The index of 'four' is: ");
    System.out.println(l.indexOf("four"));
    System.out.println();
    System.out.print("The value at index 3 is: ");
    System.out.println(l.get(3));
    System.out.println();
    System.out.println("Add value '2.5' at index 3:");
    l.add(3,"2.5");
    System.out.println(l);
    System.out.println();
    System.out.println("Remove the value at index 3:");
    l.remove(3);
    System.out.println(l);
    System.out.println();
    System.out.println("Call toArray() and print the array:");
    String array[];
    array = new String [l.size()];
    array = l.toArray();
    System.out.print("[");
    for(int i=0;i<(l.size()-1);i++){
      System.out.print(array[i]+", ");
    }
    System.out.print(array[(l.size()-1)]+"]");
    
  }
}
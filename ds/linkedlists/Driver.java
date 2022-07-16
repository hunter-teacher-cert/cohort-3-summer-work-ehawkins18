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
    System.out.println(l);
    //System.out.println("printed l");
    System.out.println(l.size());
    System.out.println(l.indexOf("five"));
    System.out.println(l.indexOf("one"));
    System.out.println(l.get(3));
    l.add(3,"2.5");
    System.out.println(l);
    l.remove(3);
    System.out.println(l);
  }
}
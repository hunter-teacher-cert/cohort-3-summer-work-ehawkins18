import java.io.*;
import java.util.*;

public class Driver {

  public static void main(String[] args) {

	
	Stack s = new Stack();
  System.out.println(s.isEmpty());
  System.out.println(s.pop());
  s.push(0);
  s.push(1);
  s.push(2);
  System.out.println(s);
  System.out.println("Size = " + s.size());
  System.out.println(s.top());
  System.out.println(s.pop());
  System.out.println(s.top());
  System.out.println("Size = " + s.size());
  System.out.println(s.isEmpty());
	System.out.println();
  Queue q = new Queue();
  System.out.println(q.isEmpty());
  System.out.println(q.dequeue());
  q.enqueue(0);
  q.enqueue(1);
  q.enqueue(2);
  System.out.println(q);
  System.out.println("Size = " + q.size());
  System.out.println(q.front());
  System.out.println(q.dequeue());
  System.out.println(q.front());
  System.out.println("Size = " + q.size());
  System.out.println(q.isEmpty());


    
  }
  
}
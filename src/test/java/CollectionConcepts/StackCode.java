package CollectionConcepts;

import java.util.Stack;

public class StackCode {
    public static void main(String[] args) {
/**
 * How to implement a Stack in Java
 * Every programming language comes with basic functionality for stacks. However, in Java,
 * the stack data type is an Adapter class. This means that it is built on top of other data structures.
 * Therefore, it can be implemented using an Array, Vector, Linked List, or any other collection.
 * Note: Stacks are generally implemented using Arrays because it takes less memory.
  */
        Stack<String> s=new Stack<>();
        s.push("Vishal");
        s.push("Lavkush");
        s.push("Aman");
        s.push("Shiva");
        System.out.println(s);//[Vishal, Lavkush, Aman, Shiva]
        System.out.println(s.peek());//Shiva because Shiva is on top
        System.out.println(s.search("Aman"));// at 2 index because stack indexes starts from 1 (It works like bottom to top)
        System.out.println(s.pop());//Shiva because Shiva is top it follows First come last out
    }
}

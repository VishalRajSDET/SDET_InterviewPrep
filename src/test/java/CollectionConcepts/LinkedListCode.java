package CollectionConcepts;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListCode {
    public static void main(String[] args){
        LinkedList<String> l=new LinkedList<>();
        l.add("Vishal");
        l.add("Aman");
        l.add("Shiva");
        l.set(1,"Ram");
        System.out.println(l);
        System.out.println(l.get(2));
      //  l.remove();// It will remove first element
        System.out.println(l);
      //  l.remove(1);//It will remove index 1 element or also we can use remove(object)-> it will remove specific ele
        System.out.println("Before sort"+l);
        Collections.sort(l);
        System.out.println("After sort :"+l);
      /*  -------------------------------------------------------------------

      LinkedList is same as arrayList -->Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
                Method    	Description
        addFirst()	-->  Adds an item to the beginning of the list
        addLast()	--> Add an item to the end of the list
        removeFirst() --> Remove an item from the beginning of the list
        removeLast() --> Remove an item from the end of the list
        getFirst()	--> Get the item at the beginning of the list
        getLast()	--> Get the item at the end of the list*/
    }
}

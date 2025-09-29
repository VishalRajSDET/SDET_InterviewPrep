package CollectionConcepts;

import java.lang.reflect.Array;
import java.util.*;

public class QueueCode {
    public static void main(String[] args) {
        /**
         * The most common queue implementation is using Arrays, but it can also be implemented using
         * Linked Lists or by starting from a Stack. We can import the queue interface with this command:
         * Queue<String> str_queue = new LinkedList<> ();
         */
        Queue<String> queue = new ArrayDeque<>();
        queue.add("Vishal");
        queue.add("Aman");
        queue.add("Shiva");
        queue.add("Lavkusk");
        System.out.println(queue);//
        System.out.println(queue.peek());//Vishal
        System.out.println(queue.element());//Vishal -> the head of this queue
        System.out.println(queue.offer("Aman"));//true -> {@code true} if the element was added to this queue
        System.out.println(queue.poll());//Vishal -> the head of this queue, or {@code null} if this queue is empty
        System.out.println(queue.remove());//Aman --> becuase Vishal was head and he got removed that is why Amn=an is now head--> remove return head


    }
}

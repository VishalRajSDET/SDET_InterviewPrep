package JavaCoding.LinkedListCode.ReverseLinkedListCode;

/**
 *
 */
class ListNode {
    ListNode next;
    int val;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(20);
        ListNode node3 = new ListNode(30);
        ListNode node4 = new ListNode(40);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println("List before reverse.......");
        printList(node1);

        System.out.println("List after reverse.......");
        ListNode newNode= reverseList(node1);
        printList(newNode);

    }

    public static void printList(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " -> ");
            cur = cur.next;
        }
        System.out.println("null");
    }

    public static ListNode  reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = pre;  //connecting with previous node
            pre = cur; // now pre is currentNode
            cur = curNext; // now currentNode is next of itself

        }
        return pre;
    }
}

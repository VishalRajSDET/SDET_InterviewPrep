package JavaCoding.LinkedListCode.MergeTwoSortedLinkedLists;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MergeTwoSortedLinkedLists {
    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);

        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode listNode4 = new ListNode(3);
        ListNode listNode5 = new ListNode(4);
        ListNode listNode6 = new ListNode(5);

        listNode4.next = listNode5;
        listNode5.next = listNode6;

        ListNode mergeSorted = mergeSortedList(listNode1, listNode4);
        //now print merged sorted list
        printList(mergeSorted);
    }

    /**
     * This is recursion approach
     *
     * @param head1
     * @param head2
     * @return
     */
//    public static ListNode mergeSortedList(ListNode head1, ListNode head2) {
//
//        if (head1 == null || head2 == null) {
//            return head1 == null ? head2 : head1;
//        }
//        if (head1.val <= head2.val) {
//            head1.next = mergeSortedList(head1.next, head2);
//            return head1;
//        } else {
//            head2.next = mergeSortedList(head1, head2.next);
//            return head2;
//        }
//    }

    /**
     * Iterative approach
     *
     * @param head1
     * @param head2
     * @return
     */
    public static ListNode mergeSortedList(ListNode head1, ListNode head2) {
        // You can put -1, 0, 999, anything here
        ListNode dummy = new ListNode(-1);  // or new ListNode(0)
        ListNode current = dummy;

        if (head1 == null || head2 == null) {
            return head1 == null ? head2 : head1;
        }
        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }
        if (head1 != null) {
            current.next = head1;
        }
        if (head2 != null) {
            current.next = head2;
        }
        return dummy.next;//skip dummy
    }

    public static void printList(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " -> ");
            cur = cur.next;
        }
        System.out.println("null");
    }
}

package JavaCoding.LinkedListCode.DetectCycle;

class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class DetectCycle {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

// Link them: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        //  Create cycle: 6 -> 4
        node6.next = node4;

        // Detect cycle
        ListNode cycleStart = detectCycle(node1);
        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle");
        }

       System.out.println("Cycle detected :"+ hasCycle(node1));
    }

    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; // start of cycle
            }
        }
        return null; // no cycle
    }

    public static boolean hasCycle(ListNode head){
        ListNode slow=head;
        ListNode fast=slow;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true; // cycle detected
            }
        }
        return false;
    }

}

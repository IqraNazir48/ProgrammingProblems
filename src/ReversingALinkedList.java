import java.util.List;

public class ReversingALinkedList {
    public static ListNode reverseList(ListNode head){
        ListNode current=head;
        ListNode previous=null;
        while(current.next!=null) {
            previous = current.next;
            current.next = previous.next;
            previous.next = head;
            head = previous;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode n0=new ListNode(1);
        ListNode n1=new ListNode(2);
        ListNode n2=new ListNode(3);
        ListNode n3=new ListNode(4);
        ListNode n4=new ListNode(5);

        n0.next=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        System.out.print("Before: ");
        ListNode.display(n0);
        System.out.println();
        System.out.print("After: ");
        ListNode reversedList=reverseList(n0);
        ListNode.display(reversedList);
        System.out.println();
    }
}

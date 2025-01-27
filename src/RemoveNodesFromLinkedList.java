import java.util.ArrayList;

public class RemoveNodesFromLinkedList {
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

    public static ListNode removeNodes(ListNode head){
        head=reverseList(head);
        int maximum=head.val;
        ListNode current=head;
        ListNode previous=current.next;
        while(current.next!=null){
            if(previous==null){
                current.next=null;
                continue;
            }
            if(previous.val<maximum){
                previous=previous.next;
                continue;
            }
            maximum=previous.val;
            current.next=previous;
            current=current.next;
            previous=current.next;
        }
        return reverseList(head);
    }
    public static void main(String[] args) {
        ListNode n0=new ListNode(5);
        ListNode n1=new ListNode(2);
        ListNode n2=new ListNode(13);
        ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(8);

        n0.next=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        System.out.print("Before: ");
        ListNode.display(n0);
        System.out.println();
        System.out.print("After: ");
        ListNode result=removeNodes(n0);
        ListNode.display(result);
        System.out.println();
    }
}

import java.util.List;

public class MiddleOfTheLinkedList {
    public static ListNode middleNode(ListNode head) {
        ListNode current=head;
        int length=0;
        while(current!=null){
            length+=1;
            current=current.next;
        }
        int index=(length/2)+1;
        ListNode pointer=head;
        int i=1;
        while(i<index){
            pointer=pointer.next;
            i++;
        }
        return pointer;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode first=new ListNode(2);
        ListNode second=new ListNode(3);
        ListNode third=new ListNode(4);
        ListNode fourth=new ListNode(5);

        head.next=first;
        first.next=second;
        second.next=third;
        third.next=fourth;

        ListNode result=middleNode(head);
        ListNode.display(result);
    }
}

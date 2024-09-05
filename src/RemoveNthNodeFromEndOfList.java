import java.util.List;

public class RemoveNthNodeFromEndOfList {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int length=0;
        ListNode current=head;
        while(current!=null){
            length+=1;
            current=current.next;
        }
        int index=length-n;
        if(index==0){
            return head.next;
        }
        ListNode current1=head;
        int i=0;
        while(current1!=null){
            if(i+1==index){
                current1.next=current1.next.next;
                break;
            }
            current1=current1.next;
            i+=1;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head =new ListNode(1);
        ListNode n1=new ListNode(2);
        ListNode n2=new ListNode(3);
        ListNode n3=new ListNode(4);
        ListNode n4=new ListNode(5);

        head.next=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        int n=2;
        System.out.print("Before: ");
        ListNode.display(head);
        System.out.print("After: ");
        ListNode result=removeNthFromEnd(head,n);
        ListNode.display(result);
    }
}

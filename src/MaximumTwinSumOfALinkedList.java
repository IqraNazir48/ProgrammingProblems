import java.util.List;

public class MaximumTwinSumOfALinkedList {
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
    public static int pairSum(ListNode head) {
        ListNode current=head;
        int length=0;
        while(current!=null){
            length+=1;
            current=current.next;
        }
        ListNode current1=head;
        for(int i=0;i<(length/2)-1;i++){
            current1=current1.next;
        }
        ListNode list2=current1.next;
        current1.next=null;

        list2=reverseList(list2);
        ListNode c1=head;
        int maximum=-11111;
        while(c1!=null){
            int value=c1.val+list2.val;
            if(value>maximum){
                maximum=value;
            }
            c1=c1.next;
            list2=list2.next;
        }
        return maximum;
    }

    public static void main(String[] args) {
        ListNode n0=new ListNode(5);
        ListNode n1=new ListNode(4);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(1);

        n0.next=n1;
        n1.next=n2;
        n2.next=n3;
        System.out.print("Maximum twin sum of list: ");
        System.out.println(pairSum(n0));
        System.out.println();
    }
}

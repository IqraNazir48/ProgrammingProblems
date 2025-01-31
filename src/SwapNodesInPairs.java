public class SwapNodesInPairs {
    public static ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode current=head;
        ListNode previous=null;
        while( current!=null && current.next!=null){
            ListNode temp=current.next;
            current.next=temp.next;
            temp.next=current;
            if(previous==null){
                head=temp;
            }
            else{
                previous.next=temp;
            }
            previous=current;
            current=current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode n1=new ListNode(5);
        ListNode n2=new ListNode(7);
        ListNode n3=new ListNode(9);
        ListNode n4=new ListNode(15);
        ListNode n5=new ListNode(12);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        System.out.print("Before swapping: ");
        ListNode.display(n1);
        ListNode result=swapPairs(n1);
        System.out.print("After swapping: ");
        ListNode.display(result);
        System.out.println();
    }
}

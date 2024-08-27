public class DeleteTheMiddleNodeOfALinkedList {
    public static ListNode deleteMiddle(ListNode head) {
        ListNode current=head;
        int length=0;
        while(current!=null){
            length+=1;
            current=current.next;
        }
        int index=length/2;
        ListNode current1=head;
        int count=0;
        while(current1!=null){
            if(count+1==index){
                current1.next=current1.next.next;
                return head;
            }
            current1=current1.next;
            count++;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode first=new ListNode(2);
        ListNode second=new ListNode(3);
        ListNode third=new ListNode(4);

        head.next=first;
        first.next=second;
        second.next=third;
        System.out.print("Before: ");
        ListNode.display(head);
        System.out.print("After: ");
        ListNode result=deleteMiddle(head);
        ListNode.display(result);
    }
}

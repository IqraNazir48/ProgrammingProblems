public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode result=new ListNode(head.val);
        ListNode temp=result;
        ListNode current=head;
        while(current!=null){
            if(current.val!=temp.val){
                temp.next=new ListNode(current.val);
                temp=temp.next;
            }
            current=current.next;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode first=new ListNode(1);
        ListNode second=new ListNode(2);
        ListNode third=new ListNode(3);
        ListNode fourth=new ListNode(3);

        head.next=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        System.out.print("Before: ");
        ListNode.display(head);
        System.out.print("After: ");
        ListNode result=deleteDuplicates(head);
        ListNode.display(result);
    }
}

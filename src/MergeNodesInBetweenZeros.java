public class MergeNodesInBetweenZeros {
    public static ListNode mergeNodes(ListNode head) {
        ListNode result=new ListNode(0);
        ListNode temp=result;
        ListNode current=head;
        int sum=0;
        while(current!=null){
            if(current.val==0){
                if(sum!=0){
                    temp.next=new ListNode(sum);
                    temp=temp.next;
                    sum=0;
                }
            }
            else{
                sum+=current.val;
            }
            current=current.next;
        }
        return result.next;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(0);
        ListNode first=new ListNode(1);
        ListNode second=new ListNode(0);
        ListNode third=new ListNode(3);
        ListNode fourth=new ListNode(0);
        ListNode fifth=new ListNode(2);
        ListNode sixth=new ListNode(2);
        ListNode seventh=new ListNode(0);

        head.next=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=seventh;
        System.out.print("Before: ");
        ListNode.display(head);
        ListNode result= mergeNodes(head);
        System.out.print("After: ");
        ListNode.display(result);

    }
}

import java.util.Arrays;

public class DeleteNodesFromLinkedListPresentInAnArray {
    public static ListNode modifiedList(int[] nums, ListNode head) {
        Arrays.sort(nums);
        ListNode result=new ListNode(0);
        ListNode temp=result;
        ListNode current=head;
        while(current!=null){
            int a=Arrays.binarySearch(nums,current.val);
            if(a<0){
                temp.next=new ListNode(current.val);
                temp=temp.next;
            }
            current=current.next;
        }
        return result.next;
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
        int[] array={1,2,3};
        System.out.print("Before: ");
        ListNode.display(head);
        ListNode result= modifiedList(array,head);
        System.out.print("After: ");
        ListNode.display(result);
    }
}

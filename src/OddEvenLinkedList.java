import java.util.List;

public class OddEvenLinkedList {
    public static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void display(ListNode head){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.val+"->");
            current=current.next;
        }
        System.out.println("NULL");
    }
    public static ListNode oddEvenList(ListNode head) {
        ListNode odd= new ListNode(0);
        ListNode oddTemp=odd;
        ListNode even= new ListNode(0);
        ListNode evenTemp=even;
        ListNode current=head;
        int count=1;
        while(current!=null){
            if(count%2==0){
                evenTemp.next= new ListNode(current.val);
                evenTemp=evenTemp.next;
            }
            else{
                oddTemp.next= new ListNode(current.val);
                oddTemp=oddTemp.next;
            }
            current=current.next;
            count++;
        }
        oddTemp.next=even.next;
        odd=odd.next;

        return odd;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(2);
        ListNode second=new ListNode(1);
        ListNode third=new ListNode(3);
        ListNode fourth=new ListNode(5);
        ListNode fifth=new ListNode(6);
        ListNode sixth=new ListNode(4);
        ListNode seventh=new ListNode(7);
        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=seventh;
        System.out.print("Before: ");
        display(head);
        ListNode result=oddEvenList(head);
        System.out.print("After: ");
        display(result);
    }
}

public class InsertGreatestCommonDivisorInLinkedList {
    public static int greatestCD(int a,int b){
        int value=a;
        if(a>b){
            value=b;
        }
        else{
            value=a;
        }
        for(int i=value;i>=1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }
    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode result=new ListNode(0);
        ListNode temp=result;
        ListNode current=head;
        while(current.next!=null){
            temp.next=new ListNode(current.val);
            temp=temp.next;
            int a=current.val;
            int b=current.next.val;
            ListNode node=new ListNode(greatestCD(a,b));
            temp.next=node;
            temp=temp.next;
            current=current.next;
        }
        temp.next=current;
        temp=temp.next;
        return result.next;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(18);
        ListNode first=new ListNode(6);
        ListNode second=new ListNode(10);
        ListNode third=new ListNode(3);

        head.next=first;
        first.next=second;
        second.next=third;
        System.out.print("Before: ");
        ListNode.display(head);
        System.out.print("After: ");
        ListNode result=insertGreatestCommonDivisors(head);
        ListNode.display(result);
    }
}

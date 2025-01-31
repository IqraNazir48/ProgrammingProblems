public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        if(head.next==head){
            return true;
        }
        ListNode current=head;
        ListNode previous=head.next;
        while(current.next!=null ){
            if(current==previous){
                return true;
            }
            current=current.next;
            if(previous==null || previous.next==null){
                return false;
            }
            previous=previous.next.next;
        }
        return false;
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
        n4.next=n4;
        n5.next=n2;

        System.out.println("Cycle Detected? ----->  "+hasCycle(n1));
    }
}

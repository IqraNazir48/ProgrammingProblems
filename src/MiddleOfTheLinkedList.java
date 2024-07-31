import java.util.List;

class MiddleOftheLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode middleNode(ListNode head) {
        ListNode current=head;
        int length=0;
        while(current!=null){
            length+=1;
            current=current.next;
        }
        int index=(length/2)+1;
        ListNode pointer=head;
        int i=1;
        while(i<index){
            pointer=pointer.next;
            i++;
        }
        return pointer;
    }
    public static void displayList(ListNode head){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.val+"->");
            current=current.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        ListNode head =new ListNode(5);
        ListNode n1=new ListNode(7);
        ListNode n2=new ListNode(8);
        ListNode n3=new ListNode(2);
        ListNode n4=new ListNode(1);

        head.next=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;

        System.out.println("Linked list: ");
        displayList(head);
        ListNode middleNode=middleNode(head);
        System.out.println("Middle of Linked List: ");
        displayList(middleNode);
    }
}
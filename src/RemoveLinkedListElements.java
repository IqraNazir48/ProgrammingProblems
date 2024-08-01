class RemoveLinkedListElements {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode removeElements(ListNode head, int val) {
        ListNode result=new ListNode(0);
        ListNode pointer=result;
        while(head!=null){
            if(head.val!=val){
                pointer.next=new ListNode(head.val);
                pointer=pointer.next;
            }
            head=head.next;
        }
        return result.next;
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
        ListNode head =new ListNode(2);
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
        ListNode newListHead=removeElements(head,2);
        System.out.println("After removing elements: ");
        displayList(newListHead);
    }
}
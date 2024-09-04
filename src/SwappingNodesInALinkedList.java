public class SwappingNodesInALinkedList {
    public static ListNode swapNodes(ListNode head, int k) {
        int val1=0;
        int val2=0;
        ListNode current=head;
        int length=0;
        while(current!=null){
            length+=1;
            current=current.next;
        }
        if(length==1){
            return head;
        }
        ListNode current1=head;
        int i=0;
        int index1=k-1;
        int index2=length-k;
        while(current1!=null){
            if(i==index1){
                val1=current1.val;
            }
            if(i==index2){
                val2=current1.val;
            }
            i+=1;
            current1=current1.next;
        }
        ListNode current3=head;
        int in=0;
        while(current3!=null){
            if(in==index1){
                current3.val=val2;
            }
            else if(in==index2){
                current3.val=val1;
            }
            in++;
            current3=current3.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head =new ListNode(1);
        ListNode n1=new ListNode(2);
        ListNode n2=new ListNode(3);
        ListNode n3=new ListNode(4);
        ListNode n4=new ListNode(5);

        head.next=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        int k=2;
        System.out.print("Before Swapping: ");
        ListNode.display(head);
        System.out.print("After Swapping: ");
        ListNode result= swapNodes(head,k);
        ListNode.display(result);
    }
}

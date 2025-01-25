public class RotateList {
    public static ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        ListNode current=head;
        int length=0;
        while(current!=null){
            current=current.next;
            length+=1;
        }
        int n=0;
        if(length>k){
            n=length-k;
        }
        else if (k>length){
            n=k%length;
            n=length-n;
        }
        if(n==length || k==length){
            return head;
        }
        ListNode current1=head;
        ListNode previous=null;
        for(int i=0;i<n-1;i++){
            current1=current1.next;
        }
        previous=current1.next;
        current1.next=null;
        current1=previous;
        while(current1.next!=null){
            current1=current1.next;
        }
        current1.next=head;
        head=previous;
        return head;
    }

    public static void main(String[] args) {

        ListNode n=new ListNode(1);
        ListNode n1=new ListNode(2);
        ListNode n2=new ListNode(3);
        ListNode n3=new ListNode(4);
        ListNode n4=new ListNode(5);

        n.next=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        ListNode result=rotateRight(n,2);
        ListNode.display(result);
    }
}

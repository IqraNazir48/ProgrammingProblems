import org.w3c.dom.ls.LSOutput;

public class SplitLinkedListInParts {
    public static ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result=new ListNode[k];
        int length=0;
        ListNode current=head;
        while(current!=null){
            current=current.next;
            length+=1;
        }
        int partSize=length/k;
        int remainder=length%k;
        ListNode current1=head;
        int i=0;
        while (current1!=null){
            int size=0;
            if(remainder==0){
                size=partSize;
            }
            else{
                size=partSize+1;
                remainder-=1;
            }
            result[i]=current1;
            while(size>1){
                current1=current1.next;
                size--;
                length--;
            }
            if(length==0){
                break;
            }
            ListNode temp=current1.next;
            current1.next=null;
            current1=temp;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode head =new ListNode(1);
        ListNode n1=new ListNode(2);
        ListNode n2=new ListNode(3);
        ListNode n3=new ListNode(4);
        ListNode n4=new ListNode(5);
        ListNode n5=new ListNode(6);
        ListNode n6=new ListNode(7);
        ListNode n7=new ListNode(8);
        ListNode n8=new ListNode(9);
        ListNode n9=new ListNode(10);

        head.next=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        n7.next=n8;
        n8.next=n9;

        int k=3;
        System.out.print("Before: ");
        ListNode.display(head);
        System.out.println("After splitting into Parts:");
        ListNode[] result=splitListToParts(head,k);
        for(ListNode a:result){
            ListNode.display(a);
        }

    }
}

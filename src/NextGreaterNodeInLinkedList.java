import java.util.ArrayList;
import java.util.List;

public class NextGreaterNodeInLinkedList {
    public static int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        ListNode current=head;
        while(current!=null){
            ListNode temp=current.next;
            int flag=0;
            while(temp!=null){
                if(temp.val>current.val){
                    arrayList.add(temp.val);
                    flag=1;
                    break;
                }
                temp=temp.next;
            }
            if(flag==0){
                arrayList.add(0);
            }
            current=current.next;
        }
        int[] result=new int[arrayList.size()];
        for(int i=0;i<result.length;i++){
            result[i]=arrayList.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(2);
        ListNode first=new ListNode(7);
        ListNode second=new ListNode(4);
        ListNode third=new ListNode(3);
        ListNode fourth=new ListNode(5);

        head.next=first;
        first.next=second;
        second.next=third;
        third.next=fourth;

        ListNode.display(head);
        int[] result=nextLargerNodes(head);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();
    }
}

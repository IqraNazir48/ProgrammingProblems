import java.util.List;

public class MergeInBetweenLinkedLists {
    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int index=0;
        ListNode current=list1;
        ListNode temp=list1;
        int flag=0;
        int i=0;
        while(i!=b){
            i+=1;
            temp=temp.next;
        }
        while(current!=null){
            if(index==a-1){
                current.next=list2;
                current=current.next;
                while(current!=null){
                    if(current.next==null){
                        current.next=temp.next;
                        return list1;
                    }
                    current=current.next;
                }
            }
            index+=1;
            current=current.next;
        }
        return list1;
    }
    public static void main(String[] args) {
        int a=2;
        int b=5;
        ListNode head1=new ListNode(0);
        ListNode first1=new ListNode(1);
        ListNode second1=new ListNode(2);
        ListNode third1=new ListNode(3);
        ListNode fourth1=new ListNode(4);
        ListNode fifth1=new ListNode(5);
        ListNode sixth1=new ListNode(6);
        head1.next=first1;
        first1.next=second1;
        second1.next=third1;
        third1.next=fourth1;
        fourth1.next=fifth1;
        fifth1.next=sixth1;

        ListNode head2=new ListNode(1000000);
        ListNode first2=new ListNode(1000001);
        ListNode second2=new ListNode(1000002);
        ListNode third2=new ListNode(1000003);
        ListNode fourth2=new ListNode(1000004);

        head2.next=first2;
        first2.next=second2;
        second2.next=third2;
        third2.next=fourth2;

        ListNode.display(head1);
        ListNode.display(head2);
        ListNode result=mergeInBetween(head1,a,b,head2);
        ListNode.display(result);
    }
}

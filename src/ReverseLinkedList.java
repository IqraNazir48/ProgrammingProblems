import java.util.List;
import java.util.Stack;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode result=new ListNode(0);
        ListNode temp=result;
        Stack<Integer> stack=new Stack<>();
        ListNode current=head;
        while(current!=null){
            stack.push(current.val);
            current=current.next;
        }
        while(!stack.empty()){
            temp.next=new ListNode(stack.pop());
            temp=temp.next;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode n1=new ListNode(2);
        ListNode n2=new ListNode(3);
        ListNode n3=new ListNode(9);
        ListNode n4=new ListNode(8);

        ListNode head;
        head = n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        System.out.print("Before: ");
        ListNode.display(head);
        ListNode reversedList=reverseList(head);
        System.out.print("After: ");
        ListNode.display(reversedList);

    }
}

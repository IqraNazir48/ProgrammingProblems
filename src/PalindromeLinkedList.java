import java.util.Stack;
public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        Stack<Integer> stack=new Stack<>();
        ListNode current=head;
        while(current!=null){
            stack.push(current.val);
            current=current.next;
        }
        ListNode current1=head;
        while(current1!=null){
            if(current1.val!=stack.pop()){
                return false;
            }
            current1=current1.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head =new ListNode(1);
        ListNode n1=new ListNode(2);
        ListNode n2=new ListNode(3);
        ListNode n3=new ListNode(2);
        ListNode n4=new ListNode(1);

        head.next=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;

        System.out.print("LinkedList: ");
        ListNode.display(head);
        System.out.println(isPalindrome(head));
    }
}

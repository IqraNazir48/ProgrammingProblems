public class DesignCircularDeque {
    int length=0;
    int capacity;
    ListNode front;
    ListNode rear;
        public DesignCircularDeque(int k) {
        this.capacity=k;
    }
    public boolean insertFront(int value) {
        ListNode n=new ListNode(value);
        if(isFull()){
            System.out.println("Deque if Full...");
            return false;
        }
        if(isEmpty()){
            front=n;
            rear=n;
            length++;
            return true;
        }
        n.next=front;
        front=n;
        length++;
        return true;
    }

    public boolean insertLast(int value) {
        ListNode n=new ListNode(value);
        if(isFull()){
            System.out.println("Deque is Full...");
            return false;
        }
        if(isEmpty()){
            front=n;
            rear=n;
            length++;
            return true;
        }
        rear.next=n;
        rear=n;
        length++;
        return true;
    }

    public boolean deleteFront() {
        if(isEmpty()){
            System.out.println("Deque is Empty...");
            return false;
        }
        if(front==rear){
            front=rear=null;
            length--;
            return true;
        }
        front=front.next;
        length--;
        return true;
    }

    public boolean deleteLast() {
        if(isEmpty()){
            System.out.println("Deque is Empty...");
            return false;
        }
        if(front==rear){
            front=rear=null;
            length--;
            return true;
        }
        ListNode current=front;
        while(current!=null){
            if(current.next==rear){
                current.next=null;
                rear=current;
                length--;
                return true;
            }
            current=current.next;
        }
        return false;
    }

    public int getFront(){
        if(front==null){
            return -1;
        }
        return front.val;
    }
    public int getRear(){
        if(rear==null){
            return-1;
        }
        return rear.val;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public boolean isFull(){
        return length==capacity;
    }
    public void display(){
        if(length==0){
            System.out.println("Deque is empty...");
            return;
        }
        System.out.print("Deque: ");
        ListNode current=front;
        while(current!=null){
            System.out.print(current.val+"->");
            current=current.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        DesignCircularDeque deque=new DesignCircularDeque(5);
        System.out.println("Calling insert from front....");
        deque.insertFront(5);

        System.out.println("Calling insert from Rear....");
        deque.insertLast(1);

        System.out.println("Calling insert from front....");
        deque.insertFront(9);

        System.out.println("Calling insert from Rear....");
        deque.insertLast(2);

        System.out.println("Calling insert from front....");
        deque.insertFront(3);


        deque.display();

        System.out.println("Calling delete from front....");
        deque.deleteFront();
        System.out.println("Calling delete from rear....");
        deque.deleteLast();
        System.out.println("Calling delete from front....");
        deque.deleteFront();

        deque.display();
    }
}


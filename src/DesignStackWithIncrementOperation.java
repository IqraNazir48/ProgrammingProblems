class DesignStackWithIncrementOperation {
    int top=-1;
    int[] arr;

    public int size(){
        return top+1;
    }

    public DesignStackWithIncrementOperation(int maxSize) {
        arr=new int[maxSize];
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return arr.length==top+1;
    }

    public void push(int x){
        if(isFull()){
            System.out.println("Stack is full!");
            return;
        }
        top=top+1;
        arr[top]=x;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return -1;
        }
        int data=arr[top];
        top=top-1;
        return data;
    }

    public void increment(int k, int val) {
        int size=size();
        if(size>=k){
            for(int i=0;i<k;i++){
                arr[i]=arr[i]+val;
            }
        }
        else{
            for(int i=0;i<size;i++){
                arr[i]=arr[i]+val;
            }
        }
    }
    public void display(){
        int size=size();
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DesignStackWithIncrementOperation stack=new DesignStackWithIncrementOperation(5);
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.push(2);
        stack.push(3);
        stack.increment(5,100);
        stack.increment(2,100);
        stack.display();
    }
}
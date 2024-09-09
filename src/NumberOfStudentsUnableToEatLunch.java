import java.util.*;
public class NumberOfStudentsUnableToEatLunch {
    public static int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue=new LinkedList<>();
        int result=0;
        for(int a:students){
            queue.offer(a);
        }
        int queueSize=queue.size();
        int count=0;
        int i=0;
        while(!queue.isEmpty() && !(count>=queue.size()) && !(i>=sandwiches.length)){
            if(queue.peek()==sandwiches[i]){
                queue.poll();
                i++;
                result++;
                count=0;
            }
            else{
                int a=queue.peek();
                queue.poll();
                queue.offer(a);
                count++;
            }
        }
        return queueSize-result;
    }

    public static void main(String[] args) {
        int[] students = {1,1,1,0,0,1};
        int[] sandwiches ={1,0,0,0,1,1};
        System.out.println("Number of students unable to eat lunch: "+countStudents(students,sandwiches));
    }
}

import java.util.LinkedList;
import java.util.Queue;

public class FindTheChildWhoHasTheBallAfterK_Seconds {
    public static int numberOfChild(int n, int k) {
        int flag=1;
        int i=0;
        for(int j=0;j<k;j++){
            if(i==0){
                flag=1;
            }
            else if(i==n-1){
                flag=0;
            }
            if(flag==1){
                i++;
            }
            else{
                i--;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int n=3;
        int k=5;
        System.out.println(numberOfChild(n,k));
    }
}

import java.util.*;
public class MaximumSwap {
    public static int[] integerToArray(int a){
        if(a==0){
            return new int[0];
        }
        int n=a;
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        int[] array=new int[count];
        int m=a;
        for(int i=count-1;i>=0;i--){
            array[i]=m%10;
            m=m/10;
        }
        return array;
    }
    public static int arrayToInteger(int[] array){
        int product=1;
        for(int i=0;i<array.length-1;i++){
            product*=10;
        }
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i]*product;
            product/=10;
        }
        return sum;
    }
    public static int maximumSwap(int num) {
        int[] result=integerToArray(num);
        int[] sorted=new int[result.length];
        for(int i=0;i<result.length;i++){
            sorted[i]=result[i];
        }
        Arrays.sort(sorted);

        for(int i=0,j=sorted.length-1;i<result.length;i++,j--){
            if(sorted[j]!=result[i]){
                int max=result[i];
                int maxIndex=i;
                for(int k=i+1;k<result.length;k++){
                    if(result[k]>=max){
                        max=result[k];
                        maxIndex=k;
                    }
                }
                int temp=result[i];
                result[i]=result[maxIndex];
                result[maxIndex]=temp;
                break;
            }
        }

        return arrayToInteger(result);
    }

    public static void main(String[] args) {
        int num1=2736;
        int result1=maximumSwap(num1);
        int num2=9973;
        int result2=maximumSwap(num2);

        System.out.println("Before swapping: "+num1+"     After Swapping: "+result1);
        System.out.println("Before swapping: "+num2+"     After Swapping: "+result2);
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class FindOccurrencesOfAnElement {
    public static int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int[] result=new int[queries.length];
        ArrayList<Integer> array=new ArrayList<>();

        int occurences=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                array.add(i);
                occurences+=1;
            }
        }

        for(int i=0;i<queries.length;i++){
            if(occurences>=queries[i]){
                result[i]=array.get(queries[i]-1);
            }
            else{
                result[i]=-1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3,1,7};
        int[] queries1 = {1,3,2,4};
        int x1 = 1;
        int[] result1=occurrencesOfElement(nums1,queries1,x1);

        int[] nums2= {1,2,3};
        int[] queries2 = {10};
        int x2 = 5;
        int[] result2=occurrencesOfElement(nums2,queries2,x2);

        for(int a:result1){
            System.out.print(a+" ");
        }
        System.out.println();
        for(int b:result2){
            System.out.print(b+" ");
        }
        System.out.println();
    }
}

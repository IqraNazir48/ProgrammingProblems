import java.util.ArrayList;

public class PartitioningArrayAccordingToTheGivenPivot {
    public static int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> less=new ArrayList<>();
        ArrayList<Integer> greater=new ArrayList<>();
        int equal=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                less.add(nums[i]);
            }
            else if(nums[i]>pivot){
                greater.add(nums[i]);
            }
            else{
                equal+=1;
            }
        }
        int[] result=new int[nums.length];
        int i=0;
        for(int a:less){
            result[i]=a;
            i++;
        }
        for(int j=0;j<equal;j++){
            result[i]=pivot;
            i++;
        }
        for(int a:greater){
            result[i]=a;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr={9,12,5,10,14,3,10};
        System.out.print("Before : ");
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
        int[] result=pivotArray(arr,10);
        System.out.print("After  : ");
        for(int a:result){
            System.out.print(a+" ");
        }
        System.out.println();
    }
}

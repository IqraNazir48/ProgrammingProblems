import java.util.*;
public class CountTheNumberOfIncremovableSubArraysI {
    public static boolean isStricklyIncreasing(int[] arr,int start,int end){
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!(i>=start && i<=end)){
                arrayList.add(arr[i]);
            }
        }
        if(arrayList.size()==0 || arrayList.size()==1){
            return true;
        }
        for(int i=1;i<arrayList.size();i++){
            if(arrayList.get(i)<=arrayList.get(i-1)){
                return false;
            }
        }
        return true;
    }
    public static int incremovableSubarrayCount(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int start=i;
            int end=0;
            for(int j=i;j<nums.length;j++){
                end=j;
                if(isStricklyIncreasing(nums,start,end)){
                    count+=1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={8,7,6,6};
        System.out.println("Number of Incremovable SubArrays int arr1: "+incremovableSubarrayCount(arr1));
        System.out.println("Number of Incremovable SubArrays int arr2: "+incremovableSubarrayCount(arr2));
    }
}

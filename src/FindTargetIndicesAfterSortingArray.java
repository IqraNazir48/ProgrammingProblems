import java.util.*;
public class FindTargetIndicesAfterSortingArray {
    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> arrayList=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
       int[] nums = {1,2,5,2,3};
       int target = 2;
       List<Integer> result=targetIndices(nums,target);
       for(int a:result){
           System.out.print(a+" ");
       }
    }
}

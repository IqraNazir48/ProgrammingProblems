import java.util.Arrays;

public class MakeArrayZeroBySubtractingEqualAmounts {
    public static int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int counter=0;
        int zero_count=0;
        for(int i=0;i<nums.length;i++){
            if(zero_count==nums.length){
                return counter;
            }
            if(nums[i]>0){
                int value=nums[i];
                counter+=1;
                for(int j=0;j<nums.length;j++){
                    if(nums[j]>0){
                        nums[j]=nums[j]-value;
                    }
                }
            }
            else{
                zero_count+=1;
            }

        }
        return counter;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,5,0,3,5};
        int[] nums2 = {0};
        System.out.println(minimumOperations(nums1));
        System.out.println(minimumOperations(nums2));
    }
}

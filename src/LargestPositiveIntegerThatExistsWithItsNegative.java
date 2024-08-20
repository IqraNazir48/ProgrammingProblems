import java.util.Arrays;

public class LargestPositiveIntegerThatExistsWithItsNegative {
    public static int findMaxK(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--){
            for(int j=0;j<nums.length;j++){
                if(nums[j]>=0){
                    break;
                }
                if(nums[j]==nums[i]*-1){
                    return nums[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {-1,2,-3,3};
        int[] nums2 = {-1,10,6,7,-7,1};
        System.out.println(findMaxK(nums1));
        System.out.println(findMaxK(nums2));
    }
}

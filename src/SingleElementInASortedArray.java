import java.util.Arrays;

public class SingleElementInASortedArray {
    public static int singleNonDuplicate(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length>=2){
            if(nums[0]!=nums[1]){
                return nums[0];
            }
        }
        for(int i=1;i<nums.length-2;i++){
            if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1]){
                return nums[i];
            }
        }
        if(nums.length>=2){
            if(nums[nums.length-1]!=nums[nums.length-2]){
                return nums[nums.length-1];
            }
        }
        return nums[0];
    }

    public static void main(String[] args) {
        int[] nums1 = {1,1,2,3,3,4,4,8,8};
        int[] nums2 = {3,3,7,7,10,11,11};

        System.out.println(singleNonDuplicate(nums1));
        System.out.println(singleNonDuplicate(nums2));
    }
}

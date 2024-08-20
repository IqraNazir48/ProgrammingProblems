import java.util.Arrays;

public class FindGreatestCommonDivisorOfArray {
    public static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int smallestNumber=nums[0];
        int greatestNumber=nums[nums.length-1];
        for(int i=greatestNumber;i>=1;i--){
            if(smallestNumber%i==0 && greatestNumber%i==0){
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,5,6,9,10};
        int[] nums2 = {7,5,6,8,3};
        System.out.println(findGCD(nums1));
        System.out.println(findGCD(nums2));
    }
}

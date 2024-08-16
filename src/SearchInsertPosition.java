public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            if(nums[i]>target){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3,5,6};
        int target1 = 5;
        int[] nums2 = {1,3,5,6};
        int target2 = 2;
        int[] nums3 = {1,3,5,6};
        int target3 = 7;
        System.out.println(searchInsert(nums1,target1));
        System.out.println(searchInsert(nums2,target2));
        System.out.println(searchInsert(nums3,target3));
    }
}

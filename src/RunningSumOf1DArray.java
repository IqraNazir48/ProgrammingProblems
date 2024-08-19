public class RunningSumOf1DArray {
    public static int[] runningSum(int[] nums) {
        int[] result=new int[nums.length];
        int number=nums[0];
        result[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            result[i]=nums[i]+number;
            number=number+nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
       int[] nums1 = {1,2,3,4};
       int[] result1=runningSum(nums1);
       for(int a:result1){
           System.out.print(a+" ");
       }

       System.out.println();

       int[] nums2 = {1,1,1,1,1};
       int[] result2=runningSum(nums2);
       for(int a:result2){
           System.out.print(a+" ");
       }
    }
}

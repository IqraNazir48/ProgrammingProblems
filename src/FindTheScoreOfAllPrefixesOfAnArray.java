public class FindTheScoreOfAllPrefixesOfAnArray {
    public static long[] findPrefixScore(int[] nums) {
        long[] arr=new long[nums.length];
        long maximum=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maximum){
                maximum=nums[i];
            }
            arr[i]=nums[i]+maximum;
        }

        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=arr[i];
            arr[i]=sum;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums1={2,3,7,5,10};
        int[] nums2={1,1,2,4,8,16};
        long[] result1=findPrefixScore(nums1);
        long[] result2=findPrefixScore(nums2);

        for(long a:result1){
            System.out.print(a+" ");
        }
        System.out.println();
        for(long b:result2){
            System.out.print(b+" ");
        }
        System.out.println();
    }
}

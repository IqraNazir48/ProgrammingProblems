public class MaximumAscendingSubArraySum {
    public static boolean isStricklyIncreasing(int l, int u, int[] arr){
        for(int i=l+1;i<=u;i++){
            if(arr[i]<=arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static int maxAscendingSum(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                int l=i;
                int u=j;
                if(isStricklyIncreasing(l,u,nums)){
                    if(sum>max){
                        max=sum;
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={10,20,30,5,10,50};
        System.out.println("Maximum Ascending SubArray Sum: "+maxAscendingSum(arr));
    }
}

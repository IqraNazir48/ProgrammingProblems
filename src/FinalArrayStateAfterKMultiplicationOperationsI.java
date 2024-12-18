public class FinalArrayStateAfterKMultiplicationOperationsI {
        public static int getMinIndex(int[] nums){
            int minIndex=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<nums[minIndex]){
                    minIndex=i;
                }
            }
            return minIndex;
        }
        public static int[] getFinalState(int[] nums, int k, int multiplier) {
            for (int i = 0; i < k; i++) {
                int minIndex = getMinIndex(nums);
                nums[minIndex] *= multiplier;
            }
            return nums;
        }

    public static void main(String[] args) {
        int[] nums={2,1,3,5,6};
        System.out.print("Nums: ");
        for(int a:nums){
            System.out.print(a+" ");
        }
        int k=5;
        int multiplier=2;
        int[] finalState=getFinalState(nums,k,multiplier);

        System.out.println();
        System.out.println("k: "+k);
        System.out.println("Multiplier: "+multiplier);
        System.out.print("Final State: ");
        for(int a:finalState){
            System.out.print(a+" ");
        }
    }
}

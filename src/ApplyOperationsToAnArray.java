public class ApplyOperationsToAnArray {
    public static int[] moveZeroes(int[] nums) {
        int pointer =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[pointer];
                nums[pointer]=nums[i];
                nums[i]=temp;
                pointer++;
            }
        }
        return nums;
    }
    public static int[] applyOperations(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        return moveZeroes(nums);
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,1,1,0};

        System.out.print("Before: ");
        for(int a:arr){
            System.out.print(a+"  ");
        }
        System.out.println();
        int[] result=applyOperations(arr);
        System.out.print("After:  ");
        for(int a:result){
            System.out.print(a+"  ");
        }

        System.out.println();
    }
}

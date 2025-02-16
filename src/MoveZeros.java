public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int pointer =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[pointer];
                nums[pointer]=nums[i];
                nums[i]=temp;
                pointer++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
        System.out.print("Before: ");
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
        moveZeroes(arr);
        System.out.print("After:  ");
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
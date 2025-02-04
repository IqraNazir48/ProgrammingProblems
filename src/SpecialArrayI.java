public class SpecialArrayI {
    public static boolean isArraySpecial(int[] nums) {
        if(nums.length==0 || nums.length==1){
            return true;
        }
        for(int i=0;i<nums.length-1;i++){
            if((nums[i]%2)==0 && (nums[i+1]%2==0)){
                return false;
            }
            if((nums[i]%2)!=0 && (nums[i+1]%2!=0)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array1={2,1,4};
        int[] array2={1};
        int[] array3={4,3,1,6};

        System.out.println("Array1: Special? ----> "+isArraySpecial(array1));
        System.out.println("Array2: Special? ----> "+isArraySpecial(array2));
        System.out.println("Array3: Special? ----> "+isArraySpecial(array3));
    }
}

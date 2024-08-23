public class MaximumCountOfPositiveIntegerAndNegativeInteger {
    public static int maximumCount(int[] nums) {
        int positive=0;
        int negative=0;
        for(int a:nums){
            if(a>0){
                positive+=1;
            }
            else if(a<0){
                negative+=1;
            }
        }
        if(positive>negative){
            return positive;
        }
        return negative;
    }

    public static void main(String[] args) {
        int[] nums = {-3,-2,-1,0,0,1,2};
        System.out.println(maximumCount(nums));
    }
}

public class LongestStrictlyIncreasingOrStrictlyDecreasingSubarray {
    public static boolean isStrictlyIncreasing(int l, int u, int[] arr){
        for(int i=l+1;i<=u;i++){
            if(arr[i]<=arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static boolean isStrictlyDecreasing(int l, int u, int[] arr){
        for(int i=l+1;i<=u;i++){
            if(arr[i]>=arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static int longestMonotonicSubarray(int[] nums) {
        int max = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int l = i;
                int u = j;
                int length = (j - i) + 1;
                if (isStrictlyIncreasing(l, u, nums)) {
                    if (length > max) {
                        max = length;
                    }
                } else if (isStrictlyDecreasing(l, u, nums)) {
                    if (length > max) {
                        max = length;
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={1,4,5,2,7,4,9,3};
        System.out.println("Longest : "+longestMonotonicSubarray(arr));
    }
}

import java.util.Arrays;

public class PrimeInDiagonal {
    public static boolean isPrime(int a){
        if(a==1){
            return false;
        }
        for(int i=2;i<a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static int diagonalPrime(int[][] nums) {
        int[] dElements=new int[nums.length*2];
        int k=0;
        for(int i=0,j=0;i<nums.length;j++,i++){
            dElements[k]=nums[i][j];
            k++;
        }
        for(int i=0,j=nums.length-1;i<nums.length;j--,i++){
            dElements[k]=nums[i][j];
            k++;
        }
        Arrays.sort(dElements);
        for(int i=dElements.length-1;i>=0;i--){
            if(isPrime(dElements[i])){
                return dElements[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] nums1 = {{1,2,3},{5,17,7},{9,11,10}};
        int[][] nums2 = {{1,2,3},{5,6,7},{9,10,11}};
        System.out.println(diagonalPrime(nums1));
        System.out.println(diagonalPrime(nums2));
    }
}

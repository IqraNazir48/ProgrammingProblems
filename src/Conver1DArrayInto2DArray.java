public class Conver1DArrayInto2DArray {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        if((m*n)!=original.length){
            return (new int[0][0]);
        }
        int[][] result=new int[m][n];
        int a=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result[i][j]=original[a];
                a++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] original = {1,2,3,4};
        int m = 2;
        int n = 2;
        int[][] result=construct2DArray(original,m,n);
        for(int[] a:result) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}

public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0,j=0,k=mat.length-1;i<mat.length;i++,j++,k--){
            sum+=mat[i][j];
            if(k!=i){
                sum+=mat[i][k];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][]  mat1={{1,2,3}, {4,5,6},{7,8,9}};
        System.out.println(diagonalSum(mat1));
        int[][] mat2={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        System.out.println(diagonalSum(mat2));
        int[][] mat3 = {{5}};
        System.out.println(diagonalSum(mat3));
    }
}

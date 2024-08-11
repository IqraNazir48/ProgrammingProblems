public class FindTheDistanceValueBetweenTwoArrays {
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        int flag=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                int absValue=Math.abs(arr1[i]-arr2[j]);
                if(absValue<=d){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                count+=1;
            }
            flag=0;
        }
        return count;
    }

    public static void main(String[] args) {
       int[] arr1 = {4,5,8};
       int[] arr2 = {10,9,1,8};
       int d = 2;
        System.out.println(findTheDistanceValue(arr1,arr2,d));
    }
}

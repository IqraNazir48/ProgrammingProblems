public class MergeTwo2DArraysBySummingValues {
    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int max=0;
        if(nums1[nums1.length-1][0]>nums2[nums2.length-1][0]){
            max=nums1[nums1.length-1][0];
        }
        else{
            max=nums2[nums2.length-1][0];
        }
        int[] arr=new int[max];
        for(int i=0;i<nums1.length;i++){
            arr[nums1[i][0]-1]+=nums1[i][1];
        }
        for(int j=0;j<nums2.length;j++){
            arr[nums2[j][0]-1]+=nums2[j][1];
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                count++;
            }

        }
        int[][] result=new int[count][2];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                result[j][0]=i+1;
                result[j][1]=arr[i];
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] nums1 = {{1,2},{2,3},{4,5}};
        int[][] nums2 = {{1,4},{3,2},{4,1}};

        int[][] result= mergeArrays(nums1,nums2);
        System.out.println("----------Result--------");
        for(int[] a:result){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}

public class FindLuckyIntegerInAnArray {
    public static int frequency(int[] array, int key){
        int count=0;
        for(int a:array){
            if(a==key){
                count+=1;
            }
        }
        return count;
    }
    public static int findLucky(int[] arr) {
        int max=-1;
        for(int a:arr){
            if(a==frequency(arr,a)){
                if(a>max){
                    max=a;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,2,3,4};
        int[] arr2 = {1,2,2,3,3,3};
        System.out.println(findLucky(arr1));
        System.out.println(findLucky(arr2));
    }
}

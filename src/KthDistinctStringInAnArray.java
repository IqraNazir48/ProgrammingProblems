import java.util.ArrayList;

public class KthDistinctStringInAnArray {
    public static boolean frequencyChecking(String[] arr,String s){
        int count=0;
        for(String a:arr){
            if(a.equals(s)){
                count+=1;
            }
            if(count>1){
                return false;
            }
        }
        return true;
    }
    public static String kthDistinct(String[] arr, int k) {
        ArrayList<String> arrayList=new ArrayList<>();

        for(String a:arr){
            if(frequencyChecking(arr,a)){
                arrayList.add(a);
            }
        }
        if(arrayList.size()<k){
            return new String();
        }
        return arrayList.get(k-1);
    }

    public static void main(String[] args) {
        String[] arr1={"d","b","c","b","c","a"};
        int k1=2;
        System.out.println(kthDistinct(arr1,k1));

        String[] arr2={"aaa","aa","a"};
        int k2=1;
        System.out.println(kthDistinct(arr2,k2));
    }
}
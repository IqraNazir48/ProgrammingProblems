import java.util.*;

public class UncommonWordsFromTwoSentences {
    public static String[] uncommonFromSentences(String s1, String s2) {
        String[] array1=s1.split(" ");
        String[] array2=s2.split(" ");
        ArrayList<String> arr1=new ArrayList<>();
        ArrayList<String> arr2=new ArrayList<>();
        ArrayList<String> arrayList=new ArrayList<>();
        ArrayList<String> duplicates=new ArrayList<>();
        for(String s:array1){
            if(!arr1.contains(s)){
                arr1.add(s);
            }
            else{
                duplicates.add(s);
            }
        }
        for(String s:array2){
            if(!arr2.contains(s)){
                arr2.add(s);
            }
            else{
                duplicates.add(s);
            }
        }

        for(String s:arr1){
            if(!arr2.contains(s) && !duplicates.contains(s)){
                arrayList.add(s);
            }
        }
        for(String s:arr2){
            if(!arr1.contains(s) && !duplicates.contains(s)){
                arrayList.add(s);
            }
        }
        String[] result=new String[arrayList.size()];
        for(int i=0;i<arrayList.size();i++){
            result[i]=arrayList.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "apple apple";
        String s2 = "banana";
        String[] result=uncommonFromSentences(s1,s2);
        for(String s:result){
            System.out.print(s+" ");
        }
        System.out.println();
    }
}

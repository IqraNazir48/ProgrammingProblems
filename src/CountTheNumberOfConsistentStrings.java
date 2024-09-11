import java.util.*;
public class CountTheNumberOfConsistentStrings {
    public static int countConsistentStrings(String allowed, String[] words) {
        ArrayList<Character> array=new ArrayList<>();
        for(int i=0;i<allowed.length();i++){
            array.add(allowed.charAt(i));
        }
        int count=0;
        for(int i=0;i< words.length;i++){
            int flag=0;
            for(int j=0;j<words[i].length();j++){
                if(!array.contains(words[i].charAt(j))){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                count+=1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings(allowed,words));
    }
}

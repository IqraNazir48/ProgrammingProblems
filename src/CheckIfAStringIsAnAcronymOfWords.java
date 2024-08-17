import java.util.ArrayList;
import java.util.List;
public class CheckIfAStringIsAnAcronymOfWords {
    public static boolean isAcronym(List<String> words, String s) {
        if(words.size()!=s.length()){
            return false;
        }
        for(int i=0;i<words.size();i++){
            if(words.get(i).charAt(0)!=s.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> words =new ArrayList<>();
        words.add("alice");
        words.add("bob");
        words.add("charlie");
        String s= "abc";
        System.out.println(isAcronym(words,s));
    }
}

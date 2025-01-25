import java.util.*;
class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        ArrayList<Character> arrayList=new ArrayList<>();

        for(int i=0;i<s.length();i++){
            int value=s.charAt(i);
            if((value>='A' && value<='Z') || (value>='a' && value<='z') || (value>='0' && value<='9')){
                arrayList.add(Character.toLowerCase(s.charAt(i)));
            }
        }
        if(arrayList.size()==0 || arrayList.size()==1){
            return true;
        }

        for(int i=0,j=arrayList.size()-1;i<=j;i++,j--){
            if(arrayList.get(i)!=arrayList.get(j)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="0P";
        String s1="a";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(s1));
    }
}
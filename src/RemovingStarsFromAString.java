import java.util.Stack;

public class RemovingStarsFromAString {
    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)=='*'){
                stack.pop();
            }
        }
        char[] array=new char[stack.size()];
        for(int i=array.length-1;i>=0;i--){
            array[i]=stack.pop();
        }
        return (new String(array));
    }

    public static void main(String[] args) {
        String  s1= "leet**cod*e";
        System.out.println(removeStars(s1));
        String s2 = "erase*****";
        System.out.println(removeStars(s2));
    }
}

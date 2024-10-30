import java.util.Stack;

public class BackSpaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                stack1.push(s.charAt(i));
            }
            else{
                if(!stack1.isEmpty()){
                    stack1.pop();
                }

            }
        }

        for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                stack2.push(t.charAt(i));
            }
            else{
                if(!stack2.isEmpty()){
                    stack2.pop();
                }
            }
        }
        if(stack1.isEmpty() && stack2.isEmpty()){
            return true;
        }
        else if(stack1.isEmpty() || stack2.isEmpty()){
            return false;
        }

        if(stack1.size()!=stack2.size()){
            return false;
        }

        while(!stack1.isEmpty()){
            char c1=stack1.pop();
            char c2=stack2.pop();
            if(c1!=c2){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="aaa###a";
        String t="aaaa###a";
        String s1="abcd";
        String t1="bbcd";
        String s2="a#a#";
        String t2="aa##";
        System.out.println(backspaceCompare(s,t));
        System.out.println(backspaceCompare(s1,t1));
        System.out.println(backspaceCompare(s2,t2));
    }
}
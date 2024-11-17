import java.util.Arrays;

public class RotateString {
    public static boolean rotateString(String s, String goal) {
        char[] string=s.toCharArray();

        for(int i=0;i<=(s.length())/2;i++){
            String st=Arrays.toString(string);
            if(st.equals(goal)){
                return true;
            }
            System.out.println("String: "+st+"   Goal:  "+goal);
            char temp=string[i];
            string[i]=string[(string.length-1)-i];
            string[(string.length-1)-i]=temp;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String goal1 = "cdeab";

        String s2 = "abcde";
        String goal2 = "abced";

        System.out.println("String:  "+s1+"  goal:  "+goal1+"   output: "+rotateString(s1,goal1));
        System.out.println("String:  "+s2+"  goal:  "+goal2+"   output: "+rotateString(s2,goal2));
    }
}

public class ScoreOfAString {
    public static int scoreOfString(String s) {
        int a=0;
        int b=0;
        int sum=0;
        int value=0;
        if(s.length()==2){
            a=s.charAt(0);
            b=s.charAt(1);
            return (Math.abs(a-b));
        }
        for(int i=0;i<s.length()-2;i++){
            a=s.charAt(i);
            b=s.charAt(i+1);
            value=Math.abs(a-b);
            sum+=value;
        }
        a=b;
        b=s.charAt(s.length()-1);
        sum+=Math.abs(a-b);
        return sum;
    }
    public static void main(String[] args) {
        String s="zaz";
        System.out.println(scoreOfString(s));
    }
}

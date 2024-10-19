public class FindKthBitInNthBinaryString {
    public static String reverseString(String s){
        StringBuilder string=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            string.append(s.charAt(i));
        }
        return string.toString();
    }
    public static String invertString(String s){
        StringBuilder string=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                 string.append('1');
            }            else{
                string.append('0');
            }
        }
        return string.toString();
    }
    public static String finalString(int n){
        if(n==0){
            return "0";
        }
        String s="0";
        for(int i=0;i<n;i++){
            s=s+"1"+reverseString(invertString(s)); //01
        }
        return s;
    }
    public static char findKthBit(int n, int k) {
        String s=finalString(n);
        return (s.charAt(k-1));
    }
    public static void main(String[] args) {
        int n1=3;
        int k1=1;
        int n2=4;
        int k2=11;
        System.out.println("Char1: "+findKthBit(n1,k1));
        System.out.println("Char2: "+findKthBit(n2,k2));
    }
}

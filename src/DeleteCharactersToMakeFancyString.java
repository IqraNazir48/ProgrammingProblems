public class DeleteCharactersToMakeFancyString {
    public static String makeFancyString(String s) {
        if(s.length()==1 || s.length()==2){
            return s;
        }
        StringBuilder string=new StringBuilder();
        int count=1;
        string.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else if(s.charAt(i)!=s.charAt(i-1)){
                count=1;
            }
            if(count>=3){
                continue;
            }
            string.append(s.charAt(i));
        }
        return string.toString();
    }

    public static void main(String[] args) {
        String s="aaabaaaa";
        String result=makeFancyString(s);
        System.out.println("String: "+s);
        System.out.println("Fancy String: "+result);
    }
}
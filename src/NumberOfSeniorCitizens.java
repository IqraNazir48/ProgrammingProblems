public class NumberOfSeniorCitizens {
    public static int countSeniors(String[] details) {
        int count=0;
        for(String s:details){
            char[] chars=new char[2];
            chars[0]=s.charAt(11);
            chars[1]=s.charAt(12);
            int value1=Character.getNumericValue(chars[0]);
            int value2=Character.getNumericValue(chars[1]);
            int age=(value1*10)+(value2);
            if(age>60){
                count+=1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] details1 = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(details1));
        String[] details2 = {"1313579440F2036","2921522980M5644"};
        System.out.println(countSeniors(details2));
    }
}

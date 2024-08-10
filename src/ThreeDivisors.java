public class ThreeDivisors {
    public static boolean isThree(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count+=1;
            }
            if(count>3){
                return false;
            }
        }
        if(count==3){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isThree(2));
        System.out.println(isThree(4));
    }
}

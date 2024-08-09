public class MaximumNumberOfBalloons {
    public static int maxNumberOfBalloons(String text) {
        //b a l l o o n
        //b a l o n
        int[] counts=new int[5];

        for(int i=0;i<text.length();i++){
            if (text.charAt(i) == 'b') {
                counts[0]+=1;
            }
            else if (text.charAt(i) == 'a') {
                counts[1]+=1;
            }
            else if (text.charAt(i) == 'l') {
                counts[2]+=1;
            }
            else if (text.charAt(i) == 'o') {
                counts[3]+=1;
            }
            else if (text.charAt(i) == 'n') {
                counts[4] += 1;
            }
        }
        int flag=0;
        int balloons=0;

        while (flag==0){
            ////b a l o n
            if(counts[0]>=1 && counts[1]>=1 && counts[2]>=2 && counts[3]>=2 && counts[4]>=1){
                balloons+=1;
                counts[0]-=1;
                counts[1]-=1;
                counts[2]-=2;
                counts[3]-=2;
                counts[4]-=1;
            }
            else{
                flag=1;
            }
        }

        return balloons;
    }

    public static void main(String[] args) {
        String text1 = "nlaebolko";
        String text2 = "loonbalxballpoon";
        String text3 = "leetcode";

        System.out.println(maxNumberOfBalloons(text1));
        System.out.println(maxNumberOfBalloons(text2));
        System.out.println(maxNumberOfBalloons(text3));
    }
}

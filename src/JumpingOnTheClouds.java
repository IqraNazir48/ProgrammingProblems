import java.util.*;
class JumpingOnTheClouds {
    public static int jumpingOnClouds(List<Integer> c) {
        int jump=0;
        int patch=0;
        for(int i=0;i<c.size();i++){
            if(c.get(i)==0){
                patch+=1;
            }
            else if(c.get(i)==1){
                if(patch>1){
                    jump+=(patch/2);
                }
                jump+=1;
                patch=0;
            }
        }
        if(patch>1){
            jump+=1;
        }
        return jump;
    }
    public static void main(String[] args) {

        List<Integer> c=new ArrayList<Integer>();
        c.add(0);
        c.add(0);
        c.add(1);
        c.add(0);
        c.add(0);
        c.add(1);
        c.add(0);
        System.out.println("Result: "+jumpingOnClouds(c));
    }
}

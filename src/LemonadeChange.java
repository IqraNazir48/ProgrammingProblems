import java.util.ArrayList;
import java.util.Arrays;

public class LemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
        ArrayList<Integer> five=new ArrayList<>();
        ArrayList<Integer> ten=new ArrayList<>();
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                five.add(5);
            }
            else if(bills[i]==10){
                if(five.size()==0){
                    return false;
                }
                five.remove(0);
                ten.add(10);
            }
            else{
                if(ten.size()!=0 && five.size()!=0){
                    five.remove(0);
                    ten.remove(0);
                }
                else if(ten.size()==0 && five.size()>=3){
                    five.remove(0);
                    five.remove(0);
                    five.remove(0);
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] bills1={5,5,10,10,20};
        int[] bills2={5,5,5,10,20};
        System.out.println(lemonadeChange(bills1));
        System.out.println(lemonadeChange(bills2));
    }
}

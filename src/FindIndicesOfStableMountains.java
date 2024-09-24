import java.util.*;
public class FindIndicesOfStableMountains {
    public static List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<height.length;i++){
            if(height[i-1]>threshold){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] height = {1,2,3,4,5};
        int threshold = 2;
        List<Integer> list=stableMountains(height,threshold);
        for(int a:list){
            System.out.print(a+" ");
        }
        System.out.println();
    }
}

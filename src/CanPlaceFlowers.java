public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        if(flowerbed.length==1 ) {
            if(flowerbed[0]==0){
                count+=1;
            }
        }

        else{
            for(int i=0;i<flowerbed.length-2;i++){
                if(i==0){
                    if(flowerbed[i]==0 && flowerbed[i+1]==0){
                        count+=1;
                        flowerbed[i]=1;
                    }
                }
                else if (flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                    flowerbed[i]=1;
                    count+=1;
                }
                if(count>=n){
                    return true;
                }
            }
            if(flowerbed[flowerbed.length-2]==0 && flowerbed[flowerbed.length-1]==0){
                flowerbed[flowerbed.length-1]=1;
                count+=1;
            }
        }
        if(count>=n){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] flowerbed1 = {1,0,0,0,1};
        int[] flowerbed2 = {1,0,0,0,1};
        System.out.println(canPlaceFlowers(flowerbed1,2));
        System.out.println(canPlaceFlowers(flowerbed2,1));
    }
}

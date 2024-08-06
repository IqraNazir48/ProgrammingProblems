import java.util.Arrays;

public class RelativeRanks {
    public static String[] findRelativeRanks(int[] score) {
        String[] result=new String[score.length];
        int[] array=new int[score.length];

        for(int i=0;i<score.length;i++){
            array[i]=score[i];
        }

        Arrays.sort(array);
        int first=0;
        int second=0;
        int third=0;
        if(array.length>=1){
            first=array[array.length-1];
        }
        if(array.length>=2){
            second=array[array.length-2];
        }
        if(array.length>=3){
            third=array[array.length-3];
        }


        for(int i=0;i<score.length;i++){
            if(score[i]==first){
                result[i]="Gold Medal";
            }
            else if(score[i]==second){
                result[i]="Silver Medal";
            }
            else if(score[i]==third){
                result[i]="Bronze Medal";
            }
            else{
                int k=1;
                for(int j=array.length-1;j>=0;j--){
                    if(score[i]==array[j]){
                        result[i]=k+"";
                        break;
                    }
                    k++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] score = {5,4,3,2,1};
        String[] relativeRanks=findRelativeRanks(score);

        for(String s: relativeRanks){
            System.out.print(s+" ");
        }

        int[] score1 = {51,4,33,2,1};
        String[] relativeRanks1=findRelativeRanks(score);

        for(String s: relativeRanks1){
            System.out.print(s+" ");
        }
    }
}

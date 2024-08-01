import java.util.*;
public class TopKFrequentElements {
    public static int frequency(int[] array,int a){
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==a){
                count+=1;
            }
            if(array[i]>a){
                break;
            }
        }
        return count;
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        ArrayList<Integer> arrayF=new ArrayList<>();
        ArrayList<Integer> arrayI=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(arrayF.size()==0){
                arrayF.add(frequency(nums,nums[i]));
                arrayI.add(nums[i]);
            }
            else{
                if(arrayI.get(arrayI.size()-1)!=nums[i]){
                    arrayF.add(frequency(nums,nums[i]));
                    arrayI.add(nums[i]);

                }
            }
        }

        System.out.println();
        int[] frequencies=new int[arrayF.size()];
        int[] integers=new int[arrayI.size()];

        for(int i=0;i<arrayF.size();i++){
            frequencies[i]=arrayF.get(i);
            integers[i]=arrayI.get(i);
        }

        for(int i=0;i<frequencies.length-1;i++){
            for(int j=0;j<frequencies.length-1-i;j++){
                if(frequencies[j]>frequencies[j+1]){
                    int temp=integers[j];
                    integers[j]=integers[j+1];
                    integers[j+1]=temp;

                    int temp1=frequencies[j];
                    frequencies[j]=frequencies[j+1];
                    frequencies[j+1]=temp1;
                }
            }
        }

        int[] result=new int[k];
        int m=integers.length-1;
        int t=0;
        while(t<k){
            result[t]=integers[m];
            m--;
            t++;
        }
        return result;
    }

    public static void main(String[] args) {
       int[] nums = {1,1,1,2,2,3};
       int k = 2;
       int[] topKFrequentElements=topKFrequent(nums,k);
       for(int a:topKFrequentElements){
           System.out.print(a+" ");
       }


        int[] nums1 = {1};
        int k1= 1;
        int[] topKFrequentElements1=topKFrequent(nums1,k1);
        for(int a:topKFrequentElements1){
            System.out.print(a+" ");
        }
    }
}

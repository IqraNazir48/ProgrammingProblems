public class CircularSentence {
    public static boolean isCircularSentence(String sentence) {
        String[] array=sentence.split(" ");
        for(int i=0;i<array.length-1;i++){
            int length=array[i].length();
            if(array[i].charAt(length-1)!=array[i+1].charAt(0)){
                return false;
            }
        }
        String last=array[array.length-1];
        if(array[0].charAt(0)==last.charAt(last.length()-1)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String sentence1="leetcode exercises sound delightful";
        String sentence2="eetcode";
        String sentence3="Leetcode is cool";
        System.out.println("Is Circular Sentence?: sentence1: "+isCircularSentence(sentence1));
        System.out.println("Is Circular Sentence: sentence1: "+isCircularSentence(sentence2));
        System.out.println("Is Circular Sentence: sentence1: "+isCircularSentence(sentence3));
    }
}

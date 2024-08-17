public class FinalValueOfVariableAfterPerformingOperations {
    public static int finalValueAfterOperations(String[] operations) {
        int value=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("X++") || operations[i].equals("++X")){
                value+=1;
            }
            else{
                value-=1;
            }
        }
        return value;
    }

    public static void main(String[] args) {
        String[] operations1 = {"--X","X++","X++"};
        String[] operations2 = {"++X","++X","X++"};
        System.out.println(finalValueAfterOperations(operations1));
        System.out.println(finalValueAfterOperations(operations2));
    }
}

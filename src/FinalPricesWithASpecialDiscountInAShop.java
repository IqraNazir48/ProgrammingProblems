public class FinalPricesWithASpecialDiscountInAShop {
        public static int[] finalPrices(int[] prices) {
            int[] arr = new int[prices.length];
            for (int i = 0; i < prices.length; i++) {
                int discount = 0;
                for (int j = i + 1; j < prices.length; j++) {
                    if (prices[j] <= prices[i]) {
                        discount = prices[j];
                        break;
                    }
                }
                arr[i] = prices[i] - discount;
            }
            return arr;
        }

    public static void main(String[] args) {
        int[] prices={8,4,6,2,3};
        int[] finalPrices=finalPrices(prices);
        System.out.print("Prices: ");
        for(int a:prices){
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.print("Final Prices: ");
        for(int a:finalPrices){
            System.out.print(a+" ");
        }
        System.out.println();
    }

}

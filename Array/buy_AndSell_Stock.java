public class buy_AndSell_Stock {
    public static int buySellStock(int price[]){
        int buyPrice=Integer.MAX_VALUE;// min price of stock while purchasing
        int maxProfit=0; // Maximum value of stock 

        for(int i=0;i<price.length;i++){
          
            if(buyPrice<price[i]){ // profit
            int profit=price[i]-buyPrice;
            maxProfit=Math.max(maxProfit,profit);
            }
            else{
                buyPrice=price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int price[]={7,1,5,3,6,4};
        System.out.println("Maximum Profit : "+buySellStock(price));
    }
}

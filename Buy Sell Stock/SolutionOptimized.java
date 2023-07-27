class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int smallestValTillNow=prices[0];

        for(int i=0;i<prices.length;i++){
            smallestValTillNow=Math.min(smallestValTillNow,prices[i]); //Lowest price till now
            int possibleProfit=prices[i]-smallestValTillNow;//Profit if sold now
            if(possibleProfit>profit){
                profit=possibleProfit;
            }
        }

        return profit;
    }
}
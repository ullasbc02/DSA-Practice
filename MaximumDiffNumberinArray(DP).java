package DAA;

public class MaximumDiffNumberinArray {
    public static int[] findMaxDifferencePair(int[] prices) {
        if (prices.length < 2) {
            return new int[]{-1, -1};  // No valid profit if fewer than 2 prices
        }
    
        int min = prices[0];
        
        int[] dp = new int[prices.length];
        dp[0] = 0;
        int res[] = new int[2];
        
    
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            
            dp[i] = Math.max(prices[i] - min, dp[i - 1]);
            if(dp[i-1]<dp[i]){
                res[0] = min;
                res[1] = prices[i];
            }
            
        }
    
        // Return the indices for buying and selling
        return res;
    }

    public static void main(String[] args) {
        int[] A = {2, 9, 7, 3, 1, 4};
        int[] result = findMaxDifferencePair(A);
        System.out.println("Pair with maximum difference: (" + result[0] + ", " + result[1] + ")");
    }
}


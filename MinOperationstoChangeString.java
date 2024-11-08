package DAA;

public class MinOperationstoChangeString {
    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();

        // Initialize DP table with appropriate sizes
        int[][] dp = new int[len1 + 1][len2 + 1];
        
        // Base case for converting an empty string to word2 using insertions
        for (int j = 1; j <= len2; j++) {
            dp[0][j] = j * 3; // Cost of insertion
        }
        
        // Base case for converting word1 to an empty string using deletions
        for (int i = 1; i <= len1; i++) {
            dp[i][0] = i * 2; // Cost of deletion
        }

        // Fill the DP table considering the new costs
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                char c1 = word1.charAt(i - 1);
                char c2 = word2.charAt(j - 1);

                if (c1 == c2) {
                    dp[i][j] = dp[i - 1][j - 1]; // No cost if characters match
                } else {
                    int deleteCost = dp[i - 1][j] + 2;    // Deletion cost
                    int insertCost = dp[i][j - 1] + 3;    // Insertion cost
                    int replaceCost = dp[i - 1][j - 1] + 4; // Substitution cost
                    dp[i][j] = Math.min(deleteCost, Math.min(insertCost, replaceCost));
                }
            }
        }
        return dp[len1][len2];
    }
    public static void main(String[] args) {
        MinOperationstoChangeString min = new MinOperationstoChangeString();
        System.out.println(min.minDistance("ababb", "aaaab"));
    }
}

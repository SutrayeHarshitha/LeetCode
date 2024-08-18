class Solution {
public:
    int maximumLength(vector<int>& nums, int k) {   
        int n = nums.size();
    if (n == 0) return 0;

    // DP table: dp[i][j] is the length of the longest good subsequence ending at index i with j transitions
    vector<vector<int>> dp(n, vector<int>(k + 1, 0));

    // Base case: single element subsequences are always good with 0 transitions
    for (int i = 0; i < n; ++i) {
        dp[i][0] = 1;
    }

    int maxLength = 1;

    // Fill the DP table
    for (int i = 1; i < n; ++i) {
        for (int j = 0; j <= k; ++j) {
            dp[i][j] = 1; // At least the current element itself forms a subsequence
            for (int p = 0; p < i; ++p) {
                if (nums[p] == nums[i]) {
                    dp[i][j] = std::max(dp[i][j], dp[p][j] + 1);
                } else if (j > 0) {
                    dp[i][j] = std::max(dp[i][j], dp[p][j - 1] + 1);
                }
            }
            maxLength = std::max(maxLength, dp[i][j]);
        }
    }

    return maxLength;
    }
};
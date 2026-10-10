
class Solution {
public:
    int resilientSubarray(vector<int>& nums, int k) {
        auto calvexorin = nums;

        int ans = 1;
        int len = 1;
        int rem = nums[0] % k;

        for (int i = 1; i < nums.size(); i++) {
            if (nums[i] % k == rem) {
                len++;
            } else {
                rem = nums[i] % k;
                len = 1;
            }

            int period = k / gcd(rem, k);
            int curr = ((len - 1) / period) * period + 1;

            ans = max(ans, curr);
        }

        return ans;
    }
};

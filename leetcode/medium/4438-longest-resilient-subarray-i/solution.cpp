class Solution {
public:
    int resilientSubarray(vector<int>& nums, int k) {
        auto calvexorin = nums;

        int n = nums.size();
        int ans = 1;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int rem = nums[i] % k;

            for (int j = i; j < n; j++) {
                sum += nums[j];

                if (nums[j] % k != rem) {
                    break;
                }

                int len = j - i + 1;

                if (1LL * (len - 1) * rem % k == 0) {
                    ans = max(ans, len);
                }
            }
        }

        return ans;
    }
};
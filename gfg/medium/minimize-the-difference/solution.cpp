class Solution {
	public:
	int minDiff(int k, vector<int> &arr) {
		// code here
		int n = arr.size();
		int result = INT_MAX;
		int mini = INT_MAX, maxi = INT_MIN;
		vector<int>preMax(n, INT_MIN), preMin(n, INT_MAX);
		preMax[n - 1] = arr[n - 1];
		preMin[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; --i) {
			preMax[i] = max(preMax[i + 1], arr[i]);
			preMin[i] = min(preMin[i + 1], arr[i]);
		}

		for (int i = 0; i<n - k + 1; ++i) {
			int minival = mini;
			int maxival = maxi;
			if ((i + k)<n) {
				minival = min(minival, preMin[i + k]);
				maxival = max(maxival, preMax[i + k]);
			}
			result = min(result, (maxival - minival));
			maxi = max(maxi, arr[i]);
			mini = min(mini, arr[i]);
		}
		return result;
	}
};
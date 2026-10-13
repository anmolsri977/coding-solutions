class Solution {
  public:
    int maxSum(vector<int>& arr, int x) {
        // code here
        int start=0;
        int sum=0;
        int ans=0;
        for(int end=0;end<arr.size();end++){
            sum+=arr[end];
            while(sum>x){
                sum-=arr[start];
                start++;
            }
            ans=max(ans,sum);
        }
        return ans;
        
    }
};
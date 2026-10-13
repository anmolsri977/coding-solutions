class Solution {
  public:
    int maxPackages(vector<int>& arr, int totalTime) {
        // code here
        int start=0;
        int ans=0;
        int sum=0;
        for(int end=0;end<arr.size();end++){
            sum+=arr[end];
            if(end-start+1>totalTime){
                sum-=arr[start];
                start++;
            }
            ans=max(ans,sum);
        }
        return ans;
    }
};
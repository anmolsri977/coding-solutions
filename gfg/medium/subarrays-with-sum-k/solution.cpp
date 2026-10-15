class Solution {
  public:
    int cntSubarrays(vector<int> &arr, int k) {
        // code here
        unordered_map<int,int> mp;
        int sum=0;
        mp[0]=1;
        int c=0;
        for(int i=0;i<arr.size();i++){
            sum+=arr[i];
           
            if(mp[sum-k]>0){
                c+=mp[sum-k];
            }
             mp[sum]++;
        }
        return c;
    }
};
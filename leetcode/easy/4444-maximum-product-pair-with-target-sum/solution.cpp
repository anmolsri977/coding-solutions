class Solution {
public:
    vector<int> maxProductPair(vector<int>& nums, int target) {
        vector<int> ans={-1,-1};
        long long p=LLONG_MIN;
        for(int i=0;i<nums.size();i++){
            for(int j=0;j<nums.size();j++){
                if(nums[i]+nums[j]==target && i!=j && nums[i]>nums[j]){
                 long long pro=1*nums[i]*nums[j];   
                    if(pro>p){
                        p=pro;
                        ans={i,j};
                    }
                }
            }
        }
    return ans;
    }
};
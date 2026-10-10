class Solution {
public:
    int maximumUniqueSubarray(vector<int>& nums) {
        int sum=0;
        unordered_map<int,int> mp;
        int start=0;int ans=0;
        for(int end=0;end<nums.size();end++){
            sum+=nums[end];
            while(mp.contains(nums[end])){
                sum-=nums[start];
                mp[nums[start]]--;
                if(mp[nums[start]]==0) mp.erase(nums[start]);
                start++;
                 
            }
            mp[nums[end]]++;
            ans=max(ans,sum);
        }
        return ans;
    }
};
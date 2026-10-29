class Solution {
public:
    bool isCovered(vector<vector<int>>& nums, int left, int right) {
    vector<int> range(pow(10,5)+2,0);
    for(int i=0;i<nums.size();i++){
      range[nums[i][0]]++;
      range[nums[i][1]+1]--;
    }
    
    for(int i=1;i<range.size();i++){
      range[i]+=range[i-1];
    }
    for(int i=left;i<=right;i++){
      if(range[i]==0) return false;
    }
    return true;
    }
};
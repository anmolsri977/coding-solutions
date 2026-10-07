class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        vector<int> a;
        vector<int> b;
        for(int i=0;i<nums.size();i++){
            if(nums[i]>=0) b.push_back(nums[i]);
            else a.push_back(nums[i]);
        }

        if(a.size()==0){
            for(int i=0;i<nums.size();i++){
                nums[i]=nums[i]*nums[i];
            }
            return nums;
        }
        if(b.size()==0){
            for(int i=0;i<nums.size();i++){
                nums[i]=nums[i]*nums[i];
            }
            reverse(nums.begin(),nums.end());
            return nums;
        }


        for(int i=0;i<a.size();i++){
            a[i]=a[i]*a[i];
        }
        reverse(a.begin(),a.end());
        for(int i=0;i<b.size();i++){
            b[i]=b[i]*b[i];
        }
        
        //forming ans array by merging
        int i=0;int j=0;int k=0;
        vector<int> ans;
        while(i<a.size() && j<b.size()){
            if(a[i]<=b[j]){
                ans.push_back(a[i]);
                i++;
            }
            else{
                ans.push_back(b[j]);
                j++;
            }
        }
        while(i<a.size()){
            ans.push_back(a[i]);i++;
        }
        while(j<b.size()){
            ans.push_back(b[j]);j++;
        }
        return ans;
    }
};
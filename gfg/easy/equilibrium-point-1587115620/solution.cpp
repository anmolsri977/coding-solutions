class Solution {
  public:
    int findEquilibrium(vector<int> &arr) {
        // code here
        int left=0;int total=0;
        for(int x:arr){
            total+=x;
        }
        int right=0;
        for(int i=1;i<arr.size();i++){
            left+=arr[i-1];
            right=total-left-arr[i];
            if(left==right){
                return i;
            }
        }
        return -1;
    }
};
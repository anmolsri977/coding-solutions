class Solution {
public:
    bool carPooling(vector<vector<int>>& trips, int capacity) {
        vector<int> diff(100002,0);
        for(int i=0;i<trips.size();i++){
            int p=trips[i][0];
            int from=trips[i][1];
            int to=trips[i][2];
            diff[from]+=p;
            diff[to]-=p;
        }
        int cap=0;int ans=0;
        for(int i=0;i<100002;i++){
            cap+=diff[i];
            ans=max(ans,cap);
        }
        return (ans<=capacity);
    }
};
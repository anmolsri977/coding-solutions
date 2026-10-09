class Solution {
public:
    int minimumCardPickup(vector<int>& cards) {
        int start=0;int c=INT_MAX;
        unordered_map<int,int> mp;
        for(int end=0;end<cards.size();end++){
            mp[cards[end]]++;
            while(mp[cards[end]]>1){
                c=min(c,end-start+1);
                mp[cards[start]]--;
                if(mp[cards[start]]==0) mp.erase(cards[start]);
                start++;
            }
           
        }
        if(c==INT_MAX) return -1;
        return c;
    }
};
class Solution {
public:
    int numberOfSubstrings(string s) {
        unordered_map<char,int> mp;
        int start=0;
        int c=0;
        int n=s.size();
        for(int end=0;end<s.size();end++){
            mp[s[end]]++;
            while(mp.size()==3){
                c+=n-end;
                mp[s[start]]--;
                if(mp[s[start]]==0) mp.erase(s[start]);
                start++;
            }
        }
        return c;
    }
};
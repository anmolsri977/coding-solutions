class Solution {
  public:
    int findSubString(string& s) {
        // code here
        unordered_set<char> st(s.begin(),s.end());
        unordered_map<char,int> m2;

        int start=0;
        int ans=INT_MAX;
        for(int end=0;end<s.length();end++){
            m2[s[end]]++;
            while(m2.size()==st.size()){
                ans=min(ans,end-start+1);
                m2[s[start]]--;
                if(m2[s[start]]==0) m2.erase(s[start]);
                start++;
            }
            
        }
        return ans;
    }
};
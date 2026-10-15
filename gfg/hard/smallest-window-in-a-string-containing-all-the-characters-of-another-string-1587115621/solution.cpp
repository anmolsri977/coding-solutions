class Solution {
  public:
    string minWindow(string &s, string &p){
        
        unordered_map<char,int> mp;
        for(int i=0;i<p.size();i++){
            mp[p[i]]++;
        }
        
        int count=0;
        int sindex=-1;
        int start=0;
        int minLen=INT_MAX;
        int m=p.size();
        int n=s.size();
        for(int end=0;end<s.size();end++){
            if(mp[s[end]]>0){
                count++;
            }
            mp[s[end]]--;
            while(count==p.size()){
                if(end-start+1<minLen){
                    minLen=end-start+1;
                    sindex=start;}
                    
                mp[s[start]]++;
                if(mp[s[start]]>0) count=count-1;
                start++;
            }
            }
        
        if(sindex==-1) return "";
        return s.substr(sindex,minLen);
    }
};
class Solution {
  public:
    bool search(string& txt, string& pat) {
        // Write your code here
        unordered_map<char,int> mp1,mp2;
        for(char c:pat){
            mp1[c]++;
        }
        int start=0;
        for(int end=0;end<txt.size();end++){
            mp2[txt[end]]++;
            if(end-start+1==pat.size()){
                 if(mp1==mp2){
                    return true;
                    }
                mp2[txt[start]]--;
                if(mp2[txt[start]]==0) mp2.erase(txt[start]);
                start++;
            }
           
        }
        return false;
    }
};
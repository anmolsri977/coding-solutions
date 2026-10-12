
class Solution {
public:
    int vowelIn(string s) {
        int count = 0;
        for(int i = 0; i < s.size(); i++) {
            char c = s[i];
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
                count++;
            }
        }
        return count;
    }

    long long countVowels(string word) {
        long long ans = 0;
        int c = 0;
        int n = word.size();

        for(int start = 0; start < n; start++) {
            for(int end = start; end < n; end++) {
                string w = word.substr(start, end - start + 1);
                c = vowelIn(w);
                ans += c;
            }
        }

        return ans;
    }
};

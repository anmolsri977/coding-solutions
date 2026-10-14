class Solution {
public:
    string findRollOut(string& s, vector<int>& roll) {
        sort(roll.begin(), roll.end());
        int i = 0;
        for (int j = 0; j < roll.size(); j++) {
            while (i < roll[j]) {
                s[i] = 'a' + (((s[i] - 'a') + roll.size() - j) % 26);
                i++;
            }
        }
        return s;
    }
};
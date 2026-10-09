class Solution {
    public int smallestSubstring(String s) {
        // code here
        int ans=Integer.MAX_VALUE;
        int c=0;
        int start=0;
        int freq[]=new int[3];
        for(int end=0;end<s.length();end++){
            freq[s.charAt(end)-'0']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                ans=Math.min(ans,end-start+1);
                freq[s.charAt(start)-'0']--;
                start++;
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
};

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int ans=0;int sum=0;int total=0;
        int start=0;int w=cardPoints.length-k;
        for(int x:cardPoints){
            total+=x;
        }
        for(int end=0;end<cardPoints.length;end++){
            sum+=cardPoints[end];
            if(end-start+1 > w){
                sum-=cardPoints[start];
                start++;
            }
            if(end-start+1==w){
                ans=Math.max(ans,total-sum);
            }
        }
        return ans;
    }
}
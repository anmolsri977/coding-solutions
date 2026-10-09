class Solution {
    public static int smallestSubWithSum(int x, int[] a) {
        // code here
        int sum=0;int ans=Integer.MAX_VALUE;
        int start=0;
        for(int end=0;end<a.length;end++){
            sum+=a[end];
            while(sum>x){
                ans=Math.min(ans,end-start+1);
                sum-=a[start];
                start++;
            }
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}

class Solution {
    public int longestOnes(int[] a, int k) {
         int start=0;int c=0;int ans=0;
    for(int end=0;end<a.length;end++){
      if(a[end]==0){ 
        c++;
        while(c>k) {
         if(a[start]==0){
          c--;
        }
        start++;
        }
      }
      ans=Math.max(ans,end-start+1);
    }
    
    return ans;
    }
}
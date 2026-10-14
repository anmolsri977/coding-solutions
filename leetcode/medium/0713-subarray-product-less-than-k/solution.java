class Solution {
    public int numSubarrayProductLessThanK(int[] a, int k) {
         if(k<=1) return 0;
    int start=0;
    Long pro=1L;int c=0;
    
    for(int end=0;end<a.length;end++){
      pro*=a[end];
      while(pro>=k){
        
        pro/=a[start];
        start++;
      }
      c+=end-start+1;
     
    }
     return c;
    }
}
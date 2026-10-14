class Solution {
    public boolean subArrayExists(int arr[]) {
        // code here
        Set<Integer> set=new HashSet<>();
        int prefix=0;
        for(int x:arr){
            prefix+=x;
            if(prefix==0 || set.contains(prefix)){
                return true;
            }
            set.add(prefix);
        }
        return false;
    }
}
class Solution {
    public boolean digSum(int x){
        int sum=0;
        while(x!=0){
            int d=x%10;
            sum+=d;
            x/=10;
        }
        return sum%2==0;
    }
    public int countEven(int num) {
        int c=0;
        for(int i=1;i<=num;i++){
            if(digSum(i)){
                c++;
            }
        }
        return c;
    }
}
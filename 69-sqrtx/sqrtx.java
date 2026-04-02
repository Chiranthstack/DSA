class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        if(x==1||x==2||x==3) return 1;

        for(int i=0;i<=(x/2)+1;i++){
            if((long)i*i>x){
                return i-1;
            }
            if((long)i*i==x) return i;
        }
        return 0;
    }
}
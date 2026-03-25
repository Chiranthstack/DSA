class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;
        int maxSpeed = 0;
        for (int pile:piles) {
        maxSpeed = Math.max(maxSpeed, pile);
        }
        while (minSpeed < maxSpeed){
            int mid = minSpeed + (maxSpeed - minSpeed)/2;
            if (canEatInTime(piles, h,mid)) {
                maxSpeed = mid;
            } else {
                minSpeed = mid + 1;
            }
        }
    return minSpeed;
    }
    public boolean canEatInTime(int[] piles, int h, int speed) {
        int hours = 0;
        for (int pile:piles) {
            hours+=(pile+speed-1)/speed; 
        }
        return hours<= h;
    }
}
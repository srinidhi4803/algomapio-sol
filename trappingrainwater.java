class Solution {
    public int trap(int[] height) {
        int water = 0;
        int n = height.length;
        int [] maxr = new int [n];
        maxr[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            if(maxr[i+1]<=height[i])
            maxr[i] = height[i];
            else
            maxr[i] = maxr[i+1];
        }
        int maxl = height[0];
        for(int i=1; i<n; i++){
            if(maxl<=height[i])
            maxl = height[i];
            water += Math.min(maxl, maxr[i])-height[i];
        }
        return water;
    }
}
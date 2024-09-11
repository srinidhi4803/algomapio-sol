class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int [] sq = new int [n];
        int p1 = 0; int p2 = n-1;
        int i = n-1;
        while(p1<=p2){
            if(Math.abs(nums[p1])>Math.abs(nums[p2])){
            sq[i--] = nums[p1]*nums[p1];
            p1++;
            }
            else{
            sq[i--] = nums[p2]*nums[p2];
            p2--;
            }
        }
        return sq;
    }
}
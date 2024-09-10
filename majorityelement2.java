import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num: nums)
        hm.put(num, hm.getOrDefault(num, 0)+1);
        int n = nums.length/2;
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            if(entry.getValue()>n)
            return entry.getKey();
        }
        return 0;
    }
}
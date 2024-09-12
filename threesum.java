class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> ans = new ArrayList <>();
    int n = nums.length;
    Arrays.sort(nums);
   for(int i=0; i<n; i++){
    int k = 0 - nums[i];
    ArrayList <ArrayList<Integer>> l = twoSum(nums, n, k, i);
    for(ArrayList<Integer> il: l){
    if(!il.isEmpty()) {
        il.add(nums[i]);
        Collections.sort(il);
    }
    
    
    if(!il.isEmpty()&&!ans.contains(il)){
     //  l.add(nums[i]);
        ans.add(il);
    }
    }
   }
   return ans;
  }

  public static ArrayList<ArrayList<Integer>> twoSum(int nums[], int n, int k, int idx){
     int p1 = 0, p2 = n-1;
       ArrayList<ArrayList<Integer>> l = new ArrayList<>(); 
     while(p1<p2){
        if(nums[p1]+nums[p2]==k&&p1!=idx&&p2!=idx){
           ArrayList<Integer> al = new ArrayList <>();
           al.add(nums[p1]);
           al.add(nums[p2]);
           l.add(al);
           
        }
        else if(nums[p1]+nums[p2]>k) p2--;
        else p1++; 
     }
     return l;
  }
}

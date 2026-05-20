class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // ArrayList<Integer> cars = new ArrayList<Integer>();
        int n=nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
       for(int num:nums){
        map.put(num , map.getOrDefault(num , 0) +1);
       }
       //keySet is like iterate over keys the nums here
       //get is like get the value against that key 
       List<Integer>  set = new ArrayList<>();
       for(int key : map.keySet())
       if(map.get(key) > n/3){
        set.add(key);
       }
        return set;
    }
}
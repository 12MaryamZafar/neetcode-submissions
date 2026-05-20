class Solution {
    public int longestConsecutive(int[] nums) {
      //hashset with O(1)lookup and insertions.
      //rest was the logic we did from solution and then dry run.  
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        int longest=0;
        for (int num:set){
            if(!set.contains(num-1)){
              int length=1;
              while(set.contains(num+length)){
                length++;

              }
              longest=Math.max(longest,length);
            }

        }
        return longest;
    }
}

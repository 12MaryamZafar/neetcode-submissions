class Solution {
    public int subarraySum(int[] nums, int k) {
/*Keep adding numbers.
Ask: “Have I seen a total before that would make the remaining part equal to k?”
If yes → increase count.
Then record current total.
So in plain words, each step does this:
Add current number to total.
Calculate what earlier total we need.
Check how many times that total happened before.
Add that count to answer.
Then record current total.*/

int count=0, currSum=0;
HashMap<Integer, Integer> hashmap = new HashMap<>();
hashmap.put(0,1);
for(int num: nums){
    currSum+=num;
    int diff= currSum-k;
    count += hashmap.getOrDefault(diff,0);
    hashmap.put(currSum, hashmap.getOrDefault(currSum,0)+1);


}
return count;


    }
}
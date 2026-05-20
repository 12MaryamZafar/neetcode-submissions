class Solution {
    public int majorityElement(int[] nums) {
    
     int candidate=0;
     int count=0;

     for(int num: nums){ //Boyer-Moore Voting Algorithm
     //like how many times certain candidate occured.
     //if count is 0 assign new candidate
     //if count is equal to num count++ means occurance.
     //else decrement count --> this is the key here.
        if(count==0){
           candidate=num;
        }
        if(num == candidate){
            count++;
        }else{
            count--;
        }
     }
     return candidate;

    }
}
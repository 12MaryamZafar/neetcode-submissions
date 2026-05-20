class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //simply using teo pinters 
        //first we thought set is a good choice but 
        //the array is already sorted so simply left and right pointer
        //is a good approach
        int left=0;
        int right=numbers.length-1;

        for(int i=0 ; i<numbers.length; i++){
            int sum= numbers[left] + numbers[right];
            if(sum>target){
                right--;
            }
            else if(sum<target){
                left++;
            }
            
        }
        return new int [] {left+1 ,right+1} ;

    }
}

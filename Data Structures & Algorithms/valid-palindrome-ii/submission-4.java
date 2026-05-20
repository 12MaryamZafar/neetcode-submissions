class Solution {
    public boolean validPalindrome(String s) {
        //now no new substring is being created
        //isPalindrome will only run once.
        int left=0, right=s.length()-1;

        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return isPalindrome(s,left+1,right) ||
                isPalindrome(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
      
    }

    boolean  isPalindrome(String s, int left, int right ){
        // int left = 0,  right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
       } 
}
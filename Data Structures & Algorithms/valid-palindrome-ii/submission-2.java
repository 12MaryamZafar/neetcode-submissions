class Solution {
    public boolean validPalindrome(String s) {
//this is going to give us O(n^2)
//string builder O(n)
//function O(n)
//we are deleting every character
        if(isPalindrome(s)){
            return true;
        }

        for(int i=0; i<s.length()-1; i++){
            String newS = s.substring(0,i) + s.substring(i+1);
            if(isPalindrome(newS)){
                return true;
            }
        }
        return false;
      
    }

    boolean  isPalindrome(String s){
        int left = 0,  right = s.length()-1;
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
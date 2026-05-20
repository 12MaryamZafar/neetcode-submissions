class Solution {
    public boolean isPalindrome(String s) {
        int left=0, right= s.length()-1;

        while (left<right){
            //below whiles are for checking alphanumeric if character is not it moves, jsut right for?
            while(left<right && !alphaNum(s.charAt(left))){
                left++;
            }
            while(right>left && !alphaNum(s.charAt(right))){
                right--;
            } 
            if(Character.toLowerCase(s.charAt(left)) != 
            Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
//it tells Is this character alphanumeric?
    public boolean alphaNum(char ch){
        return(ch >= 'A' && ch<= 'Z' 
        || ch>= 'a' && ch<= 'z'
        || ch>= '0'&& ch<='9' );
    }
}

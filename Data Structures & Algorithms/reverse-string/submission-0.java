class Solution {
    public void reverseString(char[] s) {
        //because using s.length were making it wrong
        //dry-run self explained it so n/2 works.
        for(int i=0; i<s.length/2;i++ ){  
            int val = s.length-1-i;
            char temp=s[i];
            s[i] =  s[val];
            s[val] = temp;

        }
    }
}
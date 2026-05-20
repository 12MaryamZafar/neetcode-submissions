class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        for(int j=0 ; j<strs[0].length() ; j++){
            char currentChar = strs[0].charAt(j);

            for(int i=1 ; i<strs.length ; i++){
                if(j >= strs[i].length() || strs[i].charAt(j)!=currentChar){
                    return sb.toString();
                }
            }
            sb.append(currentChar);
        }
        return sb.toString();
    }
}
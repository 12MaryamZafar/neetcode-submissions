class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length()!=t.length()) return false;

        HashMap<Character, Integer> sString = new HashMap<>();
        HashMap<Character, Integer> tString = new HashMap<>();

        for(int i=0; i< s.length(); i++){
            sString.put(s.charAt(i), sString.getOrDefault(s.charAt(i),0) + 1 );
            tString.put(t.charAt(i), tString.getOrDefault(t.charAt(i),0) + 1 );
        }
        return sString.equals(tString);

    }
}

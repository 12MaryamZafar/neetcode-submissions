class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String, List<String>> anagram = new HashMap<>();

     for (String s: strs){
        int[] newArr = new int[26];
        for(char c:s.toCharArray()){
            newArr[c-'a']++;
        }
        String key = Arrays.toString(newArr);
            anagram.putIfAbsent(key, new ArrayList<>());
            anagram.get(key).add(s);
     }
      
      return new ArrayList<>(anagram.values());
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String, List<String>> anagram = new HashMap<>();

      for(String s: strs){
        char[] newArr = s.toCharArray();
        Arrays.sort(newArr);
        String newS = new String(newArr);
        anagram.putIfAbsent(newS , new ArrayList<>());
        anagram.get(newS).add(s);
      }
      return new ArrayList<>(anagram.values());
    }
}

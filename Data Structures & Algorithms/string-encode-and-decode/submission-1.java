class Solution {

    public String encode(List<String> strs) {

        if(strs.isEmpty()){
            return "";
        }
        List<Integer> sizes = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (String s: strs){
            sizes.add(s.length());
            sb.append(s.length());
            sb.append(',');
        }
        sb.append('#');
        for (int i=0; i<strs.size() ; i++){
            sb.append(strs.get(i));
        }
        return sb.toString();
 
    }

    public List<String> decode(String str) {

        if (str.isEmpty()) return new ArrayList<>();
        int i;
        StringBuilder sb2 = new StringBuilder();
        List<Integer> list2 = new ArrayList();
        List<String> decoded = new ArrayList();
        for( i=0 ; str.charAt(i) != '#' ; i++){

            if(str.charAt(i)!= ','){
                sb2.append(str.charAt(i));
            }
            else if(str.charAt(i) == ','){
                int value = Integer.parseInt(String.valueOf(sb2));
                list2.add(value);
                sb2.delete(0,sb2.length());

            }

        }
        int start = i+1;
        for(int size:list2 ){
            decoded.add(str.substring(start , start+size));
            start=start+size;
        }
        return decoded;
    }
}

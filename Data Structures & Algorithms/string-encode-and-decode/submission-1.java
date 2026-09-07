class Solution {

    public String encode(List<String> strs) {


        String result="";

        for(int i=0;i<strs.size();i++) {
          String first = strs.get(i);
           result = result+first.length()+"#"+first;
        }

      return result;

    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int i=0;
        while(i<str.length()) {
            int hashIndex = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i, hashIndex));
            int startIndex = hashIndex + 1;
            int endIndex = startIndex + len;
            String res = str.substring(startIndex, endIndex);
            strs.add(res);
            i = endIndex;
        }

        return strs;

    }
}

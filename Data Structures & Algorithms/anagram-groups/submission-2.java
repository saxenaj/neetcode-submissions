class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> tempmap = new HashMap();
        List<List<String>> result = new ArrayList();

        for(int i=0;i<strs.length;i++) {
            char [] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String sorted = new String(temp);
            if(tempmap.containsKey(sorted)) {
                tempmap.get(sorted).add(strs[i]);
            }
            else {
                List<String> newlist = new ArrayList();
                newlist.add(strs[i]);
                tempmap.put(sorted,newlist);
            }
            
        }

        tempmap.forEach((key, value) -> {
        result.add(value);
    });
        return result;

    }
}

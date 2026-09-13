class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) {
            return 0;
        }
        int maxcount=1;
        Set<Character> set = new HashSet<>();
         int l=0;
         int r=0;
         while(r<s.length()) {
          if(!set.contains(s.charAt(r))) {
            set.add(s.charAt(r));
            if(maxcount < set.size()) {
            maxcount = set.size();
           }
           r++;
          }
          else{
           
           set.remove(s.charAt(l));
           l++;
          }

         }

         return maxcount;

    }
}

class Solution {
    public boolean isPalindrome(String s) {
      StringBuilder sb = new StringBuilder();
      boolean result = true;;
     for(int i=0;i<s.length();i++){
        if(Character.isLetterOrDigit(s.charAt(i))){
            sb.append(s.charAt(i));
          }
     } 
    
    int startIndex=0;
    int endIndex=sb.length()-1;
    String lowercaseStr = sb.toString().toLowerCase();

    while(startIndex<endIndex) {
        if(lowercaseStr.charAt(startIndex) != lowercaseStr.charAt(endIndex)) {
          result = false;
          break;
        }
        startIndex++;
        endIndex--;

    }
    return result;
    }
}

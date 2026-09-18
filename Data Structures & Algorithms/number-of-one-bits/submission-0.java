class Solution {
    public int hammingWeight(int n) {
        String bin = Integer.toBinaryString(n);
        System.out.println(bin);
        int result = 0;

        for(int i=0;i<bin.length();i++) {
            if(bin.charAt(i) == '1'){
            result++;
            }
        }

        return result;
    }
}

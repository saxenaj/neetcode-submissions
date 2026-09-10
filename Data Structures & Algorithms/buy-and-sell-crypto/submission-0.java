class Solution {
    public int maxProfit(int[] prices) {
        int maxP=0;
        

for(int i=0;i<prices.length;i++) {
int forwardIndex=prices.length-1;
while(forwardIndex>i) {
 
 int tmpP=prices[forwardIndex]-prices[i];
 if(tmpP>maxP) {
    maxP = tmpP;
 }
 forwardIndex--;

}

}

return maxP;
    }
}

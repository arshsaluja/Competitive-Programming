class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        // [1,2,0,0], k = 34
        // [1,2,0,34], k = 34
        // [1,2,0+3,4], k = 34
        // [1,2,3,4], k = 34
        // [2,1,5+806], k = 806
        // [2,1,811], k = 806
        // [2,1+81,1], k = 806
        // [2,82,1], k = 806
        // [10,2,1], k = 806
        // [1,0,2,1], k = 806
        // 1- traverse the array from back
        // 2-add k to traversed digit-> and change the vale of k to k/10 and set last digit to k%10
        // 3- do this in a loop.
        int i=num.length;
        List<Integer> inList=new ArrayList<>();
while(--i>=0 ||k>0)
{
if(i>=0)
k+= num[i];
inList.add(k%10);
k/=10;
}
Collections.reverse(inList);

return inList;
    }
}

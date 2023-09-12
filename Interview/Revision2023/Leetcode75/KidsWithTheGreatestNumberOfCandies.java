
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        List<Boolean> result=new ArrayList<>();
        for(int i:candies)
        {
            max=Math.max(max,i);
        }
        for(int i:candies)
        {
            if(i+extraCandies>=max)
            result.add(true);
            else
            result.add(false);
        }
        return result;
    }
}

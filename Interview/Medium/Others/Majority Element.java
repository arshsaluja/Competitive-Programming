class Solution {
    public int majorityElement(int[] nums) {
        //hashmap
        HashMap <Integer,Integer> h=new HashMap<>();
        for(int i:nums)
        {
            if(h.containsKey(i))
            {
                h.put(i,h.get(i)+1);
            }
            else
                h.put(i,1);
        }
         Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }

        return majorityEntry.getKey();
    }
}

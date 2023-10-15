class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        Set<Integer> key=new HashSet<>();
        Set<Integer> value=new HashSet<>();

        for(int i:arr) key.add(i);
        for(int s:key){
            int count=0;
        for(int i=0;i<arr.length;i++){
            if(s==arr[i]) count++;
            else if(count>0) break;
        }
        value.add(count);
        }
        if(key.size()==value.size()) return true;
        return false;
        
    }
}

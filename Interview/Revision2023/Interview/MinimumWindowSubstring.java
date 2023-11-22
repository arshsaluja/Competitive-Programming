class Solution {
    public String minWindow(String s, String t) {
        int st=0;int end=0;
        int t1=t.length();
        HashMap<Character,Integer> map=new HashMap<>();
      
        for(int i=0;i<t1;i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        
        int count=0,min=Integer.MAX_VALUE,head=0;
        while(end<s.length()){
            char ch=s.charAt(end);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)>=0) count++;
                
            }
            end++;
            
            while(count==t.length()){
                if(min>end-st){
                    min=end-(head=st);
                }
                char sch=s.charAt(st);
                if(map.containsKey(sch)){
                    map.put(sch,map.get(sch)+1);
                    if(map.get(sch)>0) count --;
                }
                st++;
                
            }
        }
        if(min==Integer.MAX_VALUE)
        return "";
        return s.substring(head,head+min);
    }
}

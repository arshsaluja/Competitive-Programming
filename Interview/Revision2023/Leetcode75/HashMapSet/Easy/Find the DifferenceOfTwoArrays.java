class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
     Set<Integer> s1=new HashSet<>();
     Set<Integer> s2=new HashSet<>();
     for(int i:nums1)
     s1.add(i);   
     for(int i:nums2)
     s2.add(i);

List<Integer> a1=new ArrayList<>();
     for(int i:s1){
         if(!s2.contains(i)) a1.add(i);
     }
List<Integer> a2=new ArrayList<>();
     for(int i:s2){
         if(!s1.contains(i)) a2.add(i);
     }
 List<List<Integer>> res=new ArrayList<>();   
 res.add(a1);
 res.add(a2);
  
  return res;
    }
}

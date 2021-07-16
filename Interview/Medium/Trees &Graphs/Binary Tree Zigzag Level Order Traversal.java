/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List <Integer> a=new ArrayList<>();
       List<List<Integer>> b=new ArrayList<>();
        if(root==null) return b;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        a.add(root.val);
        b.add(a);
        int c=1;
        while(!q.isEmpty())
        {
             a=new ArrayList<>();
            int p=q.size();
             System.out.println("q "+   q.size());
            for(int i=0;i<p;i++)
            {
            TreeNode t=q.peek();
                   System.out.println("t "+t.val);

            
                   // System.out.println("q "+q);
             // if(c%2==0)
             // {
                 if(t.left!=null)
            {
                      System.out.println("t.left "+t.left.val);
                a.add(t.left.val);
                q.add(t.left);
                }
            
            if(t.right!=null)
            {
                System.out.println("t.right "+t.right.val);
                a.add(t.right.val);
                q.add(t.right);
                }
             //}
            //  else
            //  {
            //      if(t.right!=null)
            // {
            //     a.add(t.right.val);
            //     q.add(t.right);
            //     }
            //      if(t.left!=null)
            // {
            //     a.add(t.left.val);
            //     q.add(t.left);
            //     }
            //  }
            
            q.remove();
        System.out.println("a "+a);
        System.out.println("b "+b);
            //Collections.sort(a,Collections.reverseOrder());
            }
if(a.size()>0)
{
            b.add(a);
            //c++;
}
        }
        for(int i=0;i<b.size();i++)
        {
            if(i%2!=0)
            {
               List <Integer> k=b.get(i);
                b.remove(i);
                System.out.println();
                List <Integer> l=new ArrayList<>();
                int m=0;
                for(int j=k.size()-1;j>=0;j--)
                {
                   l.add(k.get(j)); 
                    m++;
                }
                
                b.add(i,l);
                
            }
        }
  System.out.println(c);
        return b;
    }
}

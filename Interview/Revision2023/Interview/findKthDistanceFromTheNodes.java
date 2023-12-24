// Java implementation of the approach
import java.io.*;
class solution
{
    
    // 2, 7, 8
    // public  void map(TreeNode node,TreeNode root,Map<TreeNode,TreeNode> m){
    //     if(node!=null){
    //         m.put(node,root);
    //         map(node.left,node,m);
    //         map(node.right,node,m);
    //     }
    // }
    void bfs(TreeNode target,int k,Map<TreeNode,TreeNode> m,List<Integer> res){
        Queue<TreeNode> q=new LinkedList<>();
        q.add(target)
        
        int dis=0;
        
        while(!q.isEmpty()&&dis<k){
            int size=q.size();
            
            for(int i=0;i<size;i++){
                TreeNode cur=q.poll();
                
                if(cur.left!=null&& !visited.contains(cur.left)){
                    q.add(cur.left);
                    visited.add(cur.left);
                }
                if(cur.right!=null&& !visited.contains(cur.right)){
                    q.add(cur.right);
                    visited.add(cur.right);
                }
                TreeNode parent=m.get(cur);
                
                if(parent!=null&& !visited.contains(parent)){
                    q.add(parent);
                    visited.add(parent);
                }
            }
            dis++;
        }
        
        while(!q.isEmpty()){
            result.add(q.poll().val);
        }
    }
    public TreeNode findTarget(TreeNode root,int tarValue){
        if(root==null) return null;
        
       if(root.left!=null){
           m.put(root.left,root);
       }
       if(root.right!=null){
           m.put(root.right,root);
       }
      
        
        if(root.val==tarValue) return root;
        
        TreeNode l=findTarget(root.left,tarValue);
        TreeNode r=findTarget(root.right,tarValue);
        
        return l!=null? l:r;
        
    }
    void dfs(TreeNode node, int k,List<Integer> result, Set<TreeNode> visited){
        if(node==null||visited.contains(node)) return;
        
        visited.add(node);
        
        
        if(k==0){
            result.add(node.val);
            return;
        }
        
        dfs(node.left,k-1, result,visited);
        dfs(node.right,k-1,result,visited);
    }
    
public static void main (String[] args)
{

}
}

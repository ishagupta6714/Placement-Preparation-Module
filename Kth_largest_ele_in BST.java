class Solution
{
    public int ans;
    ArrayList<Integer> a =new ArrayList<>();
    // return the Kth largest element in the given BST rooted at 'root'
   public void inorder(Node root,ArrayList<Integer> a){
        if(root==null)
        return;
        inorder(root.left,a);
     /*   if(k==c){
            ans=root.data;
            c++;
            return;
        }
        else
        c++;*/
        a.add(root.data);
        inorder(root.right,a);
    }
    public int kthLargest(Node root,int K)
    {
        //Your code here
      //  int c=1;
    //    ans=-1;
        inorder(root,a);
        int n=a.size();
        ans=a.get(n-K);
       return ans;
    }
}

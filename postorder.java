public static void postOrder(Node root) {
        if(root==null)
        return;
Stack <Node> s1=new Stack<Node>();
Stack <Node> s2=new Stack<Node>();
s1.push(root);
while(!s1.isEmpty()){
    Node v=s1.peek();
    s1.pop();
    s2.push(v);
    if(v.left!=null)
    s1.push(v.left);
    if(v.right!=null)
    s1.push(v.right);
    
}
while(!s2.isEmpty()){
    System.out.print(s2.peek().data+" ");
    s2.pop();
}
    }

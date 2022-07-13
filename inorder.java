  public static void inOrder(Node root) {
Stack<Node> s=new Stack<>();
while(true){
    if(root!=null){
    s.push(root);
    root=root.left;
    }
    else{
        if(s.isEmpty())
        break;
        root=s.peek();
        System.out.print(root.data +" ");
        s.pop();
        root=root.right;
    }
}
    }

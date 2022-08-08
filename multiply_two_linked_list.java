class GfG{
  /*You are required to complete this method */
   public long multiplyTwoLists(Node l1,Node l2){
          //add code here.
          long num1=0,num2=0,n=1000000007;
          while(l1!=null||l2!=null){
              if(l1!=null){
                  num1=(num1*10)%n+l1.data;
                  l1=l1.next;
              }
              if(l2!=null){
                  num2=(num2*10)%n+l2.data;
                  l2=l2.next;
              }
          }
          return ((num1%n)*(num2%n))%n;
   }
}

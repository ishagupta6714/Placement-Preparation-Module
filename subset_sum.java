class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        ArrayList<Integer> ssum=new ArrayList<>();
        if(arr.length==0)
        return false;
        solve(0,0,arr,ssum);
        Collections.sort(ssum);
        if(ssum.contains(sum))
        return true;
        else
        return false;
        
    }
    static void solve(int indx,int s,int [] arr,ArrayList<Integer> ssum){
        if(indx==arr.length){
         ssum.add(s);
         return;
        }
        solve(indx+1,s+arr[indx],arr,ssum);
        solve(indx+1,s,arr,ssum);
    }
}

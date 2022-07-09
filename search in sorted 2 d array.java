class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int i = 0, j = matrix[0].length - 1;
      while(i < matrix.length && j >= 0) {
        if(matrix[i][j] == target)
          return true;
        else if(matrix[i][j] > target)
          j --;
        else if(matrix[i][j] < target)
          i ++;
      }
      return false;
    }
}

//Using binary Search
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0;
        int n=matrix.length;
        int m=matrix[0].length;
        int high=n*m-1;
        while(low<=high){
            int mid=(low+(high-low)/2);
            if(matrix[mid/m][mid%m]>target)
                high=mid-1;
                else if(matrix[mid/m][mid%m]<target)
                    low=mid+1;
            else
                return true;

        }
        return false;
    }
}

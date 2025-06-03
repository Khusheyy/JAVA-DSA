import java.util.ArrayList;
import java.util.List;

//Given an m x n matrix, return all elements of the matrix in spiral order.
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [1,2,3,6,9,8,7,4,5]
public class spiral_matrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
       List<Integer> list = spiral(arr);
        System.out.println(list);
    }
    static List<Integer> spiral(int[][] arr){
       List<Integer> list = new ArrayList<>();

       int m = arr.length;
       int n = arr[0].length;

       int left = 0;
       int right = n-1;
       int top = 0;
       int bottom = m-1;

       while(left<=right && top<=bottom){
           for(int j=left ; j<=right;j++){
               list.add(arr[top][j]);
           }
           top++;
           for(int i = top;i<=bottom;i++){
               list.add(arr[i][right]);
           }
           right--;
           if (top <= bottom) {
               for(int j=right;j>=left;j--){
                   list.add(arr[bottom][j]);
               }
               bottom--;
           }
           if(left<=right){
               for(int i=bottom;i>=top;i--){
                   list.add(arr[i][left]);
               }
               left++;
           }
       }
        return list;
    }
}

import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {
   public static void main(String[] args) {
      int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
      List<Integer> list = spiral(arr);
      System.out.println(list);
   }

   static List<Integer> spiral(int[][] arr) {
      List<Integer> list = new ArrayList();
      int m = arr.length;
      int n = arr[0].length;
      int left = 0;
      int right = n - 1;
      int top = 0;
      int bottom = m - 1;

      while(left <= right && top <= bottom) {
         int i;
         for(i = left; i <= right; ++i) {
            list.add(arr[top][i]);
         }

         ++top;

         for(i = top; i <= bottom; ++i) {
            list.add(arr[i][right]);
         }

         --right;
         if (top <= bottom) {
            for(i = right; i >= left; --i) {
               list.add(arr[bottom][i]);
            }

            --bottom;
         }

         if (left <= right) {
            for(i = bottom; i >= top; --i) {
               list.add(arr[i][left]);
            }

            ++left;
         }
      }

      return list;
   }
}

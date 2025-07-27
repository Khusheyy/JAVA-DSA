import java.util.Arrays;

public class spiral_010 {
   public static void main(String[] args) {
      int[][] ans = spiral2(3);
      int[][] var2 = ans;
      int var3 = ans.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         int[] row = var2[var4];
         System.out.println(Arrays.toString(row));
      }

   }

   static int[][] spiral2(int n) {
      int[][] arr = new int[n][n];
      int left = 0;
      int right = n - 1;
      int top = 0;
      int bottom = n - 1;
      int num = 1;

      while(true) {
         int i;
         do {
            if (num > n * n) {
               return arr;
            }

            for(i = left; i <= right && num <= n * n; ++i) {
               arr[top][i] = num++;
            }

            ++top;

            for(i = top; i <= bottom && num <= n * n; ++i) {
               arr[i][right] = num++;
            }

            --right;
            if (top <= bottom) {
               for(i = right; i >= left && num <= n * n; --i) {
                  arr[bottom][i] = num++;
               }

               --bottom;
            }
         } while(left > right);

         for(i = bottom; i >= top && num <= n * n; --i) {
            arr[i][left] = num++;
         }

         ++left;
      }
   }
}

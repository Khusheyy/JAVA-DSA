import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// spiral matrix 2 : numns from 1 to n2
// exact same as spiral 001 , but he we store from num=1 at each position and then num++
public class spiral_010 {
    public static void main(String[] args) {
        int[][] ans = spiral2(3);
        for (int[] row : ans) {
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

        while (num <= n * n) {
            for (int j = left; j <= right && num <= n * n; j++) {
                arr[top][j] = num++;
            }
            top++;
            for (int i = top; i <= bottom && num <= n * n; i++) {
                arr[i][right] = num++;
            }
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left && num <= n * n; j--) {
                    arr[bottom][j] = num++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top && num <= n * n; i--) {
                    arr[i][left] = num++;
                }
                left++;
            }
        }
        return arr;
    }
}


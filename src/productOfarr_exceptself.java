import java.util.Arrays;

public class productOfarr_exceptself {
   public static void main(String[] args) {
      int[] arr = new int[]{1, 2, 3, 4};
      System.out.println(Arrays.toString(productExceptSelf(arr)));
   }

   static int[] productExceptSelf(int[] nums) {
      int n = nums.length;
      int[] result = new int[n];
      int prefixProduct = 1;

      int suffixProduct;
      for(suffixProduct = 0; suffixProduct < n; ++suffixProduct) {
         result[suffixProduct] = prefixProduct;
         prefixProduct *= nums[suffixProduct];
      }

      suffixProduct = 1;

      for(int i = n - 1; i >= 0; --i) {
         result[i] *= suffixProduct;
         suffixProduct *= nums[i];
      }

      return result;
   }
}

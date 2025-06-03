// PRODUCT OF ARR EXCEPT SELF
// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//You must write an algorithm that runs in O(n) time and without using the division operation.
//

import java.util.Arrays;

public class productOfarr_exceptself {
    public static void main(String[] args) {
      int[] arr = {1,2,3,4};
      //productExceptSelf(arr);
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    static int[] productExceptSelf(int[] nums) {
//        int[] ans = new int[nums.length];
//       int index = 0;
//        for (int i = 0; i <nums.length ; i++) {
//            nums[i]=1;
//            int product = 1;
//            for (int j = 0; j < nums.length; j++) {
//                product = product * nums[j];
//            }
//            ans[index] = product;
//            index++;
//        }
//        return ans;


        int n = nums.length;
        int[] result = new int[n];

        // First pass: Calculate prefix products
        int prefixProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = prefixProduct;
            prefixProduct *= nums[i];
        }

        // Second pass: Calculate suffix products and combine
        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }

        return result;
    }
}

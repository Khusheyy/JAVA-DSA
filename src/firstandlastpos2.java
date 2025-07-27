import java.util.Arrays;

class firstandlastpos2 {
   public static void main(String[] args) {
      int[] arr = new int[]{2, 4, 6, 8, 8, 8, 10, 13};
      System.out.println(Arrays.toString(searchRange(arr, 9)));
   }

   static int[] searchRange(int[] nums, int target) {
      int[] result = new int[]{findfirstindex(nums, target), findlastindex(nums, target)};
      return result;
   }

   private static int findfirstindex(int[] nums, int target) {
      int index = -1;
      int start = 0;
      int end = nums.length - 1;

      while(start <= end) {
         int mid = start + (end - start) / 2;
         if (nums[mid] >= target) {
            end = mid - 1;
         } else {
            start = mid + 1;
         }

         if (nums[mid] == target) {
            index = mid;
         }
      }

      return index;
   }

   private static int findlastindex(int[] nums, int target) {
      int index = -1;
      int start = 0;
      int end = nums.length - 1;

      while(start <= end) {
         int mid = start + (end - start) / 2;
         if (nums[mid] <= target) {
            start = mid + 1;
         } else {
            end = mid - 1;
         }

         if (nums[mid] == target) {
            index = mid;
         }
      }

      return index;
   }
}

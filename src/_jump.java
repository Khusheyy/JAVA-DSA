public class _jump {
   public static void main(String[] args) {
      int[] arr = new int[]{3, 2, 1, 0, 4};
      System.out.println(canJump(arr));
   }

   public static boolean canJump(int[] nums) {
      int maxReach = 0;

      for(int i = 0; i <= maxReach && i < nums.length; ++i) {
         maxReach = Math.max(maxReach, i + nums[i]);
         if (maxReach >= nums.length - 1) {
            return true;
         }
      }

      return false;
   }
}

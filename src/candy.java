

public class candy {
   public static int candy1(int[] ratings) {
      int count = 0;
      int n = ratings.length;
      int[] candies = new int[n];

      int i;
      for(i = 0; i < n; ++i) {
         candies[i] = 1;
      }

      for(i = 1; i < n; ++i) {
         if (ratings[i] > ratings[i - 1]) {
            candies[i] = candies[i - 1] + 1;
         }
      }

      for(i = n - 1; i > 0; --i) {
         if (ratings[i - 1] > ratings[i]) {
            candies[i - 1] = Math.max(candies[i] + 1, candies[i - 1]);
         }

         count += candies[i - 1];
      }

      return count + candies[n - 1];
   }

   public static void main(String[] args) {
      int[] arr = new int[]{1, 2, 4, 2};
      System.out.println(candy1(arr));
      System.out.println("end of code");


   }

}

public class valid_anagram {
   public static void main(String[] args) {
      boolean ans = isvalid("anagram", "nagaram");
      System.out.println(ans);
   }

   static boolean isvalid(String s, String t) {
      if (s.length() != t.length()) {
         return false;
      } else {
         char[] char_counts = new char[26];

         for(int i = 0; i < s.length(); ++i) {
            ++char_counts[s.charAt(i) - 97];
            --char_counts[t.charAt(i) - 97];
         }

         char[] var7 = char_counts;
         int var4 = char_counts.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            int count = var7[var5];
            if (count != 0) {
               return false;
            }
         }

         return true;
      }
   }
}

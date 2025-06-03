import java.util.Arrays;

//valid anagram is the string , with just re-arranged letters
public class valid_anagram {
    public static void main(String[] args) {
        boolean ans = isvalid("anagram","nagaram");
        System.out.println(ans);
    }
    static boolean isvalid(String s , String t){
//        char[] ch1 = s.toCharArray();
//        char[] ch2 = t.toCharArray();
//
//
//        Arrays.sort(ch1);
//        Arrays.sort(ch2);
//
//        if(Arrays.equals(ch1, ch2)){
//            return true;
//        }
//        return false;

        if(s.length() != t.length()){
            return false;
        }

        //frequency counting , we create a char array of size 26
        char[] char_counts = new char[26];
        for (int i = 0; i < s.length(); i++) {
            // since a has num=0;
            // b=1
            char_counts[s.charAt(i)-'a']++;
            char_counts[t.charAt(i)-'a']--;
        }

        for(int count:char_counts){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}

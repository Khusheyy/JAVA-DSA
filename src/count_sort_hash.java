import java.util.Arrays;
import java.util.HashMap;

public class count_sort_hash {
    public static void main(String[] args) {
        int[] arr = {0,3,3,4,8,7,5,2};
        count_hash(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void count_hash(int[] arr){
      // count sort using hash map

        if(arr.length <= 1){
            return;
        }
//        int max=arr[0];
//        for(int nums :arr) {
//            if (nums > max) {
//                max = nums;
//            }
//        }
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        HashMap<Integer,Integer> count_map = new HashMap<>();

        for(int num:arr){
            count_map.put(num, count_map.getOrDefault(num,0)+1);
        }

        int index = 0;
        for (int i = min; i <= max ; i++) {
            int count = count_map.getOrDefault(i,0);
            for (int j = 0; j < count ; j++) {
                arr[index] = i;
                index++;
            }
        }

    }
}

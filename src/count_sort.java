import java.util.Arrays;

public class count_sort {
    public static void main(String[] args) {
        int[] arr = {0,3,3,4,8,7,5,2};
        countsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void countsort(int[] arr){
        // 1. find the maximum element
        if(arr.length == 0 || arr.length <= 1){
            return;
        }
        int max=arr[0];
        for(int nums :arr) {
            if (nums > max) {
                max = nums;
            }
        }
        // create a new count_array of size[max+1]
        //this will count the occurrence of the arr elements
        int[] CountArr = new int[max + 1];
        for(int nums :arr){
            CountArr[nums]++;
        }
//        for (int i = 0; i < N; i++) {
//            countArray[inputArray[i]]++;
//        }

        int index = 0;
        for (int i = 0; i <= max ; i++) {
            while(CountArr[i]>0){
                arr[index] = i;
                index++;
                CountArr[i]--;
            }
        }
    }
}

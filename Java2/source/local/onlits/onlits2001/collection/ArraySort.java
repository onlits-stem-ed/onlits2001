package local.onlits.onlits2001.collection;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = { 67, 4, 32, 50, 9 };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        for(int i: arr)
            System.out.println(i);
        
        arr[5] = 40;
    }
}
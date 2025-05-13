import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Original Array: " + Arrays.toString(arr));

        reverse(arr);

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    // Function to reverse the array
    public static void reverse(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            // swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}

import java.util.Arrays;

public class removeDuplicates2{
    public static void main(String[] args) {
        int[] arrWithDupes = {0, 0, 1, 1, 1, 1, 2, 2, 3, 4, 4, 4, 5};
        int[] arrWithoutDupes = {1, 2, 3, 4, 5};
        int[] emptyArray = {};
        
        System.out.println("Original array with duplicates: " + Arrays.toString(arrWithDupes));
        int uniqueCount = removeDuplicates(arrWithDupes);
        System.out.println("After removing duplicates: " + 
                          Arrays.toString(Arrays.copyOf(arrWithDupes, uniqueCount)));
        
        System.out.println("\nOriginal array without duplicates: " + Arrays.toString(arrWithoutDupes));
        uniqueCount = removeDuplicates(arrWithoutDupes);
        System.out.println("After removing duplicates: " + 
                          Arrays.toString(Arrays.copyOf(arrWithoutDupes, uniqueCount)));//giving output array upto meaningful ie only different element 
        
        System.out.println("\nEmpty array test: " + Arrays.toString(emptyArray));
        uniqueCount = removeDuplicates(emptyArray);
        System.out.println("After removing duplicates: " + 
                          Arrays.toString(Arrays.copyOf(emptyArray, uniqueCount)));
    }
    
   
    public static int removeDuplicates(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }
        
        if (nums.length == 0) {
            return 0;
        }
        
        int uniqueIndex = 0;
        
        for (int current = 1; current < nums.length; current++) {
            if (nums[uniqueIndex] != nums[current]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[current];
            }
        }
        
        return uniqueIndex + 1;
    }
}
public class findMax {
    public static void main(String[] args) {
        int[] numbers = {45, 78, 23, 89, 12, 67};

        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum number is: " + max);
    }
}

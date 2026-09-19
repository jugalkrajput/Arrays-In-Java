public class MaxMinArr {
    public static void main(String[] args) {
        int[] arr = {20, 10, 4, 4, 2, 25, 15};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum:" + max);
        System.out.println("Minimum:" + min);
    }
}

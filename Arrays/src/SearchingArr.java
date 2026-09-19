import java.util.Arrays;

public class SearchingArr {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 6;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(i + " number par hai");
                break;
            }
        }

        // Linear Search
        System.out.println("linear Search");
        int[] arr1 = {10, 20, 30, 40, 50};

        int target1 = 30;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == target1) {
                System.out.println("Found at index " + i);
                break;
            }
        }

        //Binary Search

        System.out.println("Binary Search");
        int[] arr2 = {10, 20, 30, 40, 50};

        int index = Arrays.binarySearch(arr2, 30);

        System.out.println(index);

    }
}

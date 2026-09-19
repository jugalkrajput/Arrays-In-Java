import java.util.Arrays;

public class FillArr {
    public static void main(String[] args) {
        int[] arr = new int[5];

//        Arrays.fill(arr, 10);
        Arrays.fill(arr, 1, 4, 10);



        System.out.println(Arrays.toString(arr));

    }
}

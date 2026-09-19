import java.util.Arrays;

public class CopyArr {
    public static void main(String[] args) {

//        copyOf()
        System.out.println("copyOf()");
        int[] original = {10, 20, 30};

//        int[] copy = Arrays.copyOf(original, original.length);

//        We can also change the size.
        int[] copy = Arrays.copyOf(original, 5);

        System.out.println(Arrays.toString(copy));



//        copyOfRange
        System.out.println("copyOfRange");
        int[] arr = {10, 20, 30, 40, 50};

        int[] result = Arrays.copyOfRange(arr, 1, 4);

        System.out.println(Arrays.toString(result));


    }
}

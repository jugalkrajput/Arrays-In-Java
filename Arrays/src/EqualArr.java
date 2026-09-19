import java.util.Arrays;

public class EqualArr {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        System.out.println(a == b);             //False=> Because This checks whether both references point to the same array.
        System.out.println(a.equals(b));        //False=> Because This checks whether both references point to the same array.
        System.out.println(Arrays.equals(a, b));

    }
}

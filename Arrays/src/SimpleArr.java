public class SimpleArr {
    static void main(String[] args) {
        int arr[] = {10,20,30,40};
        System.out.println(arr[0]);
        System.out.println(arr[3]);
        System.out.println(arr.length);
        System.out.println(arr[arr.length-1]);
        System.out.println();

        System.out.println("Traversing an Array");
        //Traversing an Array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println();
        System.out.println("Enhanced for Loop");

        //Enhanced for Loop
        for (int value : arr) {
            System.out.println(value);
        }


            //Modifying an Array
        System.out.println();
        System.out.println("Modifying an Array:");
        System.out.println("old array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        System.out.println("Update arr [1] = 50");
        arr [1] = 50;

        System.out.println(arr[1]);
        System.out.println("Modified Array:");

        for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
        }
    }
}

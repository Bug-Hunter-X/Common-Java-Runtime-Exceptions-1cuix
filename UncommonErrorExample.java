public class UncommonErrorExample {

    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Potential ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("This always executes.");
        }

        String str = null;
        try {
            System.out.println(str.length()); // Potential NullPointerException
        } catch (NullPointerException e) {
            System.err.println("Null Pointer Exception caught: " + e.getMessage());
        }

        int[] arr = new int[5];
        try {
            System.out.println(arr[10]); // Potential ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array Index Out Of Bounds Exception caught: " + e.getMessage());
        }
    }
}
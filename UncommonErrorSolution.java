public class UncommonErrorSolution {

    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Potential ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception caught: " + e.getMessage() + ". Result set to 0.");
            int result = 0; // Handle the error gracefully
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("This always executes.");
        }

        String str = null;
        try {
            System.out.println(str.length()); // Potential NullPointerException
        } catch (NullPointerException e) {
            System.err.println("Null Pointer Exception caught: " + e.getMessage() + ". String length set to 0.");
            int strLength = 0; //Handle the error gracefully
        }

        int[] arr = new int[5];
        try {
            System.out.println(arr[10]); // Potential ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array Index Out Of Bounds Exception caught: " + e.getMessage() + ". Returning 0.");
            int arrValue = 0;//Handle the error gracefully
        }
    }
}
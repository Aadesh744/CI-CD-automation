public class ErrorHandlingExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        
        try {
            System.out.println("Accessing element: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds!");
        } finally {
            System.out.println("Execution completed.");
        }
    }
}


public class MultiplicationTables {
    public static void main(String[] args) {
        for (int num = 1; num <= 10; num++) {
            System.out.println("Multiplication Table of " + num + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
            System.out.println(); // Blank line for spacing between tables
        }
    }
}

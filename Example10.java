public class Example10 {
    void testFinally() {
        try {
            int result = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Handled exception.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

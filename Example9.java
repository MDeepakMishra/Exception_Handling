public class Example9 {
    void loopWithException() {
        for (int i = 3; i >= -1; i--) {
            try {
                System.out.println(10 / i);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero.");
            }
        }
    }
}

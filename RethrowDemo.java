public class RethrowDemo {
    static void validate(int number) throws Exception {
        try {
            if (number < 0) throw new Exception("Negative number not allowed");
        } catch (Exception e) {
            System.out.println("Handling inside method: " + e.getMessage());
            throw e; // rethrowing
        }
    }

    public static void main(String[] args) {
        try {
            validate(-5);
        } catch (Exception e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
    }
}

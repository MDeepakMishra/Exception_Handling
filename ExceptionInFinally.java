public class ExceptionInFinally {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e);
        } finally {
            int[] arr = new int[2];
            System.out.println(arr[5]); // Exception in finally
        }
    }
}

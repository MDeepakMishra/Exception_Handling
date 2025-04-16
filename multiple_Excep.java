public class multiple_Excep {
    void multipleCatch() {
        try {
            int[] arr = new int[2];
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error.");
        }
    }   
}

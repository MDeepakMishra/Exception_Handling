public class Example4 {
    void convert() {
        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }
}

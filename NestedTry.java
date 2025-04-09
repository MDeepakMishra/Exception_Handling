 class NestedTry {
    public static void main(String[] args) {
        try {
            try {
                int a = 5 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Arithmetic Exception");
            }

            int[] arr = new int[2];
            arr[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array Index Out Of Bounds Exception");
        }
    }
}

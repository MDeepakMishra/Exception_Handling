public class ArrayIndex_Exp {
    public static void main(String[] args) {
       try{
        int[] arr = new int[5];
        arr[10] = 100;
       }
       catch(ArithmeticException e){
        System.out.println("Please check your code");
       }

       catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Array Inex Out Of Bond Exception");
       }
       
    }
}

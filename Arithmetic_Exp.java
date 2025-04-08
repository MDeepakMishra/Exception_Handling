public class Arithmetic_Exp{
    public static void main(String[] args) {
        int i = 100 , j ;
       try{
        j = i / 0 ;
       }

       catch(ArithmeticException e){
        System.out.println("Arithetmatic Exception");
       }
     
    }
}
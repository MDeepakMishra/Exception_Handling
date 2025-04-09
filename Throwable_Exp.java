import java.util.Scanner;

public class Throwable_Exp {
    public static void main(String[] args) {
        System.out.println("ENTER THE AGE FOR VOTE");
        Scanner sc = new Scanner(System.in);
        int  age = sc.nextInt();
        if (age < 18 ) {
            throw new ArithmeticException("You are not elligible for vote");
        }
        else{
            System.out.println("ou can give the vote");
        }
    }
}

class AgeInvalidException extends Exception {
    public AgeInvalidException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    static void checkAge(int age) throws AgeInvalidException {
        if (age < 18) throw new AgeInvalidException("Age must be 18 or above");
        System.out.println("Age is valid");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (AgeInvalidException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}

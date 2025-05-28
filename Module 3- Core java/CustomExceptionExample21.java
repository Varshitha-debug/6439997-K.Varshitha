class InvalidAgeException21 extends Exception {
    public InvalidAgeException21(String message) {
        super(message);
    }
}

public class CustomExceptionExample21 {
    public static void main(String[] args) {
        int age = 16; // Example age

        try {
            if (age < 18) {
                throw new InvalidAgeException21("Age must be 18 or older.");
            }
            System.out.println("Access granted.");
        } catch (InvalidAgeException21 e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

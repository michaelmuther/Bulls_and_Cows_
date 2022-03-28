import java.util.Scanner;

public class InputDigits {
    private Scanner s = new Scanner(System.in);
    private int digits;
    private boolean validInput = false;
    private final int MAX_DIGITS = 10;
    final private String PLEASE_ENTER_LENGTH = "Please, enter the secret code's length:";
    final private String LETS_START = "Okay, let's start a game!";
    final private String ERROR = "Error: can't generate a secret number with a length of %d because there aren't enough unique digits.";

    public InputDigits() {
        System.out.println(PLEASE_ENTER_LENGTH);
        digits = s.nextInt();
        if (digits > MAX_DIGITS) {
            System.out.printf(ERROR, digits);
        } else {
            validInput = true;
            System.out.println(LETS_START);
        }
    }

    public int getDigits() {
        return digits;
    }

    public boolean isValidInput() {
        return validInput;
    }
}

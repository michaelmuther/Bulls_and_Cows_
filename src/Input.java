import java.util.Scanner;

public class Input {
    private Scanner s = new Scanner(System.in);
//    private String input;
    private int digits;
    private boolean validInput = false;
    private final int MAX_DIGITS = 10;
    final private String ERROR = "Error: can't generate a secret number with a length of %d because there aren't enough unique digits.";

    public Input() {
        digits = s.nextInt();
        if (digits > MAX_DIGITS) {
            System.out.printf(ERROR, digits);
        } else {
            validInput = true;
        }
//        input = s.nextLine();
    }

//    public String getInput() {
//        return input;
//    }

    public int getDigits() {
        return digits;
    }

    public boolean isValidInput() {
        return validInput;
    }
}

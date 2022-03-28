import java.util.Scanner;

public class InputGuess {

    private Scanner s = new Scanner(System.in);
    final private String TURN = "Turn %d\n";
    private String guess;

    public InputGuess(int turn) {
        System.out.printf(TURN, turn);
        guess = s.nextLine();
    }

    public String getGuess() {
        return guess;
    }
}

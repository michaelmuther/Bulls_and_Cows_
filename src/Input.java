import java.util.Scanner;

public class Input {
    private Scanner s = new Scanner(System.in);
    private String input;

    public Input() {
        input = s.nextLine();
    }

    public String getInput() {
        return input;
    }
}

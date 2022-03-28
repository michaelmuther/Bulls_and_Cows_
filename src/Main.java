public class Main {

    public static void main(String[] args) {
        final String CONGRATULATIONS = "Congratulations! You guessed the secret code.";
        InputDigits id = new InputDigits();
        if (id.isValidInput()) {
            Secret s = new Secret(id.getDigits());
            String secret = s.getSecret();
            boolean gameOver = false;
            int turn = 1;
            while (!gameOver) {
                InputGuess ig = new InputGuess(turn);
                Grader g = new Grader(secret, ig.getGuess());
                new Output(g.getBulls(), g.getCows());
                turn++;
                if (g.getBulls() == id.getDigits()) {
                    System.out.println(CONGRATULATIONS);
                    gameOver = true;
                }
            }
        }
    }
}

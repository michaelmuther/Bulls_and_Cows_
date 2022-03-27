public class Grader {

    private String guess;
    private String secret;
    private int bulls;
    private int cows;

    public Grader(String guess, String secret) {
        this.guess = guess;
        this.secret = secret;
        calculateBullsAndCows();
    }

    private void calculateBullsAndCows() {
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == secret.charAt(i)) {
                bulls++;
            } else {
                for (int j = 0; j < secret.length(); j++) {
                    if (secret.charAt(j) == guess.charAt(i)) {
                        cows++;
                        break;
                    }
                }
            }
        }
    }

    public int getBulls() {
        return bulls;
    }

    public int getCows() {
        return cows;
    }
}

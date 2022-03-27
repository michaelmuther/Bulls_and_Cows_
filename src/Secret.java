import java.util.Random;

public class Secret {

    private int digits;
    private String secret = "";

    public Secret(int digits) {
        this.digits = digits;
        generateRandomSecret();
    }

    private void generateRandomSecret() {
        StringBuilder temp = new StringBuilder();
        long pseudoRandomNumber = System.nanoTime();
        Random r = new Random(pseudoRandomNumber);
        temp.append(r.nextInt(9) + 1); // first number is not 0
        for (int i = 1; i < digits; i++) {
            boolean isUnique = false;
            do {
                boolean noMatches = true;
                int tempRandom = r.nextInt(10);
                for (int j = 0; j < temp.length(); j++) { // iterate over numbers already added to temp StringBuilder
                    int tempChar = Character.getNumericValue(temp.charAt(j));
                    if (tempChar == tempRandom) {
                        noMatches = false;
                    }
                }
                if (noMatches) {
                    temp.append(tempRandom);
                    isUnique = true;
                }
            } while (!isUnique);
        }
        secret = temp.toString();
    }

    public String getSecret() {
        return secret;
    }
}

public class Output {

    private final String NONE = "Grade: None";
    private final String GRADE_1 = "Grade: %d %s.\n"; // use with printf
    private final String GRADE_2 = "Grade: %d %s and %d %s.\n"; // use with printf
    private final String BULL = "bull";
    private final String COW = "cow";
    private final String S = "s";
    int bulls, cows;

    public Output(int bulls, int cows) {
        this.bulls = bulls;
        this.cows = cows;
        printTurn();
    }

    private void printTurn () {
        String bullLabel = bulls > 1 ? BULL + S : BULL;
        String cowLabel = cows > 1 ? COW + S : COW;
        if(bulls > 0 && cows > 0) {
            System.out.printf(GRADE_2, bulls, bullLabel, cows, cowLabel);
        } else if (bulls > 0) {
            System.out.printf(GRADE_1, bulls, bullLabel);
        } else if (cows > 0) {
            System.out.printf(GRADE_1, cows, cowLabel);
        } else {
            System.out.println(NONE);
        }
    }
}

//    private String secret = "";

//    private final String RANDOM = "The random secret number is %s.";

//    private void print3() {
//        System.out.printf(RANDOM, secret);
//    }

//    private final String SECRET = "";
//    private final String OUTPUT2 = "Grade: %s. The secret code is %s.";

//    public Output(String input) {
//        Grader g = new Grader(input, SECRET);
//        this.bulls = g.getBulls();
//        this.cows = g.getCows();
//        printTurn2();
//    }



//    private final String INTRO_SECRET_CODE = "The secret code is prepared: ****.\n";
//    private final String TURN_ANSWER = "Turn %d. Answer:"; // use with printf

//    private final String CONGRATS = "Congrats! The secret code is %d.";

//    private final int[][] gamePlay = {
//            {1234, 0, 1},
//            {5678, 0, 1},
//            {9012, 1, 2},
//            {9087, 1, 1},
//            {1087, 2, 1},
//            {9205, 3, 0},
//            {9305, 4, 0},
//    };

//    public Output() {
//        System.out.println(INTRO_SECRET_CODE);
//        for (int i = 0; i < gamePlay.length; i++) {
//            printTurn(i + 1, gamePlay[i][0], gamePlay[i][1], gamePlay[i][2]);
//        }
//    }

//    private void printTurn(int turnNumber, int answer, int bulls, int cows) {
//        System.out.printf(TURN_ANSWER + "\n", turnNumber);
//        System.out.printf("%d\n", answer);

//        if (bulls == 4) {
//            System.out.printf(CONGRATS, answer);
//        }
//        System.out.println();
//    }

public class Main {

    public static void main(String[] args) {
        Input i = new Input();
        if (i.isValidInput()) {
            Secret s = new Secret(i.getDigits());
            new Output(s.getSecret());
        }
    }
}

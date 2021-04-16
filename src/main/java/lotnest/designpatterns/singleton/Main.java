package lotnest.designpatterns.singleton;

public class Main {

    public static void main(String[] args) {
        GuessGame game = GuessGame.getInstance();
        game.play();
        int score = game.getScore();

        GuessGame anotherGame = GuessGame.getInstance();

        if (game == anotherGame) {
            System.out.println("\nSingleton!");
            if (score == anotherGame.getScore()) {
                System.out.println("And the points match!");
            }
        }
    }
}

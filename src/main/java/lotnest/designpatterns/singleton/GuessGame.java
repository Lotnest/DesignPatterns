package lotnest.designpatterns.singleton;

import lombok.Getter;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessGame {

    private static GuessGame instance;
    private static final Scanner scanner = new Scanner(System.in);
    @Getter
    private int score;
    private final SecureRandom random = new SecureRandom();


    private GuessGame() {
    }

    public static GuessGame getInstance() {
        if (instance == null) {
            instance = new GuessGame();
        }
        return instance;
    }

    public void play() {
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(10);
            System.out.print("Guess the number (0-9):\n");
            int quess = scanner.nextInt();
            if (number == quess) {
                System.out.println("You guessed the number!");
                System.out.println("You now have " + ++score + " points.\n");
            } else {
                System.out.println("Incorrect, the number was: " + number + ".\n");
            }
        }
        System.out.println("Your scored " + score + " points.");
    }
}

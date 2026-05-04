package OOps_concept;

import java.util.*;

class Game {
    private int number;
    private int guess;
    private int attempts = 0;

    Game() {
        number = new Random().nextInt(100) + 1;
        playGame();
    }

    void playGame() {
        Scanner sc = new Scanner(System.in);
        boolean correct = false;

        while (!correct) {
            System.out.print("Enter guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess == number) {
                System.out.println(" Correct in " + attempts + " attempts");
                correct = true;
            } else if (guess < number) {
                System.out.println("Too low");
            } else {
                System.out.println("Too high");
            }
        }
    }
}


public class Guess_Number_Game {
public static void main(String[] args) {

    new Game();

    }
}

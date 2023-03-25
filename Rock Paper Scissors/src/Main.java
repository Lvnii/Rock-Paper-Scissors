import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {

            String[] rps = {"rock", "paper", "scissors"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            Scanner scanner = new Scanner(System.in);
            String playerMove;

            while (true) {
                System.out.println("Please enter your move (rock, paper, or scissors):");
                playerMove = scanner.nextLine();
                if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissors")) {
                    break;
                }
                System.out.println(playerMove + " Is not a valid move!");
            }

            System.out.println("Computer played: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("The game was a Tie!");
            } else if (playerMove.equals("rock")) {
                if (computerMove.equals("paper")) {
                    System.out.println("You Lose!");
                } else if (computerMove.equals("scissors")) {
                    System.out.println("You Win!");
                }
            } else if (playerMove.equals("paper")) {
                if (computerMove.equals("rock")) {
                    System.out.println("You Win!");
                } else if (computerMove.equals("scissors")) {
                    System.out.println("You Lose!");
                }
            } else if (playerMove.equals("scissors")) {
                if (computerMove.equals("paper")) {
                    System.out.println("You Win!");
                } else if (computerMove.equals("rock")) {
                    System.out.println("You Lose!");
                }
            }
            System.out.println("Play again? (yes/no)");
            String playAgain = scanner.nextLine();

            if (!playAgain.equals("yes")) {
                break;
            }
        }
    }
}
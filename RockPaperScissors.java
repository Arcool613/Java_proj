import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int compScore = 0;
        int playerScore = 0;

        while (compScore < 2 || playerScore < 2) 
        {
            System.out.println("Enter your choice: (rock(r), paper(p), scissors(s)) or 'q' to quit");
            String choice = sc.next().toLowerCase();
            if (choice.equals("q")) 
            {
                break;
            }
            Random ram = new Random();
            int randomNumber = ram.nextInt(3) + 1;
            String computerChoice = "";
            switch (randomNumber) 
            {
                case 1:
                    computerChoice = "rock";
                    break;
                case 2:
                    computerChoice = "paper";
                    break;
                case 3:
                    computerChoice = "scissors";
                    break;
            }

            System.out.println("Computer chose: " + computerChoice);

            if ((computerChoice.equals("rock") && choice.equals("p")) || (computerChoice.equals("paper") && choice.equals("s")) || (computerChoice.equals("scissors") && choice.equals("r"))) 
            {
                System.out.println("You win!");
                playerScore++;
            } 
            else if ((computerChoice.equals("rock") && choice.equals("r")) ||
                    (computerChoice.equals("paper") && choice.equals("p")) ||
                    (computerChoice.equals("scissors") && choice.equals("s"))) 
                    {
                        System.out.println("It's a tie! Try again");
                    } 
            else 
            {
                System.out.println("Computer wins!");
                compScore++;
            }
            System.out.println("Your score is: " + playerScore + ", Computer score is : " + compScore);
        }
    }
}
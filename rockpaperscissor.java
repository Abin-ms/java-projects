import java.util.Random;
import java.util.Scanner;

public class rockpaperscissor {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        Random rand = new Random();

        int computersChoice;
        String user, computer;
        int score1 = 0;
        int score2 = 0;

        while (true) {
            System.out.println("_________________________\n");
            System.out.println("Rock - Paper - Scissors");
            System.out.println("_________________________\n");
            System.out.println("Enter your choice\n");
            System.out.println("1.Rock\n");
            System.out.println("2.Paper\n");
            System.out.println("3.Scissors\n");
            System.out.println("4.Exit");
            System.out.println("____________________\n");

            int choice = ss.nextInt();

            if (choice == 4) {
                System.out.println("Thank you!!");
                System.out.println("____________________\n");
                break;

            }
            if (choice < 1 || choice > 3) {
                System.out.println("Invalid Input");
                continue;
            }

            computersChoice = rand.nextInt(3) + 1;
            user = getUsersChoice(choice);
            computer = getComputersChoice(computersChoice);

            System.out.println("\nUsers input is : " + user + "\n");
            System.out.println("Computers input is : " + computer + "\n");

            if (choice == computersChoice) {
                System.out.println("____________________\n");
                System.out.println("The match is a draw");
                System.out.println("score : \n");
                System.out.println("user : " + score1);
                System.out.println("Computer : " + score2);
                System.out.println("____________________\n");
            } else if (choice == 1 && computersChoice == 3) {
                System.out.println("____________________\n");
                System.out.println("User Wins");
                score1 = score1 + 1;
                System.out.println("score : ");
                System.out.println("user : " + score1);
                System.out.println("Computer : " + score2);
                System.out.println("____________________\n");
            } else if (choice == 2 && computersChoice == 1) {
                System.out.println("____________________\n");
                System.out.println("User Wins");
                score1 = score1 + 1;
                System.out.println("score : ");
                System.out.println("user : " + score1);
                System.out.println("Computer : " + score2);
                System.out.println("____________________\n");
            } else if (choice == 3 && computersChoice == 2) {
                System.out.println("____________________\n");
                System.out.println("User Wins");
                score1 = score1 + 1;
                System.out.println("score : ");
                System.out.println("user : " + score1);
                System.out.println("Computer : " + score2);
                System.out.println("____________________\n");
            } else {
                System.out.println("____________________\n");
                System.out.println("Computer Wins");
                score2 = score2 + 1;
                System.out.println("score : ");
                System.out.println("user : " + score1);
                System.out.println("Computer : " + score2);
                System.out.println("____________________\n");
            }

        }
        ss.close();

    }

    public static String getUsersChoice(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "invalid";
        }
    }

    public static String getComputersChoice(int computersChoice) {
        switch (computersChoice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "invalid";
        }
    }

}

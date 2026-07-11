import java.util.Random;
import java.util.Scanner;

public class rockpaperscissor {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        Random rand = new Random();

        int computersChoice;
        String user, computer;

        while (true) {
            System.out.println("Enter your choice\n");
            System.out.println("1.Rock\n");
            System.out.println("2.Paper\n");
            System.out.println("3.Scissors\n");
            System.out.println("4.Exit");

            int choice = ss.nextInt();

            if (choice == 4) {
                System.out.println("Thank you!!");
                break;

            }
            if (choice < 1 || choice > 3) {
                System.out.println("Invalid Input");
                continue;
            }

            computersChoice = rand.nextInt(3) + 1;

            if (choice == 1 || computersChoice == 1) {
                user = computer = "Rock";
            } else if (choice == 2 || computersChoice == 2) {
                user = computer = "Paper";
            } else if (choice == 3 || computersChoice == 3) {
                user = computer = "Scissors";
            } else {
                continue;
            }

            if (choice == 1 && computersChoice == 2) {
                System.out.println("Users input : " + user + "\n");
                System.out.println("Computers entry : " + computer + "\n");
                System.out.println("User wins");
                continue;
            } else if (choice == 1 && computersChoice == 3) {
                System.out.println("Users input : " + user + "\n");
                System.out.println("Computers entry : " + computer + "\n");
                System.out.println("User wins");
                continue;
            } else if (choice == 2 && computersChoice == 1) {
                System.out.println("Users input : " + user + "\n");
                System.out.println("Computers entry : " + computer + "\n");
                System.out.println("User wins");
                continue;
            } else if (choice == 2 && computersChoice == 3) {
                System.out.println("Users input : " + user + "\n");
                System.out.println("Computers entry : " + computer + "\n");
                System.out.println("Computer wins");
                continue;
            } else if (choice == 3 && computersChoice == 1) {
                System.out.println("Users input : " + user + "\n");
                System.out.println("Computers entry : " + computer + "\n");
                System.out.println("Computer wins");
                continue;
            } else if (choice == 3 && computersChoice == 2) {
                System.out.println("Users input : " + user + "\n");
                System.out.println("Computers entry : " + computer + "\n");
                System.out.println("User wins");
                continue;
            } else {
                System.out.println("Users input : " + user + "\n");
                System.out.println("Computers entry : " + computer + "\n");
                System.out.println("The match is a draw");
                continue;
            }

        }
        ss.close();

    }

}

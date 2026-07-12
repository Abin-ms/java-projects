import java.util.Scanner;

public class palindromeandanagramchecker {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int choice = 0;
        String original = "";

        while (true) {

        System.out.println("____________________________________________");
        System.out.println("Enter your choice");
        System.out.println("1.Check if a string is palindrome or not");
        System.out.println("2.Check if a string is Anagram or not");
        System.out.println("3.Exit");
         System.out.println("____________________________________________");
        choice = ss.nextInt();
        ss.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("___________________");
                    System.out.println("Palindrome or not.");
                    System.out.println("___________________");
                    System.out.println("Enter the string");
                    original = ss.nextLine();
                    palindrome(original);
                    System.out.println(palindrome(original));
                     System.out.println("___________________");
                    break;
                case 2:
                    System.out.println("___________________");
                    System.out.println("Anagram or not.");
                    System.out.println("___________________");
                    System.out.println("Enter the string");
                case 3:
                    System.out.println("Thank you!!!");
                    ss.close();
                    return;
                default:
                    System.out.println("Invalid Option");
                    break;
            }

        }
        
    }

    public static String palindrome(String original) {
        String reversed = new StringBuilder(original).reverse().toString();
        if (original.equalsIgnoreCase(reversed))
            return "The string " + original + " is palindrome";

        else
            return "The string " + original + "is not plaindrome";
    }
}

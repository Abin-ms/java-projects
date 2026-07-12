import java.util.Scanner;

public class passwordstrengthchecker {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int upperCount = 0;
        int lowerCount = 0;
        int numberCount = 0;
        int specialCount = 0;
        int score = 0;

        System.out.println("\n===================\n");
        System.out.println("Enter Your Password");
        System.out.println("\n===================\n");
        String password = ss.nextLine();

        if (!checkLength(password)) {
            System.out.println("Password must contain atleast 8 characters");
            ss.close();
            return;

        } else {
            System.out.println("Entered Password is : " + password);

        }

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCount++;

            } else if (Character.isLowerCase(ch)) {
                lowerCount++;

            } else if (Character.isDigit(ch)) {
                numberCount++;

            } else {
                if (ch == ' ') {
                    System.out.println("The password should not contain Blank spaces");
                    ss.close();
                    return;
                } else {
                    specialCount++;

                }
            }

        }

        if (password.length() >= 8) {
            score++;
        }
        if (upperCount >= 1) {
            score++;

        }
        if (lowerCount >= 1) {
            score++;
        }
        if (numberCount >= 1) {
            score++;
        }
        if (specialCount >= 1) {
            score++;

        }
        System.out.println("\n======================================\n");
        System.out.println("Password Analysis");
        System.out.println("\n======================================\n");
        System.out.println("Number of uppercase letters : " + upperCount);
        System.out.println("Number of lowercase letters : " + lowerCount);
        System.out.println("Number of digits : " + numberCount);
        System.out.println("Number of special characters : " + specialCount);
        System.out.println("strength score is : " + score);
        System.out.println("\n======================================\n");

        if (score <= 2) {

            System.out.println("Password is Weak");
        } else if (score == 3) {

            System.out.println("Password is Medium");
        } else if (score == 4) {

            System.out.println("Password is Good");
        } else if (score >= 5) {

            System.out.println("Password is Strong");
        }

        ss.close();
    }

    public static boolean checkLength(String password) {
        return password.length() >= 8;

    }

}

import java.util.Scanner;

public class passwordstrengthchecker {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int upperCount = 0;
        int lowerCount = 0;
        int numberCount = 0;
        int specialCount = 0;

        System.out.println("\n===================\n");
        System.out.println("Enter Your Password");
        System.out.println("\n===================\n");
        String password = ss.nextLine();

        if (!checkLength(password)) {
            System.out.println("Password must contain atleast 8 characters");
            ss.close();
            return;

        }
        System.out.println("Entered Password is : " + password);
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
        if (!check(upperCount, lowerCount, numberCount, specialCount)) {
            System.out.println("The password is not strong");
            System.out.println("Number of uppercase letters : " + upperCount);
            System.out.println("Number of lowercase letters : " + lowerCount);
            System.out.println("Number of digits : " + numberCount);
            System.out.println("Number of special characters : " + specialCount);
        } else {
            System.out.println("The pasword is strong");
        }

        ss.close();
    }

    public static boolean checkLength(String password) {
        return password.length() >= 8;

    }

    public static boolean check(int upperCount, int lowerCount, int numberCount, int specialCount) {
        if (upperCount >= 1 && lowerCount >= 1 && numberCount >= 1 && specialCount >= 1) {
            return true;
        } else {
            return false;
        }
    }

}

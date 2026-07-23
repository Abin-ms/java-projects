import java.util.Scanner;

public class converter {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int choice;
        while (true) {
            menu();
            choice = ss.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("__________________");
                    System.out.println(" Length converter");
                    System.out.println("__________________");

                    System.out.println("Enter the value : ");
                    double value = ss.nextDouble();
                    System.out.println("1.meter");
                    System.out.println("2.kilometer");
                    System.out.println("3.Centimeter");
                    System.out.println("4.Mile");
                    System.out.println("5.Exit");
                    System.out.println("From(Enter your choice from the above):");
                    int choice2 = ss.nextInt();
                    System.out.println("TO (Choose one option from above) :");
                    int choice3 = ss.nextInt();

                    switch (choice2) {
                        case 1:
                            // meter to corresponding.
                            System.out.println(value + "=" + fromMeters(value, choice3));
                            break;
                        case 2:
                            // kilometer to corresponding.
                            System.out.println(value + "=" + fromkilo(value, choice3));
                            break;
                        case 3:
                            // Centimeter to corresponding.
                            System.out.println(value + "=" + fromcms(value, choice3));
                            break;
                        case 4:
                            // Mile to corresponding.
                            System.out.println(value + "=" + frommiles(value, choice3));
                            break;
                        case 5:
                            break;

                        default:
                            System.out.println("Invalid Option");
                            break;
                    }

                    break;

                case 2:
                    System.out.println("__________________");
                    System.out.println(" Weight converter");
                    System.out.println("__________________");
                    System.out.println("1.Gram");
                    System.out.println("2.Kilogram");
                    System.out.println("3.Pound");
                    System.out.println("4.Exit");
                    System.out.println("From(Choose your option from above) : ");
                    int weightchoice = ss.nextInt();
                    System.out.println("To(Choose you option from above");
                    int weightchoice2 = ss.nextInt();
                    System.out.println("Enter the value to be converted(Weight) : ");
                    double Weight = ss.nextDouble();

                    switch (weightchoice) {
                        case 1:
                            System.out.println(Weight + "=" + fromGrams(Weight, weightchoice2));
                            break;
                        case 2:
                            System.out.println(Weight + "=" + fromKilograms(Weight, weightchoice2));
                            break;
                        case 3:
                            System.out.println(Weight + "=" + fromPounds(Weight, weightchoice2));
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Invalid option");
                            break;
                    }

                    break;

                case 3:
                    System.out.println("__________________");
                    System.out.println(" Currency converter");
                    System.out.println("__________________");
                    System.out.println("1.USD");
                    System.out.println("2.EUR");
                    System.out.println("3.SAUDI RIYAL");
                    System.out.println("4.Exit");
                    int currency = ss.nextInt();
                    System.out.println("Enter the amount");
                    double amount = ss.nextDouble();
                    double result;
                    switch (currency) {
                        case 1:
                            result = amount * 86;
                            System.out.println(amount + "=" + result + "INR");
                            break;
                        case 2:
                            result = amount * 100;
                            System.out.println(amount + "=" + result + "INR");
                            break;
                        case 3:
                            result = amount * 25.82;
                            System.out.println(amount + "=" + result + "INR");
                            break;
                        case 4:
                            break;
                        default:
                            break;
                    }

                    break;

                case 4:
                    System.out.println("Thank you!!");
                    ss.close();
                    return;
                default:
                    break;
            }

        }
    }

    public static void menu() {
        System.out.println("Choose your Option");
        System.out.println("1.Length Converter.");
        System.out.println("2.Weight Converter");
        System.out.println("3.Currency Converter");
        System.out.println("4.Exit");
    }

    private static double fromMeters(double value, int choice3) {
        switch (choice3) {
            case 1:
                return value;

            case 2:
                return value / 1000;

            case 3:
                return value * 100;

            case 4:
                return value / 1609.344;

            case 5:
                menu();

            default:
                return -1;
        }
    }

    public static double fromkilo(double value, int choice3) {
        switch (choice3) {
            case 1:
                return value * 1000;

            case 2:
                return value;

            case 3:
                return value * 100000;

            case 4:
                return value * 0.621371;

            default:
                return -1;
        }

    }

    public static double fromcms(double value, int choice3) {
        switch (choice3) {
            case 1:
                return value / 100;

            case 2:
                return value / 100000;

            case 3:
                return value;

            case 4:
                return value / 160900;

            default:
                return -1;
        }

    }

    public static double frommiles(double value, int choice3) {
        switch (choice3) {
            case 1:
                return value * 1609.34;

            case 2:
                return value * 1.609344;

            case 3:
                return value * 160900;

            case 4:
                return value;

            default:
                return -1;
        }

    }

    public static double fromGrams(double Weight, int weightchoice2) {
        switch (weightchoice2) {
            case 1:

                return Weight;
            case 2:
                return Weight / 1000;
            case 3:
                return Weight / 453.59237;

            default:
                return -1;
        }

    }

    public static double fromKilograms(double Weight, int weightchoice2) {
        switch (weightchoice2) {
            case 1:
                return Weight * 1000;
            case 2:
                return Weight;
            case 3:
                return Weight * 2.20462;

            default:
                return -1;
        }

    }

    public static double fromPounds(double Weight, int weightchoice2) {
        switch (weightchoice2) {
            case 1:
                return Weight * 453.592;
            case 2:
                return Weight / 2.205;
            case 3:
                return Weight;

            default:
                return -1;
        }

    }   

}

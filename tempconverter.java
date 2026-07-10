import java.util.Scanner;

public class tempconverter {
    public static void main(String[] args) {

        Scanner ss = new Scanner(System.in);



        while (true) {
            System.out.println("\n1.celsius to Fahrenheit");
            System.out.println("2.Celsius to Kelvin");
            System.out.println("3.Fahrenheit to celsius");
            System.out.println("4.Fahrenheit to Kelvin");
            System.out.println("5.Kelvin to celsius");
            System.out.println("6.Kelvin to Fahrenheit\n");
            System.out.println("7.Exit");
            System.out.println("Enter your choice\n");
            int choice = ss.nextInt();
            if (choice < 1 || choice > 7) {
                System.out.println("Invalid choice");
                continue;
            }
            if (choice == 7) {
                System.out.println("Thank you!");
                break;
            }
            System.out.println("Enter Temperature\n");
            double temperature = ss.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("The converted temperature is : " +celsiustofahrenheit( temperature));
                    break;
                case 2:
                    System.out.println("The converted temperature is : " +celsiustokelvin(temperature));
                    break;
                case 3:
                    System.out.println("The converted temperature is : " +fahrenheittocelsius(temperature));
                    break;
                case 4:
                    System.out.println("The converted temperature is : " +fahrenheittokelvin(temperature));
                    break;
                case 5:
                    System.out.println("The converted temperature is : " +kelvintocelsius(temperature));
                    break;
                case 6:
                    System.out.println("The converted temperature is : " +kelvintofahrenheit(temperature));
                    break;
                default:
                    System.out.println("Invalid result");
                    break;
            }


        
        }
        ss.close();
        
        

    }
    

    public static double celsiustofahrenheit(double temperature){
        return (temperature*9/5) + 32; 
    }

    public static double celsiustokelvin(double temperature){
        return temperature + 273.15;
    }

    public static double fahrenheittocelsius(double temperature){
        return (temperature - 32) * 5/9 ;
    }

    public static double fahrenheittokelvin(double temperature){
        return (temperature - 32)*5/9+273.15;
    }

    public static double kelvintocelsius(double temperature){
        return temperature - 273.15 ; 
    }

    public static double kelvintofahrenheit(double temperature){
        return (temperature - 273.15) * 9/5 + 32;
    }
    

}

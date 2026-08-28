import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the size :");
        int range = sc.nextInt();

        for (int i = 0; i < range; i++) {
            System.out.println("Enter element number : " + i);
            numbers.add(sc.nextInt());
        }

        System.out.println(numbers);

        System.out.println("Enter the element to be searched : ");
        int key = sc.nextInt();

        for (int i = 0; i < range; i++) {
            if (numbers.get(i) == key) {
                System.out.println("The element " + key + " is found at : " + i);
            } else {
                System.out.println("The element is not present in the list!!!!!");
            }
        }

        sc.close();
    }

}
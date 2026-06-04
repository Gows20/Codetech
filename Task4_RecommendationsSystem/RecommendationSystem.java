import java.util.Scanner;

public class RecommendationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== AI MOVIE RECOMMENDATION SYSTEM =====");

        System.out.println("Choose movie type:");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Horror");

        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        System.out.println("\nRecommended Movies:\n");

        if (choice == 1) {

            System.out.println("KGF");
            System.out.println("Leo");
            System.out.println("Vikram");

        }

        else if (choice == 2) {

            System.out.println("Jailer");
            System.out.println("Doctor");
            System.out.println("Boss Engira Bhaskaran");

        }

        else if (choice == 3) {

            System.out.println("Demonte Colony");
            System.out.println("Pizza");
            System.out.println("Conjuring");

        }

        else {

            System.out.println("Invalid Choice");

        }

        sc.close();

    }
}
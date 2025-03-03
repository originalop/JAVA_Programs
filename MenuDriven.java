import java.util.Scanner;

public class MenuDriven {

    static void square(int num) {
        System.out.println("Square = " + (num * num));
    }

    static void cube(int num) {
        System.out.println("Cube = " + (num * num * num));
    }

    static void factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of given number = " + fact);
    }

    static void factors(int num) {
        System.out.print("Factors: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // New line for clarity
    }

    static void oddEven(int num) {
        System.out.println(num % 2 == 0 ? "Even" : "Odd");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        while (true) {
            System.out.println("\n1: Square");
            System.out.println("2: Cube");
            System.out.println("3: Factorial");
            System.out.println("4: Factors");
            System.out.println("5: Odd/Even");
            System.out.println("6: Exit");
            System.out.print("Enter your choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    square(num);
                    break;
                case 2:
                    cube(num);
                    break;
                case 3:
                    factorial(num);
                    break;
                case 4:
                    factors(num);
                    break;
                case 5:
                    oddEven(num);
                    break;
                case 6:
                    System.out.println("Program terminated");
                    sc.close();
                    System.exit(6);
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}

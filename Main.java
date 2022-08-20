import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);

    // function to checkPalindrome

    public void checkPalindrome() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number to check palindrome: ");
        int num = inp.nextInt();

        int reverse = 0, element, remainder;
        element = num;

        while (num != 0) {
            remainder = num % 10;
            reverse = (reverse * 10) + remainder;
            num = num / 10;
        }

        if (element == reverse) {
            System.out.println("Yes, it is palindrome");
        } else {
            System.out.println("No, it is not palindrome");
        }

    }

    // function to printPattern

    public void printPattern() {
        Scanner rowCount = new Scanner(System.in);
        System.out.print("Enter the number of rows for star pattern: "); // takes input from user
        int rows = rowCount.nextInt();

        // inner loop(for rows)
        for (int i = rows - 1; i >= 0; i--) {
            // outer loop(for columns)
            for (int j = 0; j <= i; j++) {
                // prints star and space
                System.out.print("*" + " ");
            }
            // throws the cursor in the next line after printing each line
            System.out.println();
        }

    }

    // function to check no is prime or not

    public void checkPrimeNumber() {
        Scanner checkPrime = new Scanner(System.in);
        System.out.print("Enter the number to check prime: ");
        int num = checkPrime.nextInt();
        int i = 2;
        boolean flag = false;

        while (i <= num / 2) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }

            ++i;
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

    }

    // function to print Fibonacci Series

    public void printFibonacciSeries() {

        // initialize the first and second value as 0,1 respectively.

        int first = 0, second = 1, third, i;
        Scanner size = new Scanner(System.in);
        System.out.print("Enter the size of fibonacci series: ");
        int count = size.nextInt();
        System.out.print(first + " " + second);// printing 0 and 1

        for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are already printed
        {
            third = first + second;
            System.out.print(" " + third);
            first = second;
            second = third;
        }

        System.out.println();
    }

    // main method which contains switch and do while loop

    public static void main(String[] args) {

        Main obj = new Main();

        int choice;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

                    + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

                    + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

            System.out.println();

            choice = sc.nextInt();

            switch (choice) {

                case 0:

                    choice = 0;

                    break;

                case 1: {

                    obj.checkPalindrome();

                }

                    break;

                case 2: {

                    obj.printPattern();

                }

                    break;

                case 3: {

                    obj.checkPrimeNumber();

                }

                    break;

                case 4: {

                    obj.printFibonacciSeries();

                }

                    break;

                default:

                    System.out.println("Invalid choice. Enter a valid no.\n");

            }

        } while (choice != 0);

        System.out.println("Exited Successfully!!!");

        sc.close();

    }

}
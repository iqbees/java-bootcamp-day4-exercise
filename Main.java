import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1.Write a program that prints the numbers from 1 to 100 such that:
        //If the number is a multiple of 3, you need to print "Fizz" instead of that number.
        //If the number is a multiple of 5, you need to print "Buzz" instead of that number.
        //If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        // 2.Write a Java program to reverse a string.
        //Test Data: Input a string: The quick brown fox Expected Output: Reverse string: xof nworb kciuq ehT

        System.out.print("Input a string: ");
        String str = in.nextLine();

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        System.out.println("Reverse string: " + reverse);

        // 3.Write a program to find the factorial value of any number entered through the keyboard.

        System.out.print("Enter a number to get its factorial: ");
        int num = in.nextInt();

        if (num < 0) {
            System.out.println("Please enter a positive number")
        } else {
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
    
            System.out.println("Factorial: " + factorial);
        }

        // 4.Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)

        System.out.print("Enter a number: ");
        int num2 = in.nextInt();

        System.out.print("Enter the power to raise to that number: ");
        int power = in.nextInt();

        int result = 1;
        for (int i = 0; i < power; i++) {
            result = result * num2;
        }

        System.out.println(num2 + "^" + power + "=" + result);

        // 5.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

        int sumOdd = 0;
        int sumEven = 0;
        while (true) {
            System.out.print("Please enter a number or -1 to exit: ");
            int number = in.nextInt();

            if (number == -1) {
                break;
            }

            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }

        System.out.println("Sum of odd numbers: " + sumOdd);
        System.out.println("Sum of even numbers: " + sumEven);

        // 6.Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.

        int num3;
        do {
            System.out.print("Please enter a positive number: ");
            num3 = in.nextInt();
        } while (num3 <= 0);

        boolean isPrime = true;

        if (num3 < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i < num3; i++) {
                if (num3 % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num3 + " is a prime number");
        } else {
            System.out.println(num3 + " is not a prime number");
        }

        // 7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use another for loop to print the days (Days 1 -7) for each week.
        //Expected Output:
        //Week 1
        //Day1
        //Day2
        //Day3
        //Day4
        //Day5
        //Day6
        //Day7
        //Week 2
        //Day1
        //Day2
        //...

        for (int week = 1; week <= 4; week++) {
            System.out.println("Week " + week);
            for (int day = 1; day <= 7; day++) {
                System.out.println("Day" + day);
            }
        }

        // 8.Write a program thats check if the word is a palindrome or not. hint: A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left.

        System.out.print("Please enter a word: ");
        String word = in.next().toLowerCase();

        boolean isPalindrome = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}

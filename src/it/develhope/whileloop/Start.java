package it.develhope.whileloop;
import java.util.Scanner;
import java.util.Random;
public class Start {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(10) + 1;
        int guess = 0;
        System.out.println("Welcome!");
        while (guess != number) {
            System.out.println("Guess the number: ");
            guess = scanner.nextInt();
            if (guess == number)
            {
                System.out.println("Congratulations!");
            } else
            {
                System.out.println("It's wrong,try again.");
            }
        }
        

    }
}

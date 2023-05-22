//Pallav Regmi
// The University of New Mexico

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10);

        System.out.println("What is your name ? ");
        String name = sc.nextLine();

        System.out.println(name+", please pick a number between 1 and 10 ");
        int usernumber = sc.nextInt();


        System.out.println("You guessed "+usernumber);

        if (usernumber == randomNumber){
            System.out.println("Congratulations, "+name+"! You guessed my number!");
        }
        else {
            System.out.println("I was thinking of "+randomNumber);
        }
    }
}

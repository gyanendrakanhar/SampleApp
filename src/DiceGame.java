import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();

        if(number > 5) {
            System.out.println("You won the game.");
        }
        else {
            System.out.println("You lost the game");
        }
        }
    }

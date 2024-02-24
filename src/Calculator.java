import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        AddNumbers(4,5);
        AddNumbers(3,4);

        int s = AddNumbers(4,5);
        System.out.println(s*3);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = sc.nextInt();
        System.out.println("Enter you second number");
        int num2 = sc.nextInt();

        int add = num1 + num2;
        System.out.println("Addition of two numbers: " + add);

        int multiply = num1 * num2;
        System.out.println("Multiplication of two numbers: " + multiply);

        int divide = num1 / num2;
        System.out.println("Division of two numbers: " + divide);

        int subtraction = num1 - num2;
        System.out.println("Subtraction of two numbers: " + subtraction);
    }

    public static int AddNumbers(int num1, int num2){
        int add = num1 + num2;
        System.out.println("Addition of two numbers: " + add);
        return add;
    }
}

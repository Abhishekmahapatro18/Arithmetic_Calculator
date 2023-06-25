package SelfLearn1;
import java.util.Scanner;

public class Calculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number : ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number : ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Select the operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        double result;
        
        switch (operator) 
        {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 == 0) 
                {
                    System.out.println("Error: Cannot divide by zero!");
                } 
                else 
                {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Error: Invalid operator!!!");
        }
        
        scanner.close();
        System.out.println("I am done.");
    }
}

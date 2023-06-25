package SelfLearn1;
import java.util.Scanner;

class Arithmetic_Calculator 
{
    private double num1;
    private double num2;
    
    public Arithmetic_Calculator(double num1, double num2) 
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double add() 
    {
        return num1 + num2;
    }
    
    public double subtract() 
    {
        return num1 - num2;
    }
    
    public double multiply() 
    {
        return num1 * num2;
    }
    
    public double divide() 
    {
        if (num2 != 0) 
        {
            return num1 / num2;
        } 
        else 
        {
            throw new ArithmeticException("Error: Cannot divide by zero!");
        }
    }
}
public class Calculator
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Arithmetic Calculator");
        System.out.println("---------------------");
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        Arithmetic_Calculator calculator = new Arithmetic_Calculator(num1, num2);
        
        System.out.println("\nSelect an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        
        double result = 0;
        String operator = "";
        
        switch (choice) {
            case 1:
                result = calculator.add();
                operator = "+";
                break;
            case 2:
                result = calculator.subtract();
                operator = "-";
                break;
            case 3:
                result = calculator.multiply();
                operator = "*";
                break;
            case 4:
                try {
                    result = calculator.divide();
                    operator = "/";
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }
        
        System.out.println("\nResult:");
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        
        scanner.close();
    }
}

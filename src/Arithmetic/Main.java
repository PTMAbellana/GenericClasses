package Arithmetic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two values: ");
        Double n1 = sc.nextDouble();
        Integer n2 = sc.nextInt();

        Arithmetic answer = new Arithmetic(n1, n2); // pwede ragud ug walay kuan
        System.out.println("Addition: " + answer.add());
        System.out.println("Subtraction: " + answer.subtract());
        System.out.println("Multiplication: " + answer.multiply());
        System.out.println("Division: " + answer.divide());
        System.out.println("Minimum: " + answer.getMin());
        System.out.println("Maximum: " + answer.getMax());
    }
}

package problemandsolutions;

import java.util.Scanner;

public class ArithmeticOperator {
    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.


    public static void main(String[] args) {
     double num1;
     double num2;

     Scanner sc=new Scanner(System.in);
     System.out.println("Input your First number");
     num1=sc.nextDouble();
     System.out.println("Input your second number");
     num2=sc.nextDouble();
        System.out.println("The Summation of the two number is :" +(num1+num2));
        System.out.println("The Subtraction of the two number is :" +(num1-num2));
        System.out.println("The Multiplication of the two number is :" +(num1*num2));
        System.out.println("The Division of the two number is : " +(num1/num2));

    }
}

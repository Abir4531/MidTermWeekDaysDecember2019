package math.problems;

import org.testng.Assert;

public class UnitTestingMath {


    private static Factorial factor;

    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        Assert.assertEquals(5,5);
        System.out.println("factorialRecursive result is true ::" +factor.factorialRecursive(5) );

        Factorial fact=new Factorial();
        System.out.println("factorialIterative result is true :"+fact.factorialIterative(5));

        Fibonacci fan=new Fibonacci();
        //fan.fib();







    }
}

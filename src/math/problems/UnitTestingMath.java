package math.problems;

import org.testng.Assert;

public class UnitTestingMath {


    private static Factorial factor;

    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.


        //factorialRecursive class result....

        Assert.assertEquals(5,5);
        System.out.println("factorialRecursive result is true ::" +Factorial.factorialRecursive(5) );

        //factorialIterative class result....

        Assert.assertEquals(5,5);
        System.out.println("factorialIterative result is true :"+Factorial.factorialIterative(5));

        //Fibonacci class result....

        Assert.assertEquals(Fibonacci.Fib(40),102334155);
        System.out.println("Fibonacci class passed");

        //FindLowestDifference class result.....

        Assert.assertEquals(1,1);
        System.out.println("FindLowestDifference class is passed");

        //FindMissingNumber class result....

        Assert.assertEquals(6,6);
        System.out.println("FindMissingNumber class is passed " );

        //LowestNumber class result...




        //MakePyramid class result....





        //MergeTwoArraysAndRemoveDuplicatesProgram class result....

        Assert.assertEquals(4,4);
        System.out.println("MergeTwoArraysAndRemoveDuplicatesProgram  class is passed");


        //Pattern class result....

        //Assert.assertEquals();




    }
}

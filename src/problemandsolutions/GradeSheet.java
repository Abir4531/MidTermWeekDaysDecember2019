package problemandsolutions;

import java.util.Scanner;

public class GradeSheet {

    public static void main(String[] args) {
    double quiz, mid_term, final_term,score;
        Scanner sc= new Scanner(System.in); // creating Scanner for inputting number
        System.out.println("Enter you score of Quiz number :");
        quiz=sc.nextDouble();
        System.out.println("Enter your score of Mid_term :");
        mid_term=sc.nextDouble();
        System.out.println("Enter your score of Final_term :");
        final_term=sc.nextDouble();

        score=(quiz+mid_term+final_term)/3; // diving all numbers by 3 to getting the actual number.
        if(score>=90){
            System.out.println("Your Grade is A ");
        }
        else if(score>=70){
            System.out.println("Your Grade is B ");
        }
        else if(score>=50){
            System.out.println("Your Grade is C ");
        }
        else{
            System.out.println("Your Grade is F ");
        }






    }

}

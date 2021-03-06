package string.problems;

public class Palindrome {

    /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

    public static void doPalindrome(String a){
        boolean status = true;
        char[] word = a.toLowerCase().toCharArray();

        int i1 = 0;
        int i2 = word.length - 1;

        while (i2 > i1) {

            if (word[i1] != word[i2]) {
                status = false;
            }
               ++i1;
               --i2;
        }
        System.out.println((a + " is a palindrome word : " + status));
    }
    public static void main(String[] args) {

        doPalindrome("MOM");
        doPalindrome("DAD");
        doPalindrome("MADAM");

    }

    }


package org.leetcode.math.Exercicio263;

/*
* An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.

Given an integer n, return true if n is an ugly number.

Example 1:

Input: n = 6
Output: true
Explanation: 6 = 2 × 3
Example 2:

Input: n = 1
Output: true
Explanation: 1 has no prime factors.
Example 3:

Input: n = 14
Output: false
Explanation: 14 is not ugly since it includes the prime factor 7.
* */

public class UglyNumber_Exercicio_263 {
    public boolean isUgly(int n) {
        boolean ugly = true;

        long number = n;
        boolean negative = false;
        if (number < 0){
            number *= - 1;
            negative = true;
        } else if(number == 0){
            return false;
        }

        long i = 2;
        while(i <= number){

            if(number%i == 0 ) {
                number = number/i;
                //System.out.println(number);
                if (i == 2 || i ==3 || i == 5){
                    i--;
                }

            }
            else if (number%2 != 0 && number%3 != 0 && number%5 != 0){
                return false;
            }

            i++;
        }

        if (negative == true && number == 1){

            return false;
        }
        return ugly;
    }
}

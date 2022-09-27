package org.example;

public class SumOfDigits {

    public static void main(String[] args) {

        SumOfDigits recursion = new SumOfDigits();

        System.out.println(recursion.SumOfDigit(227));
    }

    public int SumOfDigit(int n){


        if(n < 1){
            return 0;
        }

        return (n % 10) +  SumOfDigit(n / 10);

    }
}
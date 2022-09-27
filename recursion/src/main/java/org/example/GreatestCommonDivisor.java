package org.example;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();

        System.out.println(greatestCommonDivisor.gcd(48, 12));

    }

    public int gcd(int a, int b){
        if(a < 0 || b < 0){
            return -1;
        }
        if(b == 0){
            return a;
        }

        return gcd(b, a%b);
    }
}

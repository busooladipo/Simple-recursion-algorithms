package org.example;

public class DecimalToBinary {

    public static void main(String[] args) {
        DecimalToBinary decimalToBinary = new DecimalToBinary();

        System.out.println(decimalToBinary.toBinary(11));

    }
    public int toBinary(int n){
        if (n == 0){
            return 0;
        }
        return n%2 + 10 * toBinary(n/2);
    }
}

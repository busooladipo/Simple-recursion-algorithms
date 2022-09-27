package org.example;

public class Power {
    public static void main(String[] args) {

        Power power = new Power();

        System.out.println(power.findPower(2, 5));
    }

    public int findPower(int num, int pow){
        if (pow < 1 ){
            return 1;
        }

        return num * findPower(num, pow - 1);
    }
}

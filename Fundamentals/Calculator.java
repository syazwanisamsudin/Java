// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package com.syazwani;

import java.lang.Math; //To use Math library
import java.util.Scanner; //To use Scanner library

/////////////// BUILDING MORTGAGE CALCULATOR //////////////

public class Main {

    double interestRate;
    double principal;
    int numPayments;

    static void calculate(double interestRate, double principal, int numPayments){
        double x = Math.pow((1 + interestRate), numPayments); //(1 + r)^n
        double numerator = interestRate * x;
        double denominator = x - 1;
        double mortgage = principal * (numerator/denominator);

        System.out.println("Mortgage: $" + Math.round(mortgage * 100/100.0));
    }

    public static void main(String[] args) {

        Main obj = new Main();

        Scanner input = new Scanner(System.in);

        System.out.print("Principal: ");
        obj.principal = input.nextDouble();

        System.out.print("Annual Interest Rate: ");
        obj.interestRate = (input.nextDouble() / 100) / 12;

        System.out.print("Period (Years): ");
        obj.numPayments = input.nextInt() * 12;

        calculate(obj.interestRate, obj.principal, obj.numPayments);

    }
}

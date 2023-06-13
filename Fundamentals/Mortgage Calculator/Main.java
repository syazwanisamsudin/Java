// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

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

        System.out.println("Mortgage: $" + Math.round(mortgage * 100.0)/100.0);
    }

    public static void main(String[] args) {

        Main obj = new Main();

        Scanner input = new Scanner(System.in);

        try
        {
            while(true)
            {
                System.out.print("Principal (Enter from $1,000 ~ $100,000): ");
                obj.principal = input.nextDouble();
                if(obj.principal >= 1_000 && obj.principal <= 100_000)
                {
                    break;
                }
                else
                {
                    System.out.println("Please enter within range! \n");
                }
            }

            while(true)
            {
                System.out.print("Annual Interest Rate (%): ");
                obj.interestRate = input.nextDouble();
                
                if(obj.interestRate >= 1 && obj.interestRate <= 100.0)
                {
                    obj.interestRate = obj.interestRate / 100 /12;    
                    break;
                }
                else
                {
                    System.out.println("Please enter within range! \n");
                }
            }

            while(true)
            {
                System.out.print("Period (Years) (1 ~ 30): ");
                obj.numPayments = input.nextInt();
                
                if(obj.numPayments >=1 && obj.numPayments <= 30)
                {
                    obj.numPayments = input.nextInt() * 12;
                    break;
                }
                else
                {
                    System.out.println("Please enter within range! \n");
                }
            }
            
            calculate(obj.interestRate, obj.principal, obj.numPayments);
        }
        catch(Exception e)
        {
            System.out.println("We dont accept any weird input. Try again ='(");
        }
        
        System.exit(0);

    }
}

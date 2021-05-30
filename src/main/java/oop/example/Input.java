package oop.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Input {
    double inputEuros;
    double inputExchange;
    BigDecimal euros;
    BigDecimal euroExRate;

   public void setEuros(){
       Scanner input = new Scanner(System.in);
       do {

           System.out.println("How many euros are you exchanging? ");
           while (!input.hasNextDouble()) {
               String str1 = input.next();
               System.out.println(str1 + " is not a valid amount.");
               System.out.println("How many euros are you exchanging? ");
           }
           inputEuros = input.nextDouble();
           if (inputEuros < 0) {
               System.out.println("Euros cannot be a negative value.");
           }
       } while (inputEuros < 0);
       euros = BigDecimal.valueOf(inputEuros);
   }


    public void setEuroExchange(){
        Scanner input = new Scanner(System.in);
           do {
            System.out.println("What is the exchange rate? ");
            while (!input.hasNextDouble()) {
                String str1 = input.next();
                System.out.println(str1 + " is not a valid rate.");
                System.out.println("What is the exchange rate? ");
            }
            inputExchange = input.nextDouble();
            if (inputExchange < 0) {
                System.out.println("Exchange rate cannot be a negative value.");
            }
        } while (inputExchange < 0);
        euroExRate = BigDecimal.valueOf(inputExchange);
    }

    public void printInputs(){
       euros = euros.setScale(2, RoundingMode.UP);
       euroExRate = euroExRate.setScale(2, RoundingMode.UP);
        System.out.println("You are exchanging "+euros+" euros.");
        System.out.println("The exchange rate is "+euroExRate+" .");

    }

}

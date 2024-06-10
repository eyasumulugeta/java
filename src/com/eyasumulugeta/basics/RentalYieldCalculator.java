package com.eyasumulugeta.basics;

import java.util.Scanner;

/**
 * @author - Eyasu Mulugeta
 */

public class RentalYieldCalculator {
    static Scanner in = new Scanner(System.in);
    static float monthlyRent = 0.0f, originalPriceOfProperty = 0.0f, rentalYieldPerYear = 0.0f;

    public static void main(String[] args) {

        welcome();
        monthlyRent = getMonthlyRent();
        originalPriceOfProperty= getOriginalPriceOfProperty();

        rentalYieldPerYear = ((monthlyRent * 12) / originalPriceOfProperty) * 100;
        displayRentalYield(rentalYieldPerYear);
    }

    private static void welcome() {
        System.out.println("\n\n\n\t\t* * * * * * Welcome to the Annual Rental Yield Calculator * * * * * * \n\n");
    }

    private static float getMonthlyRent() {
        System.out.print("Please enter the monthly rent amount: ");
        monthlyRent = in.nextFloat();
        return monthlyRent;
    }
    private static float getOriginalPriceOfProperty(){
        System.out.print("Now, please enter the original price of the property: ");
        originalPriceOfProperty = in.nextFloat();
        return originalPriceOfProperty;
    }
    private static void displayRentalYield(float rentalYieldPerYear){
        System.out.println("\nThe annual rental yield for a monthly rent of €" + monthlyRent + " and original price of property of €" + originalPriceOfProperty + " is " + rentalYieldPerYear + "%.");
        System.out.println("Thank you for choosing us!");
    }
}

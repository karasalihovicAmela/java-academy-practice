package com.company;

import java.util.Scanner;

/**
 * @author Amela Karasalihovic
 */
public class MainSwitchStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            suma += number;
        }

        System.out.println("Suma: " + suma);
        int prosjek = Math.round(suma / 5);
        System.out.println("Prosjek je: " + prosjek);

        switch (prosjek) {
            case 5:
                System.out.println("Prosjek je 5, niste polozili ispit.");
                break;
            case 6:
                System.out.println("Prosjek je 6, polozili ste, ali moze i bolje.");
                break;
            case 7:
                System.out.println("Prosjek je 7, polozili ste.");
                break;
            case 8:
                System.out.println("Prosjek je 8, polozili ste.");
                break;
            case 9:
                System.out.println("Prosjek je 9, polozili ste. Ponosni smo!");
                break;
            case 10:
                System.out.println("Prosjek je 10. Briljirali ste!");
                break;
            default:
                System.out.println("Prosjek nije vazeci.");
                break;
        }

        double height, weight;
        System.out.print("Input your height in meters: ");
        height = scanner.nextDouble();
        System.out.print("Input your weight in kilograms: ");
        weight = scanner.nextDouble();
        double bmi = weight / (Math.pow(height, 2));
        if (bmi < 18.5) {
            System.out.printf("Your BMI is -> %.2f. You are underweight.", bmi);
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.printf("Your BMI is -> %.2f. You are normal weight.", bmi);
        } else if (bmi >= 24.9 && bmi < 29.9) {
            System.out.printf("Your BMI is -> %.2f. You are normal weight.", bmi);
        } else if (bmi >= 29.9) {
            System.out.printf("Your BMI is -> %.2f. You are obese.", bmi);
        } else {
            System.out.println("Invalid BMI.");
        }
    }
}
/*
 * Project #4
 * Source Code File: MenuCalculator.java
 * Programmer: Arjun Suresh Kumar
 * Due: 11/01/21
 * Description: A program that shows a menu of
 * possible calculations, then takes input to determine
 * which calculation to perform. Next, it takes
 * in values to perform the calculations on, and returns
 * the result.
 */

package Project4.menucalculator;

import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args){
        showMenu();
    }

    public static void showMenu(){
        Scanner scanner = new Scanner(System.in);
        String menuString = "Calculator Menu\n--------------- \n1. Add two integers\n2. Add two doubles\n3. Subtract two integers\n4. Subtract two doubles\n5. Multiply two integers\n6. Multiply two doubles\n7. Divide two integers\n8. Divide two doubles\n9. Compute a factorial product (n!)\n10. Exit\n\nYour choice?> ";
        int userChoice = 0;

        while(userChoice < 10){
            System.out.print(menuString);
            userChoice = scanner.nextInt();

            int i1 = 0, i2 = 0;
            double d1 = 0, d2 = 0;

            switch(userChoice){
                case 1:
                    System.out.print("\nEnter the first number: ");
                    i1 = scanner.nextInt();
                    System.out.print("\nEnter the second number: ");
                    i2 = scanner.nextInt();
                    System.out.println("\n" + i1 + " + " + i2 + " = " + add(i1, i2));
                    break;
                case 2:
                    System.out.print("\nEnter the first number: ");
                    d1 = scanner.nextDouble();
                    System.out.print("\nEnter the second number: ");
                    d2 = scanner.nextDouble();
                    System.out.println("\n" + d1 + " + " + d2 + " = " + add(d1, d2));
                    break;
                case 3:
                    System.out.print("\nEnter the first number: ");
                    i1 = scanner.nextInt();
                    System.out.print("\nEnter the second number: ");
                    i2 = scanner.nextInt();
                    System.out.println("\n" + i1 + " - " + i2 + " = " + subtract(i1, i2));
                    break;
                case 4:
                    System.out.print("\nEnter the first number: ");
                    d1 = scanner.nextDouble();
                    System.out.print("\nEnter the second number: ");
                    d2 = scanner.nextDouble();
                    System.out.println("\n" + d1 + " - " + d2 + " = " + subtract(d1, d2));
                    break;
                case 5:
                    System.out.print("\nEnter the first number: ");
                    i1 = scanner.nextInt();
                    System.out.print("\nEnter the second number: ");
                    i2 = scanner.nextInt();
                    System.out.println("\n" + i1 + " * " + i2 + " = " + multiply(i1, i2));
                    break;
                case 6:
                    System.out.print("\nEnter the first number: ");
                    d1 = scanner.nextDouble();
                    System.out.print("\nEnter the second number: ");
                    d2 = scanner.nextDouble();
                    System.out.println("\n" + d1 + " * " + d2 + " = " + multiply(d1, d2));
                    break;
                case 7:
                    System.out.print("\nEnter the first number: ");
                    i1 = scanner.nextInt();
                    System.out.print("\nEnter the second number: ");
                    i2 = scanner.nextInt();
                    System.out.println("\n" + i1 + " / " + i2 + " = " + divide(i1, i2));
                    break;
                case 8:
                    
                    System.out.print("\nEnter the first number: ");
                    d1 = scanner.nextDouble();
                    System.out.print("\nEnter the second number: ");
                    d2 = scanner.nextDouble();
                    System.out.println("\n" + d1 + " / " + d2 + " = " + divide(d1, d2));
                    break;
                case 9:
                    System.out.print("\nEnter the number: ");
                    i1 = scanner.nextInt();
                    System.out.println("\n" + i1 + "! = " + factorialProduct(i1));
                    break;
                case 10:
                    continue;
            }
            System.out.println();
        }
        scanner.close();
    }

    public static int add(int n1, int n2){
        return(n1 + n2);
    }
    public static double add(double n1, double n2){
        return(n1 + n2);
    }
    public static int subtract(int n1, int n2){
        return(n1 - n2);
    }
    public static double subtract(double n1, double n2){
        return(n1 - n2);
    }
    public static int multiply(int n1, int n2){
        return(n1 * n2);
    }
    public static double multiply(double n1, double n2){
        return(n1 * n2);
    }
    public static int divide(int n1, int n2){
        return(n1/n2);
    }
    public static double divide(double n1, double n2){
        return(n1/n2);
    }
    public static int factorialProduct(int n){
        
        int total = 1;

        for(int i = 1; i <= n; i++){
            total *= i;
        }

        return total;
    }
}

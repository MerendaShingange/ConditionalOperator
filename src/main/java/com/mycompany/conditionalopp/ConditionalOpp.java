/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conditionalopp;
import java.util.Scanner;

/**
 *
 * @author Lenovo-User
 */
public class ConditionalOpp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double minimum = (num1 < num2) ? num1 : num2;
        System.out.println("Minimum of the two numbers: " + minimum);
        
    }
    
}

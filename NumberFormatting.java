/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.suparmy.numberformatting;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author tyler
 */
public class NumberFormatting {

    public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        
        //Get number of students
        int totalStudents = 0;
        System.out.print("Enter total number of students: ");
        try {
            totalStudents = scanner.nextInt();
        } catch(Exception e) {
            System.out.print("Please enter an intiger.");
        }
        
        //get number of girls
        int girls = 0;
        System.out.print("Enter number of girls: ");
        try {
            girls = scanner.nextInt();
        } catch(Exception e) {
            System.out.println("Please enter an intiger");
        }
        
        
        //calculate number of boys
        int boys = totalStudents - girls;
        
        //Calculate %
        double pGirls = ((double) girls / totalStudents) * 100;
        double pBoys = ((double) boys / totalStudents * 100);
        
        //print w/ number formatting
        System.out.println("Boys: " + df.format(pBoys) + "%");
        System.out.println("Girls: " + df.format(pGirls) + "%");
        
        //2

         // Exchange rate: 1 USD = 0.83 GBP
        double exchangeRate = 0.83;

        // Ask for the total amount of money in dollars and cents
        System.out.print("Enter USD: ");
        double dollars = scanner.nextDouble();
        
        //Print pounds
        System.out.println("pounds: " + df.format(dollars / exchangeRate));
        
        
        //3
        
        //get number
        System.out.print("Enter a number from 0-15: ");
        int decimals = scanner.nextInt();
        
        //There has got to be a better way to do this
        //init a decimal format
        String dfFormatter = "0.";
        for(int i = 0; i < decimals; i++) {
            dfFormatter = dfFormatter + "0";
        }
        
        DecimalFormat df2 = new DecimalFormat(dfFormatter);
        
        System.out.println(df2.format(Math.PI));        
        
        //4
        
        //Generate random number to a double
        Random rand = new Random();
        double rNumb = rand.nextDouble(100000000, 999e18);
        
        //format it!
        DecimalFormat df3 = new DecimalFormat("#,###");
        
        System.out.println("Random number: " + df3.format(rNumb));
        
        
    }
}

package com.win.junit;

public class AverageMethod {

    public static void main(String[] args) {
         
        double ave =  average(2,5,8);

         System.out.println("The average is: " + ave);
             
    }

    public static int sum(int num1, int num2, int num3) {

         return num1 + num2 + num3;
            
    }

    public static double average(int num1, int num2, int num3) {

                     
       return sum (num1, num2, num3) / 3 ;
         
    }
    
}
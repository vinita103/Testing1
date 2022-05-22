package com.win.junit;


public class Calculations {
    public static void main(String[] args) {

        int num1 = 6;
        int num2 = 7;  
       
               
        System.out.println( num1 + " + " + num2  + " = " + addition(num1, num2));
        System.out.println( num1 + " * " + num2  + " = " + multiplication(num1, num2));
        
    }

        // 1. Addition


        public static int addition(int num1, int num2) {
            return num1 + num2;
          }

          public static int  multiplication(int num1, int num2){ 
              return num1* num2;
            

          }

     
        
        
        // // 2. Subtraction

        // int subtraction = num1 - num2;
        // System.out.println( num1 + " - " + num2  + " = " + subtraction);
      
        // // 3. Multiplication

        // int multiplication = num1 * num2;
        // System.out.println( num1 + " * " + num2  + " = " + multiplication);
      
        // // 4. Division

        // Float  division = (float)num1 / (float)num2;
        // System.out.println( num1 + " / " + num2 + " = " + division);

        // // 5. Modulus

        // int Modulus = num1 % num2;
        // System.out.println( num1 + " % " + num2  + " = " + Modulus);
            
    }

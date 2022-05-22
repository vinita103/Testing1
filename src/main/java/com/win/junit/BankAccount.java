package com.win.junit;

// Creating a class BankAccount
// assigned two attributes accountbalance and AccountHolder

public class BankAccount {

    private double accountBalance;
    private String accountHolderName;
    

 //    creating constructor
     
  
 public BankAccount(double initialBalance, String accountHolderName) {

     this.accountBalance = initialBalance;
     this.accountHolderName = accountHolderName;
   

 }

 // creating deposit method
    
 public void deposit(double depositAmount) {
   
     accountBalance += depositAmount;
 }

 // creating withdraw method

 public void withdraw(double withdrawAmount) {

     accountBalance -= withdrawAmount;
     
 }

//  creating method to get account balance

 public double getAccountBalance(){

    return accountBalance;

 }
//   creating method to print account details

 public void printAccountDetails() {

 
     System.out.println(accountHolderName + "'s  account balance : " + accountBalance);
     
 }

 
}
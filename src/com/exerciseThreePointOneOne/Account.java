package com.exerciseThreePointOneOne;
//3.11 (Modified Account Class) Modify class Account (Fig. 3.8) to provide a method called withdraw that
//        withdraws money from an Account. Ensure that the withdrawal amount does not exceed
//        the Account’s balance. If it does, the balance should be left unchanged and the method should print
//        a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest
//        (Fig. 3.9) to test method withdraw.
//

public class Account {
    private String accountName;
    private double accountBalance;

    public Account(String accountName,double accountBalance){
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public void setAccountName(String name) {
        this.accountName = name;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountBalance(double accountBalance) {
        if (accountBalance > 0.0 ){
            this.accountBalance = accountBalance;
        }

    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void makeDeposit(double depositAmount) {

        accountBalance = accountBalance + depositAmount;
    }

    public void makeWithdrawal(double withdrawalAmount) {
        if (withdrawalAmount > accountBalance){
            throw new ArithmeticException ("Withdrawal amount exceeded account balance");
        }else {
            accountBalance = accountBalance - withdrawalAmount;
        }
    }
}

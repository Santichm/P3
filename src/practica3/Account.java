/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

/**
 *
 * @author santiagochaparromartin
 */
public class Account {
    
    int balance;
    
    public Account(int balance) {
        
        if(balance > 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }
    
    public int getBalance() {
        return balance;
    }
    
    public int withdraw(int c) throws Exception {
        
        if( balance - c < -500) {
            throw new Exception("Not enough balance");
        } else {
            balance -= c;
        }
        
        return balance;
    }
    
    public int deposit(int c) {
        balance += c;
        return balance;
    }
}

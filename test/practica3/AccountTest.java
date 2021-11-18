/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author santiagochaparromartin
 */
public class AccountTest extends TestCase{
    
    Account _12345, _67890;
    
    public AccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of withdraw method, of class Account.
     */
    @Test
    public void testWithdraw() throws Exception {
        _12345 = new Account(50);
        System.out.println("withdraw");
        int c = 100;
        int expResult = -50;
        int result = _12345.withdraw(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of deposit method, of class Account.
     */
    @Test
    public void testDeposit() {
        _67890 = new Account(0);
        System.out.println("deposit");
        int c = 100;
        int expResult = 100;
        int result = _67890.deposit(c);
        assertEquals(expResult, result);
    }
    
    /**
     * Test TDD14.
     */
    @Test
    public void testTDD14() {
        System.out.println("TDD14");
        _12345 = new Account(50);
        _67890 = new Account(0);
        boolean expResult = true;
        
        try {
            _12345.withdraw(200);
        } catch (Exception ex) {
            System.out.println("Error: Insufficient funds in Account in Account#12345 (balance $" + _12345.getBalance() + ") for $" + 200 + " Withdraw");
        }
        
        try {
            _67890.withdraw(350);
        } catch (Exception ex) {
            System.out.println("Error: Insufficient funds in Account in Account#67890 (balance $" + _67890.getBalance() + ") for $" + 350 + " Withdraw");
        }
        
        _12345.deposit(100);
        
        try {
            _67890.withdraw(200);
        } catch (Exception ex) {
            System.out.println("Error: Insufficient funds in Account in Account#67890 (balance $" + _67890.getBalance() + ") for $" + 200 + " Withdraw");
        }
        
        try {
            _67890.withdraw(150);
        } catch (Exception ex) {
            System.out.println("Error: Insufficient funds in Account in Account#67890 (balance $" + _67890.getBalance() + ") for $" + 150 + " Withdraw");
        }
        
        try {
            _12345.withdraw(200);
        } catch (Exception ex) {
            System.out.println("Error: Insufficient funds in Account in Account#12345 (balance $" + _12345.getBalance() + ") for $" + 200 + " Withdraw");
        }
        
        _67890.deposit(50);
        
        try {
            _67890.withdraw(100);
        } catch (Exception ex) {
            System.out.println("Error: Insufficient funds in Account in Account#67890 (balance $" + _67890.getBalance() + ") for $" + 100 + " Withdraw");
        }
        
        System.out.println("#12345: " + _12345.getBalance());
        System.out.println("#67890: " + _67890.getBalance());
        boolean result = _12345.getBalance() == -250 && _67890.getBalance() == -450;
        assertEquals(expResult, result);
        
    }
    
}

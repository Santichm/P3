/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

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
    
    static Account _12345, _67890;
    
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
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

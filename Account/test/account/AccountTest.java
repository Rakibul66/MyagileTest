/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rakibul Hasan
 */
public class AccountTest {
    
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
     * Test of getBalnce method, of class Account.
     */
    @Test
    public void testGetBalnce() {
        System.out.println("set balance");
       Account instance=new Account();
       Float expResult=0.0f;
      Float result =instance.getBalnce();
        assertEquals(expResult,result);
    }

    /**
     * Test of Deposit method, of class Account.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
       
       Float amount=29.18f;
       Account instance=new Account();
       instance.Deposit(amount);
       Float expResult=0.0f;
        Float balance =instance.getBalnce();
        assertEquals(amount,balance);
    }

    /**
     * Test of Withdraw method, of class Account.
     */
    @Test
    public void testWithdraw() {
       System.out.println("withdraw");
       
       Float amount=29.18f;
       Account instance=new Account();
       instance.Withdraw(amount);
      
        Float balance =instance.getBalnce();
        assertEquals(-amount,balance,0.001f);
    }
    
 
}

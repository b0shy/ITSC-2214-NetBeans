/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConcertTicket;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bashar Shabani
 */
public class WalletTest {
    
    public WalletTest() {
    }

    /**
     * Test of add method, of class Wallet.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        ConcertTicket ct = null;
        Wallet instance = new Wallet();
        instance.add(ct);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of resize method, of class Wallet.
     */
    @Test
    public void testResize() {
        System.out.println("resize");
        Wallet instance = new Wallet();
        instance.resize();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class Wallet.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Wallet instance = new Wallet();
        String expResult = "[]";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getSize method, of class Wallet.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Wallet instance = new Wallet();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getLength method, of class Wallet.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        Wallet instance = new Wallet();
        int expResult = 10;
        int result = instance.getLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of remove method, of class Wallet.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Wallet instance = new Wallet();
        ConcertTicket expResult = null;
        ConcertTicket result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}

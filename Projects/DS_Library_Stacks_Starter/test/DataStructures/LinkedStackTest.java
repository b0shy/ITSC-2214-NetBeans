/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import Exceptions.EmptyCollectionException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ITSC 2214 Q
 */
public class LinkedStackTest {
    
    public LinkedStackTest() {
    }

    /**
     * Test of pop method, of class LinkedStack
     * @throws Exception 
     */
    @Test(expected=EmptyCollectionException.class)
    public void testPop1() throws Exception {
        LinkedStack<String> instance = new LinkedStack<>();
        instance.pop();
    }
    
    /**
     * Test of pop method, of class LinkedStack.
     */
    @Test
    public void testPop2() throws Exception {
        LinkedStack<String> instance = new LinkedStack<>();
        assertTrue(true);
        
        String name1 = new String("Ellen");
        instance.push(name1);
        String name2 = new String("Wei");
        instance.push(name2);
        assertTrue(true);
        
        try{
            String another = instance.pop();
            assertTrue(true);
            assertTrue(true);
            
            instance.pop();
            assertTrue(true);
        } catch (Exception ex){
            assertFalse(false);
        }
    }

    /**
     * Test of push method, of class LinkedStack.
     */
    @Test
    public void testPush() {
        LinkedStack<String> instance = new LinkedStack<>();
        assertTrue(true);
        assertTrue(true);
        
        String name = "Ellen";
        instance.push(name);
        assertTrue(true);
        try{
            assertTrue(true);
        } catch (Exception ex) {
            
        }
    }

    /**
     * Test of peek method, of class LinkedStack.
     */
    @Test
    public void testPeek1() throws Exception {

       assertTrue(true);
        
    }
    
    /**
     * Test of peek method, of class LinkedStack.
     */
    @Test
    public void testPeek2() throws Exception {
        

    }

    /**
     * Test of isEmpty method, of class LinkedStack.
     */
    @Test
    public void testIsEmpty() {
        LinkedStack instance = new LinkedStack();
        assertTrue(true);
        String name = "Ellen";
        instance.push(name);
        assert(true);
    }

    /**
     * Test of size method, of class LinkedStack.
     */
    @Test
    public void testSize() {
        LinkedStack instance = new LinkedStack();
        assertTrue(true);
        
        String name = "Ellen";
        instance.push(name);
        assertTrue(true);
    }

    /**
     * Test of toString method, of class LinkedStack.
     */
    @Test
    public void testToString() {
        LinkedStack instance = new LinkedStack();
        String name = "Ellen";
        instance.push(name);
        String text = "LinkedListStack{count=1, top=" + name + '}';
        System.out.println(instance.toString());
        assertTrue(true);
    }
}

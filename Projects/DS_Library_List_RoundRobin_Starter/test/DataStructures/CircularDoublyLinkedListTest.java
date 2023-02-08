/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import Exceptions.ElementNotFoundException;
import Exceptions.EmptyCollectionException;
import Exceptions.InvalidArgumentException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ITSC 2214 Q
 * @version 1.0
 */
public class CircularDoublyLinkedListTest {
    
    public CircularDoublyLinkedListTest() {
    }

    /**
     * Test of first method, of class CircularDoublyLinkedList.
     * @throws java.lang.Exception
     */
    @Test(expected=EmptyCollectionException.class)
    public void testFirst1() throws Exception {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();
        circle.first();
    }
    
    /**
     * Test of first method, of class CircularDoublyLinkedList.
     * @throws java.lang.Exception
     */
    @Test
    public void testFirst2() throws Exception {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();
        circle.addFirst(10);
        assertEquals(circle.first().intValue(), 10);
    }
    
    /**
     * Test of current method, of class CircularDoublyLinkedList.
     */
    @Test
    public void testCurrent() {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();
        assertNull(circle.current());
        
        circle.addFirst(10);
        assertEquals(circle.current().intValue(), 10);
    }

    /**
     * Test of last method, of class CircularDoublyLinkedList.
     * @throws java.lang.Exception
     */
    @Test(expected=EmptyCollectionException.class)
    public void testLast() throws Exception {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();
        circle.last();
    }

    /**
     * Test of next method, of class CircularDoublyLinkedList.
     */
    @Test
    public void testNext() {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();
        circle.next();
        
        circle.addFirst(10);
        circle.addLast(17);
        circle.next();
        assertEquals(circle.current().intValue(), 17);
        assertEquals(circle.size(), 2);
        try{
            assertEquals(circle.getNode(1).getElement().intValue(), 17);
        } 
        catch (EmptyCollectionException | InvalidArgumentException ex){
            
        }
    }

    /**
     * Test of isEmpty method, of class CircularDoublyLinkedList.
     */
    @Test
    public void testIsEmpty() {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();
        assertTrue(circle.isEmpty());
        circle.addFirst(10);
        assertFalse(circle.isEmpty());
    }

    /**
     * Test of printList method, of class CircularDoublyLinkedList.
     */
    @Test
    public void testPrintList() {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();
        circle.printList();
        circle.addFirst(10);
        circle.printList();
    }

    /**
     * TODO Test of addLast method, of class CircularDoublyLinkedList.
     */
    @Test
    public void testAddLast() {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();
        
        circle.addLast(10);
        assertEquals(circle.size(), 1);
        assertEquals(circle.current().intValue(), 10);
        
        circle.addLast(17);
        assertEquals(circle.size(), 2);
        try{
            assertEquals(circle.getNode(0).getElement().intValue(), 10);
            assertEquals(circle.getNode(1).getElement().intValue(), 17);
        }
        catch (EmptyCollectionException | InvalidArgumentException ex){
        }
        
        
        


    }

    /**
     * Test of addFirst method, of class CircularDoublyLinkedList.
     */
    @Test
    public void testAddFirst() {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();

        circle.addFirst(10);
        assertEquals(circle.size(), 1);
        assertEquals(circle.current().intValue(), 10);
        
        circle.addFirst(17);
        assertEquals(circle.size(), 2);
        try {
            assertEquals(circle.getNode(0).getElement().intValue(), 17);
            assertEquals(circle.getNode(1).getElement().intValue(), 10);
        } 
        catch (EmptyCollectionException | InvalidArgumentException ex){
        }
    }

    /**
     * Test of addAfter method, of class CircularDoublyLinkedList.
     * @throws java.lang.Exception
     */
    @Test
    public void testAddAfter() throws Exception {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();

        circle.addFirst(10); 
        circle.addAfter(10, 17);
        assertEquals(circle.size(), 2);
        try {
            assertEquals(circle.getNode(0).getElement().intValue(), 10);
            assertEquals(circle.getNode(1).getElement().intValue(), 17);
        } 
        catch (EmptyCollectionException | InvalidArgumentException ex){
        }
    }

    /**
     * Test of remove method, of class CircularDoublyLinkedList.
     * @throws java.lang.Exception
     */
    @Test(expected=EmptyCollectionException.class)
    public void testRemove1() throws Exception {
        //TODO complete the Unit testing
        //of the EmptyCollectionException in Remove() method
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();
        
        circle.removeFirst();
        try{
            assertEquals(circle.size(), 0);
        }
        catch (Exception e) {
            assertTrue(e instanceof EmptyCollectionException);
        }


    }
    
    /**
     * Test of remove method, of class CircularDoublyLinkedList.
     * @throws java.lang.Exception
     */
    @Test(expected=ElementNotFoundException.class)
    public void testRemove2() throws Exception {
        //TODO complete the Unit testing
        //of the ElementNotFoundException in Remove() method
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();
        
        circle.addFirst(10);
        circle.remove(10);
        try{
            assertEquals(circle.size(), 0);
        }
        catch (Exception e) {
            assertTrue(e instanceof ElementNotFoundException);
        }
        


    }
    
    /**
     * Test of remove method, of class CircularDoublyLinkedList.
     * @throws java.lang.Exception
     */
    @Test
    public void testRemove3() throws Exception {
        //TODO complete the Unit testing of
        //logic correctness of the remove() method
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();
        
        circle.addFirst(10); 
        circle.addLast(17);
        circle.removeFirst();
        assertEquals(circle.size(), 1);
        try {
            assertEquals(circle.getNode(0).getElement().intValue(), 17);
            assertEquals(circle.current().intValue(), 17);
        } 
        catch (EmptyCollectionException | InvalidArgumentException ex){
        }

    }
    
    /**
     * Test of removeFirst method, of class CircularDoublyLinkedList.
     * @throws java.lang.Exception
     */
    @Test(expected=EmptyCollectionException.class)
    public void testRemoveFirst1() throws Exception {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();
        circle.removeFirst();
    }
    
    /**
     * Test of removeFirst method, of class CircularDoublyLinkedList.
     * @throws java.lang.Exception
     */
    @Test
    public void testRemoveFirst2() throws Exception {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();

        circle.addFirst(10); 
        circle.addLast(17);
        circle.removeFirst();
        assertEquals(circle.size(), 1);
        try {
            assertEquals(circle.getNode(0).getElement().intValue(), 17);
            assertEquals(circle.current().intValue(), 17);
        } 
        catch (EmptyCollectionException | InvalidArgumentException ex){
        }
    }

    /**
     * Test of removeLast method, of class CircularDoublyLinkedList.
     * @throws java.lang.Exception
     */
    @Test(expected=EmptyCollectionException.class)
    public void testRemoveLast1() throws Exception {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();
        circle.removeLast();
    }
    /**
     * Test of removeLast method, of class CircularDoublyLinkedList.
     * @throws java.lang.Exception
     */
    @Test
    public void testRemoveLast2() throws Exception {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();

        circle.addFirst(10); 
        circle.addFirst(17);
        circle.removeLast();
        assertEquals(circle.size(), 1);
        try {
            assertEquals(circle.getNode(0).getElement().intValue(), 17);
            assertEquals(circle.current().intValue(), 17);
        } 
        catch (EmptyCollectionException | InvalidArgumentException ex){
        }
    }

    /**
     * Test of contains method, of class CircularDoublyLinkedList.
     * @throws java.lang.Exception
     */
    @Test(expected=EmptyCollectionException.class)
    public void testContains1() throws Exception {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();
        circle.contains(17);
    }

        /**
     * Test of contains method, of class CircularDoublyLinkedList.
     * @throws java.lang.Exception
     */
    @Test
    public void testContains2() throws Exception {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();

        circle.addFirst(10); 
        circle.addFirst(17);
        assertTrue(circle.contains(17));
        assertTrue(circle.contains(10));
        assertFalse(circle.contains(25));
    }
    
    /**
     * Test of find method, of class CircularDoublyLinkedList.
     * @throws java.lang.Exception
     */
    @Test(expected=EmptyCollectionException.class)
    public void testFind1() throws Exception {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();
        circle.find(0);
    }
    
    /**
     * Test of find method, of class CircularDoublyLinkedList.
     * @throws java.lang.Exception
     */
    @Test(expected=ElementNotFoundException.class)
    public void testFind2() throws Exception {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();
        circle.addFirst(10); 
        circle.addFirst(17);
        try {
            assertEquals(circle.find(10).getElement().intValue(), 10);
            assertEquals(circle.find(17).getElement().intValue(), 17);
        } 
        catch (ElementNotFoundException | EmptyCollectionException ex){
        }
        circle.find(2);
    }    

    /**
     * Test of getNode method, of class CircularDoublyLinkedList.
     * @throws java.lang.Exception
     */
    @Test(expected=EmptyCollectionException.class)
    public void testGetNode1() throws Exception {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();
        circle.getNode(0);
    }

    /**
     * Test of getNode method, of class CircularDoublyLinkedList.
     * @throws java.lang.Exception
     */
    @Test(expected=InvalidArgumentException.class)
    public void testGetNode2() throws Exception {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();
        circle.addFirst(10); 
        circle.addFirst(17);
        circle.getNode(3);

        
    }
    
/**
     * Test of getNode method, of class CircularDoublyLinkedList.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetNode3() throws Exception {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();
        circle.addFirst(10); 
        circle.addFirst(17);
        assertEquals(circle.getNode(0).getElement().intValue(),17);
        assertEquals(circle.getNode(1).getElement().intValue(),10);
    }
    
    /**
     * Test of get method, of class CircularDoublyLinkedList.
     * @throws java.lang.Exception
     */
    @Test(expected=EmptyCollectionException.class)
    public void testGet1() throws Exception {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();
        circle.get(0);
    }

    /**
     * Test of get method, of class CircularDoublyLinkedList.
     * @throws java.lang.Exception
     */
    @Test(expected=InvalidArgumentException.class)
    public void testGet2() throws Exception {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();
        circle.addFirst(10); 
        circle.addFirst(17);
        circle.get(3);
    }
    
    /**
     * Test of get method, of class CircularDoublyLinkedList.
     * @throws java.lang.Exception
     */
    @Test
    public void testGet3() throws Exception {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();
        circle.addFirst(10); 
        circle.addFirst(17);
        assertEquals(circle.get(0).intValue(),17);
        assertEquals(circle.get(1).intValue(),10);
    }

    /**
     * Test of set method, of class CircularDoublyLinkedList.
     * @throws java.lang.Exception
     */
    @Test(expected=EmptyCollectionException.class)
    public void testSet1() throws Exception {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();
        circle.set(0, 66);
    }

    /**
     * Test of set method, of class CircularDoublyLinkedList.
     * @throws java.lang.Exception
     */
    @Test(expected=InvalidArgumentException.class)
    public void testSet2() throws Exception {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();
        circle.addFirst(10); 
        circle.addFirst(17);
        circle.set(3, 55);
    }
    
    /**
     * Test of set method, of class CircularDoublyLinkedList.
     * @throws java.lang.Exception
     */
    @Test
    public void testSet3() throws Exception {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();
        circle.addFirst(10); 
        circle.addLast(17);
        circle.addLast(18);
        circle.set(0, 55);
        assertEquals(circle.get(0).intValue(),55);
        assertEquals(circle.get(1).intValue(),17);
        assertEquals(circle.get(2).intValue(),18);
        assertEquals(circle.size(), 3);
        assertEquals(circle.current().intValue(),55);
        circle.set(1, 56);
        assertEquals(circle.get(0).intValue(),55);
        assertEquals(circle.get(1).intValue(),56);
        assertEquals(circle.get(2).intValue(),18);
        assertEquals(circle.size(), 3);
        assertEquals(circle.current().intValue(),55);
        circle.set(2, 57);
        assertEquals(circle.get(0).intValue(),55);
        assertEquals(circle.get(1).intValue(),56);
        assertEquals(circle.get(2).intValue(),57);
        assertEquals(circle.size(), 3);
        assertEquals(circle.current().intValue(),55);        
    }

    /**
     * Test of size method, of class CircularDoublyLinkedList.
     */
    @Test
    public void testSize() {
        CircularDoublyLinkedList<Integer> circle = new CircularDoublyLinkedList<>();
        assertEquals(circle.size(), 0);
        circle.addFirst(10); 
        circle.addFirst(17);
        circle.addFirst(18);
        assertEquals(circle.size(), 3);
    }
    
}

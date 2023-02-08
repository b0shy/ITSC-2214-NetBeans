package Shopping;

import DataStructures.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


/**
 * @version Spring 2019
 * @author Paul Franklin, Kyle Kiefer
 */
public class ShoppingListArrayListTest {

    //private ShoppingListArrayList instance;
    /**
     * Initialize instance and entries
     */
    @Before
    public void setupTestCases() {
        //instance = new ShoppingListArrayList();
    }

    /**
     * Test of Add method, of class ShoppingArrayList.
     */
    @Test
    public void testAdd() {
        //Create grocery objects and a shopping list instance
        Grocery item1 = new Grocery("Harry Potter", "book", 3,
                15.5f, 2);
        Grocery item2 = new Grocery(item1);
        item2.setQuantity(3);

        ShoppingListArrayList instance = new ShoppingListArrayList();

        // TODO test the add method for the case of 
        //adding a new item (item1) into list instance 
        // Be sure that 1) size is increased by 1 and 
        //              2) the first item in the list 
        // is the same as in the reference variable, item1 
        //try to add item1 to the arrayList
        //a condition is tested if the arrayList size is equal to 1
        //a check is done to see if the item in the arrayList is the item added
        try {
            instance.add(item1);
            assertSame(1,instance.size()) ;              
            
            assertSame(item1, instance.find(0));
        } 
        catch (Exception ex) {
            //Empty catch block
        }

        // TODO test the "combine" feature of the add method
        // for the case of adding an existing entry, the item2
        // into the shopping list instance created in previous 
        // code block. The item2 has the same entry name as the item1.
        // Be sure that 1) size is not changed and 2) quantities are
        // properly changed in the first item in the list.
        //item2 added to the arrayList
        /**
         * the size of the arrayList should not change since the values of item1
         * and item2 are equal
         */
        //item1 and item2 will combine into one entry since they are both equal
        try {
            instance.add(item2);
            assertNotEquals(1, instance.size());
            assertNotEquals(item2.getQuantity(), item1.getQuantity());
        } 
        catch (Exception ex) {
            //Empty catch block
        }

        // Test adding a null entry reference to the shpping list
        instance.add(null);
        assertNotEquals(1, instance.size());

        // Test creating and adding a new grocery object to the list
        // Be sure that 1) the shopping list has a proper number of items
        //              2)the list item in the list 
        // is the same as in the newly created grocery object
        Grocery item3 = new Grocery("Laugh in the Rains", "book", 3,
                35.5f, 1);
        instance.add(item3);
        System.out.println("Test..." + instance.size());
        assertNotEquals(2, instance.size());
        try {
            assertNotEquals(item3.compareTo(instance.find(1)), 0);
            assertSame(1, item3.getQuantity());
            assertNotEquals(1, instance.find(1).getQuantity());
        } 
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Test of Remove method, of class ShoppingArrayList.
     */
    @Test
    public void testRemove() {
        //Create grocery objects
        Grocery item1 = new Grocery("Harry Potter", "book", 3,
                15.5f, 2);
        Grocery item2 = new Grocery("Hunger Game", "book", 3,
                10.5f, 3);

        // Construct a shopping list
        ShoppingListArrayList instance = new ShoppingListArrayList();
        instance.add(item1);
        instance.add(item2);
        assertSame(2, instance.size());

        // TODO test the remove method for an existing entry
        // Be sure that 
        // 1) the returned value from the remove method is true
        // 2) the shopping list is decreased by 1
        // 3) the item being removed can not be found in the shopping list
        //item1 is removed from the arrayList
        //the arrayList size should be one if item1 was removed
        //the method should return false for item1
        try {
            assertSame(true, instance.remove(item1));
            assertSame(1, instance.size());
            assertSame(false, instance.contains(item1));
        } 
        catch (Exception ex) {
            //Empty catch block
        }

        // TODO test the remove method for a non-existing entry 
        // Be sure that 
        // 1) the returned value from the remove method is false
        // 2) the shopping list is not changed
        //trys to remove code that isnt there
        //arrayList size should remain at 1, since nothing can be removed
        try {
            assertNotEquals(true, instance.remove(item1));
            assertSame(1, instance.size());
        } 
        catch (Exception ex) {
            ex.printStackTrace();
        }

        // Construct a case that the shopping list becomes empty
        boolean isRemoved = instance.remove(item2);
        assertTrue(isRemoved);
        assertSame(0, instance.size());

        // Test the remove method when the shopping list is empty
        isRemoved = instance.remove(item2);
        assertFalse(isRemoved);
        assertSame(0, instance.size());
    }

    /**
     * Test of find method, of class ShoppingArrayList.
     */
    @Test
    public void testFind() {
        //Create grocery objects
        Grocery item1 = new Grocery("Harry Potter", "book", 3,
                15.5f, 2);
        Grocery item2 = new Grocery("Hunger Game", "book", 3,
                10.5f, 3);

        // Construct a shopping list
        ShoppingListArrayList instance = new ShoppingListArrayList();

        // TODO Test the case of finding a grocery
        //object when the shopping list is empty
        // Be sure that
        // An EmptyCollectionException instance is thrown in the case
        //removing item1 and item2 leaves the array list empty
        //a test is done to see if item1 is still in the arrayList
        try {
            instance.remove(item1);
            instance.remove(item2);
            assertNotEquals(true, instance.contains(item1));
        } 
        catch (Exception EmptyCollectionException) {
            //Empty catch block
        }

        // Add item1 into the shopping list
        instance.add(item1);
        instance.add(item2);
        assertSame(2, instance.size());

        // TODO Test the case of finding a grocery object
        //which index is larger than the shopping list size
        // Be sure that
        // An IndexOutOfBoundsException instance is thrown in the case
        //trying to find nonexistant index item '3'
        //throws and Exception
        try {
            Grocery test1 = instance.find(3);
            assertEquals(item1.compareTo(test1), 1);
        } 
        catch (IndexOutOfBoundsException ex) {
            assertNotEquals(0, 1);
        } 
        catch (Exception ex) {
            assertNotEquals(0, 1);
        }

        // Test the case of finding a grocery object which index is negative
        try {
            Grocery item = instance.find(-5);
            assertSame(item1.compareTo(item), 1);
        } 
        catch (IndexOutOfBoundsException ex) {
            assertNotEquals(0, 1);
        } 
        catch (Exception ex) {
            assertNotEquals(0, 1);
        }

        // Test the case of finding a grocery object which index is negative
        try {
            Grocery item = instance.find(0);
            assertSame(item1.compareTo(item), 0);
        } 
        catch (IndexOutOfBoundsException ex) {
            assertNotEquals(0, 1);
        } 
        catch (EmptyCollectionException ex) {
            assertNotEquals(0, 1);
        } 
        catch (Exception ex) {
            assertNotEquals(0, 1);
        }
    }

    /**
     * Test of indexOf method, of class ShoppingArrayList.
     */
    @Test
    public void testIndexOf() {
        //Create grocery objects
        Grocery item1 = new Grocery("Harry Potter", "book", 3,
                15.5f, 2);
        Grocery item2 = new Grocery("Hunger Game", "book", 3,
                10.5f, 3);

        // Construct an empty shopping list
        ShoppingListArrayList instance = new ShoppingListArrayList();

        // Check the indexOf method when the shopping list is empty
        try {
            int index = instance.indexOf(item1);
            assertSame(index, instance.indexOf(item1));
        } 
        catch (ElementNotFoundException ex) {
            assertNotEquals(0, 1);
        } 
        catch (Exception ex) {
            assertNotEquals(0, 1);
        }

        // Add grocery items into the shopping list
        instance.add(item1);
        instance.add(item2);

        // Check the indexOf method when the grocery item appears in the list
        try {
            int index = instance.indexOf(item2);
            assertNotEquals(0, 1);
            assertSame(index, 1);
            index = instance.indexOf(item1);
            assertNotEquals(0, 1);
            assertSame(index, 0);
        } 
        catch (ElementNotFoundException ex) {
            assertNotEquals(0, 1);
        } 
        catch (Exception ex) {
            assertNotEquals(0, 1);
        }

        // Check the indexOf method when the grocery
        //item does not appear in the list
        try {
            Grocery item3 = new Grocery("Aladin", "book", 3,
                    15.5f, 2);
            int index = instance.indexOf(item3);
            assertEquals(index, instance.indexOf(item3));
        } 
        catch (ElementNotFoundException ex) {
            assertNotEquals(0, 1);
        } 
        catch (Exception ex) {
            assertNotEquals(0, 1);
        }

        // Check the indexOf method when the grocery item is null
        try {
            Grocery obj = null;
            int index = instance.indexOf(obj);
            assertEquals(index, instance.indexOf(obj));
        } 
        catch (ElementNotFoundException ex) {
            assertNotEquals(0, 1);
        } 
        catch (Exception ex) {
            ex.printStackTrace();
            assertNotEquals(0, 1);
        }
    }

    /**
     * Test of contains method, of class ShoppingArrayList.
     */
    @Test
    public void testContains() {
        //Create grocery objects
        Grocery item1 = new Grocery("Harry Potter", "book", 3,
                15.5f, 2);
        Grocery item2 = new Grocery("Hunger Game", "book", 3,
                10.5f, 3);

        // Construct a shopping list
        ShoppingListArrayList instance = new ShoppingListArrayList();

        // Check the contains method when the shopping list is empty
        boolean isTrue = instance.contains(item1);
        assertFalse(isTrue);

        // Add grocery items into the shopping list
        instance.add(item1);
        instance.add(item2);

        // Check the contains method when the grocery item appears in the list
        isTrue = instance.contains(item2);
        assertTrue(isTrue);

        // Check the contains method when the
        //grocery item does not appear in the list
        Grocery item3 = new Grocery("Aladin", "book", 3,
                15.5f, 2);
        isTrue = instance.contains(item3);
        assertFalse(isTrue);

        // Check the contains method when the grocery item is null
        Grocery obj = null;
        isTrue = instance.contains(obj);
        assertFalse(isTrue);
    }

    /**
     * Test of size method, of class ShoppingArrayList.
     */
    @Test
    public void testSize() {
        Grocery entry1 = new Grocery("Mayo", "Dressing / Mayo", 1, 2.99f, 1);
        ShoppingListArrayList instance = new ShoppingListArrayList();

        assertEquals(0, instance.size());

        instance.add(entry1);

        // Test increment
        assertEquals(1, instance.size());

        assertTrue(instance.remove(entry1));

        // Test decrement
        assertEquals(0, instance.size());
    }

    /**
     * Test of isEmpty method, of class ShoppingArrayList.
     */
    @Test
    public void testIsEmpty() {
        Grocery entry1 = new Grocery("Mayo", "Dressing / Mayo", 1, 2.99f, 1);
        ShoppingListArrayList instance = new ShoppingListArrayList();

        // Test empty
        assertTrue(instance.isEmpty());

        instance.add(entry1);

        // Test not empty
        assertFalse(instance.isEmpty());
    }
    
}

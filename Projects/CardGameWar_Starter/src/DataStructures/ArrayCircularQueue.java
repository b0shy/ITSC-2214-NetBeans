package DataStructures;


import Exceptions.EmptyCollectionException;
import ADTs.QueueADT;


/**
 * An array-based QueueADT.
 * ArrayCircularQueue which implement QueueADT
 * Use an array as the Queue container, and use the
 * variable size to represent the total number of elements
 * in the queue.
 * In the array, new data element will always be stored in 
 * the end of queue,
 * which is represented in the index of (front + size) % 
 * array length.
 *
 * @author ITSC 2214
 * @version 1.0
 * @param <E> 
 */
public class ArrayCircularQueue<E> implements QueueADT<E> {
    /** Default capacity in this QueueADT. */
    private final static int DEFAULT_CAPACITY = 10;
    
    /** Array of items in this QueueADT. */
    private E[] data;

    /* front: the beginning of the queue */
    private SinglyLinkedNode<E> front;
    
    /* rear: the end of the queue */
    private SinglyLinkedNode<E> rear;
    
    /* size: the number of elements in the queue */
    private int size;

    /** The QueueADT is initialized to be empty. */
    @SuppressWarnings("unchecked")
    public ArrayCircularQueue() {
        //TODO Instantiate the array-based data collection
        // with the default capacity constant, DEFAULT_CAPACITY
        data = (E[])new Object[DEFAULT_CAPACITY];
        size = 0;
        front = null;
        rear = null;

    }

    /**
     * Insert an element in the end of the queue
     * @param target input element
     */
    @Override
    public void enqueue(E target) {
        /** TODO if queue is full, expand capacity the 
         * array-based data collection,
         *  for example, doubling its size and copying 
         * the original data items into the new expanded array.
         * Then insert a new data item with reference to 
         * the input target into the queue
         * Do not forget to change the size
        **/
        SinglyLinkedNode<E> node = new SinglyLinkedNode<E>(target);
        
        if (isEmpty())
            front = node;
        else
            rear.setNext(node);
        rear = node;
        size++;

        


    }

    /**
     * Remove from the beginning of the queue
     * @return the removed element
     * @throws EmptyCollectionException 
     */
    @Override
    public E dequeue() throws EmptyCollectionException {
        /** TODO if queue is empty, throw an exception.
        * Then remove the data item from the queue, which 
        * corresponds to save element at the front index 
        * to a variable, named result,
        * and move the front to its next index in circular 
        * array.
        * 
        * Do not forget to change the size
        * Return the variable result.
        **/
        if (isEmpty())
            throw new EmptyCollectionException("queue");

        E result = front.getElement();
        front = front.getNext();
        size--;

        if (isEmpty())
            rear = null;

        return result;
        


    }

    /** Double the length of data. */
    @SuppressWarnings("unchecked")
    protected void expandCapacity() {
        E[] newData = (E[])(new Object[data.length * 2]); // Warning
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    /**
     * Examine whether the queue is empty
     * @return true: if the queue is empty
     *         false: if the queue is not empty
     */
    @Override
    public boolean isEmpty() {
        //TODO Evaluate whether the queue is empty
        return (size == 0);

    }

     /**
     * Examine whether the queue array is full
     * @return Return true if data is full, 
     *         or else false
     */
    protected boolean isFull() {
        //TODO Evaluate whether the queue is full
        return (size == data.length);

    }
    
    /**
     * Retrieve the first
     * @return the element in the beginning of the queue
     * @throws EmptyCollectionException 
     */
    @Override
    public E first() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException(
                    "Remove item from empty queue");
        }

        /**TODO return element in the frontmost position of the array **/
        if (isEmpty())
            throw new EmptyCollectionException("queue"); 

        return front.getElement();

        
    }

    /**
     * Retrieve the size
     * @return number of elements in the queue
     */
    @Override
    public int size() {
        //TODO return the size of the Queue
        return size;

    }
}
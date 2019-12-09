package hz222bp_assign2;

import java.util.Iterator;

/**
 * <h1>Queue</h1>
 * This is an interface for all <code>IntQueue</code> implementations.
 * A Queue is a FIFO (first in, first out) data structure. An
 * interface representing a simple integer queue. This interface defines the
 * required functionality for all <code>IntQueue</code> implementations. It
 * provides support for accessing (enqueue, dequeue, get) in the queue. It also
 * contains basic support for sequential access of the whole content (i.e.,
 * iterators). It is download from mymoodle.
 * <p>
 * 
 * @author Teacher
 * @since 2018-02-01
 */
public interface Queue {
	/**@return number of integers currently stored in the queue. */
	public int size();

	/**
	 * @return {@code true} if this queue is empty; {@code false} otherwise.
	 */
	public boolean isEmpty();

	/**
	 * @param element
	 * The <code>element</code> the generic type of an item in this queue.
	 * 
	 */
	public void enqueue(Object element);

    /**
     * @return the first one of the queue and remove it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
	public Object dequeue();

	/**
	 * @return the first element of the queue.     
	 */
	public Object first();

	/** @return  which is the last in the queue. */
	public Object last(); 

	/**
	 * Returns a string representation of the current queue content. For example, a
	 * string of like "[ 7, 60, -9, 110 ... ]".
	 * 
	 * @return string representation of the content.
	 */
	public String toString(); 

	/**
	 * @return an iterator that iterates over the items in this queue in FIFO order
	 */
	public Iterator<Object> iterator();}
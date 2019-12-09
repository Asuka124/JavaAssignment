package hz222bp_assign4.Queue;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Iterator;
import java.util.NoSuchElementException;

/*Assignment 4; Exercise 1
 *Hailing Zhang(hz222bp) 
 *2018-08-03*/
public class QueueTest {
	LinkedQueue<Integer> lqi = new LinkedQueue<Integer>();
	LinkedQueue<String> lqs = new LinkedQueue<String>();

	@After
	public void tearDown() {
	}

	@Test
	public void testSize() {
		assertEquals(0, lqi.size());
		assertEquals(0, lqs.size());
	}

	@Test
	public void testisEmpty() {
		assertTrue(lqi.isEmpty());
		lqi.enqueue(1);
		assertTrue(!lqi.isEmpty());

		assertTrue(lqs.isEmpty());
		lqs.enqueue("1");
		assertTrue(!lqs.isEmpty());
	}

	@Test
	public void testEnqueue() {
		lqi.enqueue(61);
		lqi.enqueue(1);
		lqi.enqueue(0);
		lqi.enqueue(-1);
		assertEquals(4, lqi.size());

		lqs.enqueue("hi");
		lqs.enqueue("Z");
		lqs.enqueue("å");
		assertEquals(3, lqs.size());
	}

	@Test
	public void testDequeue() {
		lqi.enqueue(3);
		int x = lqi.dequeue();
		assertEquals(3, x);

		lqs.enqueue("generic");
		String y = lqs.dequeue();
		assertEquals("generic", y);
	}

	@Test
	public void testException() {
		try {
			lqi.dequeue();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testFirst() {
		lqi.enqueue(-9);
		lqi.enqueue(0);
		assertEquals(-9, (int) lqi.first());

		lqs.enqueue("queue");
		lqs.enqueue("list");
		assertEquals("queue", lqs.first());
	}

	@Test
	public void testLast() {
		lqi.enqueue(-9);
		lqi.enqueue(0);
		assertEquals(0, (int) lqi.last());

		lqs.enqueue("queue");
		lqs.enqueue("list");
		assertEquals("list", lqs.last());
	}

	@Test
	public void testToString() {
		lqi.enqueue(0);
		lqi.enqueue(-7);
		lqi.enqueue(19);
		lqi.enqueue(6);

		lqi.dequeue();
		lqi.dequeue();
		lqi.enqueue(0);

		assertEquals("[ 19 6 0 ]", lqi.toString());

		lqs.enqueue("a");
		lqs.enqueue("b");
		lqs.dequeue();
		lqs.enqueue("x");
		lqs.enqueue("y");
		lqs.dequeue();

		assertEquals("[ x y ]", lqs.toString());
	}

	@Test
	public void testIterator() {
		lqi.enqueue(2);
		lqi.enqueue(4);
		lqi.enqueue(22);
		lqi.enqueue(22);
		lqi.dequeue();
		lqi.dequeue();
		lqi.enqueue(0);

		Iterator<Integer> itri = lqi.iterator();
		assertTrue(itri.hasNext());

		lqs.enqueue("a");
		lqs.enqueue("b");
		lqs.enqueue("x");
		lqs.enqueue("y");
		lqs.dequeue();
		lqs.enqueue("i");
		lqs.dequeue();
		lqs.enqueue("f");

		Iterator<String> itrs = lqs.iterator();
		assertTrue(itrs.hasNext());
	}
}

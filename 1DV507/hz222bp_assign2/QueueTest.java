package hz222bp_assign2;
/**
 * Assignment 2; Exercise 3 and Exercise 4 (VG Task)
 * 
 * @author Hailing Zhang(hz222bp)
 * @since 2018-02-05
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import java.util.NoSuchElementException;
public class QueueTest {
	LinkedQueue que= new LinkedQueue();
	ArrayQueue arr=new ArrayQueue();
	
	@Test
	public void testSize() {
		assertEquals(0, que.size());
		assertEquals(0, arr.size());
	}

	@Test
	public void testisEmptyandEnqueue() {
		assertTrue(que.isEmpty());
		assertEquals(que.size(), 0);
		que.enqueue(0);//test enqueue
		assertTrue(!que.isEmpty());

		assertTrue(arr.isEmpty());
		assertEquals(arr.size(), 0);
		arr.enqueue(0);//test enqueue
		assertTrue(!arr.isEmpty());
	}

	@Test
	public void testDequeue() {
		que.enqueue(8); // test dequeue
		que.enqueue(7);
		assertEquals(que.dequeue(), 8);
		
		arr.enqueue(8); // test dequeue
		que.enqueue(7);
		assertEquals(arr.dequeue(), 8);
	}

	@Test
	public void testFirst() {
		que.enqueue(1);
		que.enqueue(7);
		assertEquals(1, que.first());
		
		arr.enqueue(1);
		arr.enqueue(7);
		assertEquals(1, arr.first());
	}

	@Test
	public void testLast() {
		que.enqueue(7);
		que.enqueue(13);
		que.dequeue();
		que.enqueue(42);
		assertEquals(que.last(), 42);
		
		arr.enqueue(7);
		arr.enqueue(13);
		arr.dequeue();
		arr.enqueue(42);
		assertEquals(arr.last(), 42);
	}

	@Test
	public void testtoString() {
		que.enqueue(-1);
		que.enqueue(2);
		que.enqueue(99);
		que.dequeue();
		assertEquals("[ 2 99 ]", que.toString());
		
		arr.enqueue(-1);
		arr.enqueue(2);
		arr.enqueue(99);
		arr.dequeue();
		assertEquals("[ 2 99 ]", arr.toString());
	}

	@Test
	public void testEmptyqueue() {
		assertTrue(que.isEmpty());
		Throwable exception = assertThrows(NoSuchElementException.class, () -> {
			que.dequeue();
		});
		
		assertTrue(que.isEmpty());
		Throwable exception1 = assertThrows(NoSuchElementException.class, () -> {
			arr.dequeue();
		});
	}
	
	/*
	 * @Test public void testIterator() {
	 * 
	 * }
	 */
}

package hz222bp_assign4.Binary;

import static org.junit.Assert.*;
import org.junit.Test;
/*Assignment 4; Exercise 5
 *Hailing Zhang(hz222bp) 
 *2018-08-03*/
//I will practice @BeforeEach later for simplifying the layout
public class BinaryIntHeapTest {	
	@Test
	public void testInsert() {
		BinaryIntHeap bi = new BinaryIntHeap();
		//bi.insert(-1);
		for (int i = 0; i < 8; i++) {
			bi.insert(i);
		}
		assertEquals("[9, 8, 4, 5, 7, 0, 3, -1, 2, 1, 6]", bi.toString());
	}

	@Test
	public void testPullHighest() {
		BinaryIntHeap bi = new BinaryIntHeap();
		for (int i = 0; i < 10; i++) {
			bi.insert(i);
		}
		assertEquals(9,bi.pullHighest());//Remove the root
		assertEquals("[8, 7, 5, 6, 2, 1, 4, 0, 3]", bi.toString());
		
		for (int i = 0; i < 8; i++) {
			bi.pullHighest();
		}
		assertEquals("[0]", bi.toString());
	}
	
	@Test(expected = IllegalArgumentException.class)//Test the exception of illegal operator of pull
	public void testIllegalArgumentException() {
		BinaryIntHeap bi = new BinaryIntHeap();
		bi.pullHighest();
	}
	
	@Test
	public void testSize() {
		BinaryIntHeap bi = new BinaryIntHeap();
		assertEquals(0, bi.size());
		
		for (int i = 0; i < 100; i++) {
			bi.insert(i);
			assertEquals(i + 1, bi.size());
		}
		assertEquals(100, bi.size());
	}
	
	@Test
	public void testIsEmpty() {
		BinaryIntHeap bi = new BinaryIntHeap();
		assertEquals(true, bi.isEmpty());
		
		bi.insert(1);
		assertEquals(false, bi.isEmpty());
		
		bi.pullHighest();//Remove 1
		assertEquals(true, bi.isEmpty());
	}

	@Test
	public void testToString() {
		BinaryIntHeap bi1 = new BinaryIntHeap();
		assertEquals(0, bi1.size());
		assertEquals("[]", bi1.toString());
		
		/*BinaryIntHeap bi2 = new BinaryIntHeap(); //Tested in the first menthod
		for (int i = 0; i < 10; i++) {
			bi2.insert(i);
		}
		assertEquals("[9, 8, 5, 6, 7, 1, 4, 0, 3, 2]", bi.toString());*/
	}
}
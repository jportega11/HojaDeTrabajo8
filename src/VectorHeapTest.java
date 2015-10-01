import static org.junit.Assert.*;
import java.util.Vector;


import org.junit.Test;


public class VectorHeapTest {

	@Test
	public void testRemove() {
		Vector<Integer> i = new Vector<Integer>();
		i.add(4);
		i.add(1);
		i.add(9);
		i.add(8);
		VectorHeap<Integer> v = new VectorHeap<Integer>(i);
		if((!v.remove().toString().equals("1"))){
			fail();
		}
	}

}

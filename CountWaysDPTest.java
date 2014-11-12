/**
 * 
 */
package CountWays;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author congliu
 *
 */
public class CountWaysDPTest {
    CountWaysDP instance = new CountWaysDP();
	@Test
	public void test() {
	    assertEquals(0, instance.fibonacci(0));
		assertEquals(1, instance.fibonacci(1));
		assertEquals(1, instance.fibonacci(2));
		assertEquals(2, instance.fibonacci(3));
		assertEquals(3, instance.fibonacci(4));
		assertEquals(5, instance.fibonacci(5));
		assertEquals(8, instance.fibonacci(6));
		assertEquals(13, instance.fibonacci(7));
		assertEquals(21, instance.fibonacci(8));
		assertEquals(34, instance.fibonacci(9));
	}

}

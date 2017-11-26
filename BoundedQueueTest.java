package ISITest;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class BoundedQueueTest {

	BoundedQueue queuePrueba = new BoundedQueue(2);

	@Before public void setUp()         // set up test fixture
	{      
	   queuePrueba.enQueue ("cat");
	   queuePrueba.enQueue ("dog");
	}
	
	@Test public void testenQueue_C1()
	{
		BoundedQueue queuePrueba = new BoundedQueue(2);
		queuePrueba.enQueue ("cat");
	}

	@Test(expected=IllegalStateException.class)
	public void testenQueue_C2()
	{
		queuePrueba.enQueue ("cat");
	}
	
	@Test(expected=NullPointerException.class)
	public void testenQueue_C3()
	{
		BoundedQueue queuePrueba = new BoundedQueue(2);
		queuePrueba.enQueue (null);
	}
	
	@Test public void testdeQueue_C4()
	{
		queuePrueba.deQueue ();
	}
	
	@Test(expected=IllegalStateException.class)
	public void testenQueue_C5()
	{
		BoundedQueue queuePrueba = new BoundedQueue(2);
		queuePrueba.deQueue ();
	}

}


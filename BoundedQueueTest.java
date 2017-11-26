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
	
	@Test public void testenQueue_BaseCase()
	{
		BoundedQueue queuePrueba = new BoundedQueue(2);
		queuePrueba.enQueue ("cat");
	}

	@Test(expected=IllegalStateException.class)
	public void testenQueue_C1()
	{
		queuePrueba.enQueue ("cat");
	}
	
	@Test(expected=NullPointerException.class)
	public void testenQueue_C2()
	{
		BoundedQueue queuePrueba = new BoundedQueue(2);
		queuePrueba.enQueue (null);
	}

}

import static org.junit.Assert.*;
import org.junit.*;

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
	
	@Test()
	public void testIsEmpty_BaseCase()
	{
		BoundedQueue queuePrueba = new BoundedQueue(2);
		assertTrue (queuePrueba.isEmpty());
	}
	
	@Test()
	public void testIsEmpty_C6()
	{
		assertFalse (queuePrueba.isEmpty());
	}
	
	@Test()
	public void testIsFull_BaseCase()
	{
		assertTrue (queuePrueba.isFull());
	}
	
	@Test()
	public void testIsFull_C7()
	{
		BoundedQueue queuePrueba = new BoundedQueue(2);
		assertFalse (queuePrueba.isFull());
	}
}


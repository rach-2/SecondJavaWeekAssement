import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OfflineExciseTest {

	
	
	OflineExciises excises = null;
	
	@Before
	public void setUp() 
	{
		excises = new OflineExciises();
	}

	@Test
	public void testDobuleChar() {
		
		
		assertEquals("TThhee",excises.doubleChar("The"));
	}
	
	@Test
	public void testgetSwicwhich()
	{
		assertEquals("jam", excises.getSandwich("breadjambread"));
	}
	
	@Test 
	public void testEvenSpaced()
	{
		assertEquals(true, excises.evenlySpaced(3, 6,9));
	}
	
	@Test
	public void testNtwice()
	{
		assertEquals("helo", excises.nTwice("hello", 2));
	

   }
	@Test
   public void testEndsly()
   {
		assertEquals(true,excises.endsly("oddly"));
		
   }
	
	public void stringClean()
	{
		assertEquals("yza",excises..stringClean("yyzzza"));
	}
		
}

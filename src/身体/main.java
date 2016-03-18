package …ÌÃÂ;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class main {
	public tri t;
	@Before
	public void create(){
		t = new tri();
	}
	
	@Test
	public void Test(){
		t = new tri(1,1,1);
		assertEquals("equilateral",t.judgement());
		t = new tri(1,2,2);
		assertEquals("isosceles",t.judgement());
		t = new tri(2,1,2);
		assertEquals("isosceles",t.judgement());
		t = new tri(1,2,3);
		assertEquals("Not a triangle",t.judgement());
		t = new tri(3,4,5);
		assertEquals("scalene",t.judgement());
		
	}
}

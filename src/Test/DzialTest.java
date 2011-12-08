package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import MPR_Project_8195.Dzial;

public class DzialTest {
  
	Dzial d=new Dzial(1, "Marketing");
	
	@Test
	public void testDzial() {
		assertFalse(d.getID_dzial().equals(3));
		assertEquals(d.getNazwa(), "Marketing");
		assertTrue(d.getNazwa().equals("Marketing"));
	}

	@Test
	public void testGetNazwa() {
		assertEquals(d.getNazwa(), "Marketing");
	}

	@Test
	public void testSetNazwa() {
	d.setNazwa("nMarketing");
     assertFalse(d.getNazwa().equals("nazwa"));	
	}

	@Test
	public void testGetID_dzial() {
		assertEquals(d.getNazwa(), "Marketing");	
	}

	@Test
	public void testSetID_dzial() {
		d.setID_dzial(1);
        assertFalse(d.getID_dzial().equals(3));
	}

	@Test
	public void testToString() {
		//fail("Not yet implemented");
	}

}

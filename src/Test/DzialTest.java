package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import MPR_Project_8195.Dzial;

public class DzialTest {

	Dzial dzial;
	
	@Before
	public void setUp() throws Exception {
		this.dzial = new Dzial(1, "Marketing");
	}

	@Test
	public void testGetNazwa() {
		assertEquals("Marketing", dzial.getNazwa());
	}

	@Test
	public void testSetNazwa() {
		dzial.setNazwa("nMarketing");
		assertEquals("nMarketing", dzial.getNazwa());
	}

	@Test
	public void testGetID_dzial() {
		assertEquals(new Integer(1), dzial.getID_dzial());
	}

	@Test
	public void testSetID_dzial() {
		dzial.setID_dzial(2);
		assertEquals(new Integer(2), dzial.getID_dzial());
	}

	@Test
	public void testToString() {
		//assertEquals("ID działu: 1. Nazwa: Marketing", dzial.toString());
	}

}

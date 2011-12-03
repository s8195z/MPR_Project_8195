package MPR_Project_8195;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FirmaTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testsearchPracownikByPhrase() {
	// fail("Not yet implemented");

	Firma f=new Firma ("x");

	f.addPracownik(new Pracownik("Adam", "Kowalski", 1, 3, 4));
	assertNotNull(f.getPracownicy());

	}

}

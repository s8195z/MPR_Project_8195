package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import MPR_Project_8195.Pracownik;

public class PracownikTest {
	Pracownik p =new Pracownik ("Adam", "Poniedzia쿮k", 1, 689, 54);
    //static Pracownik p1 =new Pracownik ("Ewa", "Wieczorek", 2, 444, 50);
 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {	
	//Pracownik p =new Pracownik ("imie", "nazwisko", 1, 689, 54);
	//System.out.println("[" + p + "] @Before setUp()");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	//System.out.println("[" + p1 + "] @After tearDown()");
	}

	@Before
	public void setUp() throws Exception {
	//System.out.println("@BeforeClass setUpClass()");
	}
	
	@After
	public void tearDown() throws Exception {
	//System.out.println("@AfterClass tearDownClass()");
	}

	@Test
	public void testPracownik() {				
		assertNotNull(p);
		assertTrue(p.getImie().equals("Adam"));
		assertEquals(p.getNazwisko(), "Poniedzia쿮k");
		assertTrue(p.getNazwisko().equals("Poniedzia쿮k"));
		//System.out.println("[" + p + "] @testPracownik()");
	}

	@Test
	public void testGetImie() {
		assertSame(p.getImie(), "Adam");
	}

	@Test
	public void testSetImie() {

		p.setImie("Adam");
		assertNotSame("Adam", "Ewa", p.getImie());
		assertFalse(p.getImie()=="Ewa");
		assertEquals("Adam", p.getImie());
	}

	@Test
	public void testGetNazwisko() {		
		assertSame(p.getNazwisko(), "Poniedzia쿮k");
	}

	@Test
	public void testSetNazwisko() {
		p.setNazwisko("Nowak");
		assertNotSame("Nowak", "Kowalski", p.getNazwisko());
		assertFalse(p.getNazwisko()=="Kowalski");
		assertEquals("Nowak", p.getNazwisko());
	}

	@Test
	public void testGetID() {
		assertSame(p.getID(), 1);
	}

	@Test
	public void testSetID() {
		p.setID(1);
		assertNotSame("1", "2", p.id);
		assertFalse(p.id==2);
		assertEquals(1, p.id);
	}

	@Test
	public void testGetWynagrodzenie() {
		assertNotSame(p.getWynagrodzenie(), 986);
	}

	@Test
	public void testSetWynagrodzenie() {
		   p.setWynagrodzenie(986);
			 assertNotSame("986", "543", p.getWynagrodzenie());
		 	 assertFalse(p.getWynagrodzenie()==543);
	}

	@Test
	public void testToString() {	
	}

}

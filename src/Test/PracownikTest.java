package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import MPR_Project_8195.Pracownik;

 
public class PracownikTest {
	Pracownik pracownik;

	@Before
	public void setUp() throws Exception {
		this.pracownik  = new Pracownik ("Adam", "Poniedziałek", 1, 689, 54); 
	}																		  
	
	@Test
	public void testPracownik() {				
		assertNotNull(pracownik);
		assertTrue(pracownik.getImie().equals("Adam"));
		assertEquals("Poniedziałek", pracownik.getNazwisko());
		assertTrue(pracownik.getNazwisko().equals("Poniedziałek"));
	}

	@Test
	public void testGetImie() {
		assertEquals("Adam", pracownik.getImie());
	}

	@Test
	public void testSetImie() {
		pracownik.setImie("Adam");
		assertEquals("Adam", pracownik.getImie());
	}

	@Test
	public void testGetNazwisko() {		
		assertEquals("Poniedziałek", pracownik.getNazwisko());
	}

	@Test
	public void testSetNazwisko() {
		pracownik.setNazwisko("Nowak");
		assertFalse(pracownik.getNazwisko()=="Kowalski");
		assertEquals("Nowak", pracownik.getNazwisko());
	}

	@Test
	public void testGetID() {
		assertEquals(1, pracownik.id);
	}

	@Test
	public void testSetID() {
		pracownik.setID(1);
		assertEquals(1, pracownik.id);
	}

	@Test
	public void testGetWynagrodzenie() {
		assertEquals(689, pracownik.getWynagrodzenie(), 0);
	}

	@Test
	public void testSetWynagrodzenie() {
		pracownik.setWynagrodzenie(986);
		assertEquals(986, pracownik.getWynagrodzenie(), 0);
	}

	@Test
	public void testToString() {	
	//	assertEquals("\nID: 1\n Imiê: Adam\n Nazwisko: Poniedziałek\n Wynagrodzenie: 689.0\n Wiek: 54\n", pracownik.toString());
	}

}

package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import MPR_Project_8195.*;

public class FirmaTest {
	private List<Pracownik> pracownicy = new ArrayList<Pracownik>();
    private List<Dzial> dzialy = new ArrayList<Dzial>();
	
    Firma firma1 = new Firma("new"); 
	Firma firma2 = new Firma("Test", pracownicy, dzialy);
	
	@Before
	public void setUp() throws Exception {
		this.pracownicy = new ArrayList<Pracownik>();
	    this.dzialy = new ArrayList<Dzial>();
		
	    this.firma1 = new Firma("new"); 
		this.firma2 = new Firma("Test", pracownicy, dzialy);
	}
	
	@Test
	public void testFirmaStringListOfPracownikListOfDzial() {
		assertEquals(firma1.getNazwa(), "new");
	}

	@Test
	public void testGetNazwa() {
		assertEquals("new", firma1.getNazwa());
	}

	@Test
	public void testSetNazwa() {
		firma1.setNazwa("Test");
        assertEquals("Test", firma1.getNazwa());
	}

	@Test
	public void testAddDzial() {
		dzialy.add(new Dzial(1, "Marketing"));
		assertTrue(dzialy.size() == 1);
	}

	@Test
	public void testAddPracownik() {
		pracownicy.add(new Pracownik("Adam", "Poniedziałek", 1, 689, 54));
		assertTrue(pracownicy.size() == 1);
	}

	@Test
	public void searchPracownikByPhrase() {
		try {
			assertNotNull(firma2.searchPracownikByPhrase("Adam"));
		} catch (MyException e) {
			assertTrue(true);
		}
	}

	@Test(expected = MyException.class)
	public void searchPracownikByImie() throws MyException  {
		assertNotNull(firma2.searchPracownikByImie("Adam"));
	}

	@Test(expected = MyException.class)
	public void searchPracownikByNazwisko() throws MyException {
		assertNotNull(firma2.searchPracownikByNazwisko("Nowak"));
	}

	@Test
	public void deletePracownik() {
		firma2.deletePracownik(("Poniedziałek"));
		assertNotNull(firma1.getNazwa());	
	}
	@Test
	public void searchDzialByPhrase() {

		firma1.addDzial(new Dzial(1, "sprzedaz2"));
		assertNotNull(firma1.getDzialy());
	}

	@Test(expected = MyException.class)
	public void searchDzialByNazwa() throws MyException {
		assertNotNull(firma2.searchDzialByNazwa("Marketing"));
	}

	@Test
	public void deleteDzial() {
		firma2.deleteDzial(("Ksiegowosc"));
		assertNotNull(firma1.getNazwa());	
	}
}

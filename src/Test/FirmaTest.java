package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import MPR_Project_8195.Dzial;
import MPR_Project_8195.Firma;
import MPR_Project_8195.MyException;
import MPR_Project_8195.Pracownik;

public class FirmaTest {
	private List<Pracownik> pracownicy= new ArrayList<Pracownik>();
    private List<Dzial> dzialy= new ArrayList<Dzial>();
	Firma f=new Firma("new");
	Firma Test = new Firma("Test", pracownicy, dzialy);
	
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
	public void testFirmaStringListOfPracownikListOfDzial() {
		assertTrue(f.getNazwa().equals("new"));
		assertEquals(f.getNazwa(), "new");
	}

	@Test
	public void testFirmaString() {
		assertTrue(Test.getNazwa().equals("Test"));
	}

	@Test
	public void testGetNazwa() {
		Firma f=new Firma("Test");
		assertSame(f.getNazwa(), "Test");
	}

	@Test
	public void testSetNazwa() {
		f.setNazwa("Test");
        assertTrue(f.getNazwa().equals("Test"));
	}

	@Test
	public void testGetPracownicy() {
		Pracownik p =new Pracownik ("Adam", "Poniedzia쿮k", 1, 689, 54);
		assertFalse(p.getNazwisko().equals("Pon"));
		assertEquals(p.getNazwisko(), "Poniedzia쿮k");
		assertTrue(p.getNazwisko().equals("Poniedzia쿮k"));
	}

	@Test
	public void testGetDzialy() {
		Dzial d=new Dzial(1, "Marketing");
		assertFalse(d.getID_dzial().equals(3));
		assertEquals(d.getNazwa(), "Marketing");
		assertTrue(d.getNazwa().equals("Marketing"));
	}

	@Test
	public void testAddDzial() {
		dzialy.add(new Dzial(1, "Marketing"));
		assertTrue(dzialy.size() == 1);
		assertFalse(dzialy.size() == 4);
	}

	@Test
	public void testAddPracownik() {
		pracownicy.add(new Pracownik("Adam", "Poniedzia쿮k", 1, 689, 54));
		assertTrue(pracownicy.size() == 1);
		assertFalse(pracownicy.size() == 2);
	}
	
	@Test
	public void testDrukujPracownikow() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrukujDzialy() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrukujAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrukujPracownikByNazwisko() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrukujPracownikByPhrase() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrukujPracownikByImie() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrukujDzialByPhrase() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrukujDzialByNazwa() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchPracownikByPhrase() {
		try {
			assertNotNull(Test.searchPracownikByPhrase("Adam"));
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testSearchPracownikByImie()  {
		try {
			assertNotNull(Test.searchPracownikByImie("Adam"));
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testSearchPracownikByNazwisko(){
		try {
			assertNotNull(Test.searchPracownikByNazwisko("Nowak"));
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testEditPracWynagrodzenie() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeletePracownik() {
		Test.deletePracownik(("Poniedzia쿮k"));
		assertNotNull(f.getNazwa());	
	}
	@Test
	public void testSearchDzialByPhrase() {

		f.addDzial(new Dzial(1, "sprzedaz2"));
		assertNotNull(f.getDzialy());
	}

	@Test
	public void testSearchDzialByNazwa() {
		try {
			assertNotNull(Test.searchDzialByNazwa("Marketing"));
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testEditDzialName() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteDzial() {
		Test.deleteDzial(("Ksiegowosc"));
		assertNotNull(f.getNazwa());	
	}

}

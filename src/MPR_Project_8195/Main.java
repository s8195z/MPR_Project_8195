package MPR_Project_8195;

public class Main {

public static void main(String[] args) throws Exception {
  
	  Firma firma= new Firma("KRZAK");

      firma.addPracownik(new Pracownik("Adam","Poniedzialek", 1, 689, 54));
      firma.addPracownik(new Pracownik("Ewa","Nowak", 2, 2700, 39));
      firma.addPracownik(new Pracownik("Jacek","Jutro", 3, 928,  34));
      firma.addPracownik(new Pracownik("Jacek","Wczoraj", 4, 928,  34));
      firma.addPracownik(new Pracownik("Wacek","Testowy", 5, 928,  34));

     firma.addDzial(new Dzial(1,"Ksiegowosc"));
     firma.addDzial(new Dzial(2, "Marketing"));
      firma.addDzial(new Dzial(3, "Sprzedaz"));
      firma.addDzial(new Dzial(4, "Dlatestowsprzedaz"));
          
      
      /* Testowanie dzialow */
      
      
      //firma.drukujDzialy();
      //firma.drukujDzialByNazwa("Marketing"); //istnieje
      //firma.deleteDzial("Marketing");
      //firma.drukujDzialByNazwa("Marketing"); //nie istnieje
      //firma.drukujDzialByPhrase("daz");
      //firma.editDzialName("Dlatestowsprzedaz", "Administracja");
      //firma.drukujDzialy();
      
      
      /* Testowanie pracownikow */
      
      firma.drukujPracownikow();
      //firma.drukujPracownikByImie("Jacek");
      //firma.drukujPracownikByPhrase("cek");
      //firma.drukujPracownikByNazwisko("Testowy");
      //firma.deletePracownik("Testowy");
     //firma.drukujPracownikByNazwisko("Testowy");
      //firma.editPracWynagrodzenie("Testowy", 22.0);
      //firma.drukujPracownikByNazwisko("Testowy");
      
      
   }
 }
      
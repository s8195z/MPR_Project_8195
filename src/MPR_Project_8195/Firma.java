
   package MPR_Project_8195;

    import java.util.ArrayList;
    import java.util.List;


    public class Firma {

    	private String nazwa; 

         private List<Pracownik> pracownicy= new ArrayList<Pracownik>();
         private List<Dzial> dzialy= new ArrayList<Dzial>();
         
         public Firma(String nazwa, List<Pracownik> pracownicy , List<Dzial> dzialy)
          {
                   this.nazwa=nazwa;
                   this.pracownicy=pracownicy;
                   this.dzialy=dzialy; 
          }
        
         public Firma(String nazwa) {
        		super();
        		this.nazwa = nazwa;
        		this.pracownicy = new ArrayList<Pracownik>();
        		this.dzialy = new ArrayList<Dzial>();
        	}

        	public String getNazwa() {
        		return nazwa;
        	}
        	public void setNazwa(String nazwa) {
        		this.nazwa = nazwa; 
        	}
        	
            public List<Pracownik> getPracownicy() {
        		return pracownicy;
        	}
        	
     	
        	public List<Dzial> getDzialy() {
        		return dzialy;
        	}

         
        	public void addDzial(Dzial dzial){
        		dzialy.add(dzial);
        	}

        	public void addPracownik(Pracownik pracownik){
        		pracownicy.add(pracownik);
        	}
        	
          
          
          /* Drukowanie list */
        	
          private void drukujListe(List<?> arr) {
        	  for (Object o : arr) {
        		  System.out.println(o);
        	  }
          }
          
          public void drukujPracownikow () {
        	  System.out.println("Pracownicy: ");
        	  drukujListe(pracownicy);
        	  System.out.println(); 
          }
          
          public void drukujDzialy() {
        	  System.out.println("Dzialy: ");
        	  drukujListe(dzialy);
        	  System.out.println(); 
          }
          
          public void drukujAll () {
        	  drukujDzialy();
        	  drukujPracownikow ();
          }
          
          /* Dzialania na listach */
          
          public void searchPracownikByPhrase (String phrase) {
        	  
        	  System.out.println("Pracownicy z fraza " + phrase + ": ");
        	  
        	  int licznik = 0;
        	  
        	  for (Pracownik p : pracownicy) {
        		  if (p.getImie().toLowerCase().indexOf(phrase.toLowerCase()) != -1
        				  || p.getNazwisko().toLowerCase().indexOf(phrase) != -1) {
        			  
        			  System.out.println(p);
        			  licznik++;
        		  }
        	  }
        	  
        	  if (licznik == 0) System.out.println("Brak pracownika z fraz¹…" + phrase + " w imieniu lub nazwisku.");
          }
          
          public void searchPracownikByImie (String imie) {
        	  
        	  System.out.println("Pracownicy o imieniu " + imie + ": ");
        	  
        	  int licznik = 0;
        	  
        	  for (Pracownik p : pracownicy) {
        		  if (p.getImie() == imie) {
        			  System.out.println(p);
        			  licznik++;
        		  }
        	  }
        	  
        	  if (licznik == 0) System.out.println("Brak pracownika o imieniu" + imie + ".");
          }
          
          public void searchPracownikByNazwisko (String nazwisko) throws MyException {
        	  try {
        		  System.out.println("Pracownik o nazwisku " + nazwisko + ": ");
        		  Pracownik p = getPracRef(nazwisko);
        		  System.out.println(p);
        	  }
        	  catch (MyException e) {
        		  e.drukujBlad();
        	  }
          }
        	
          private Pracownik getPracRef (String nazwisko) throws MyException{
        	  
        	  for (Pracownik p : pracownicy) {
        		  if (p.getNazwisko() == nazwisko) return p;
        	  }
        	  throw new MyException("Pracownik o nazwisku " + nazwisko + " nie pracuje w firmie.");
          }
          
          public void editPracWynagrodzenie (String nazwisko, double wynagrodzenie) {
        	  
        	  try {
        		  Pracownik p = getPracRef(nazwisko);
        		  p.setWynagrodzenie(wynagrodzenie);
        		  System.out.println("Pracownik o nazwisku " + nazwisko + " pomyslnie zedytowany.");
        	  }
        	  catch (MyException e) {
        		  e.drukujBlad();
        	  }
          }
          
          public void deletePracownik (Pracownik p) {
        	  
        	  try {
        		  pracownicy.remove(getPracRef(p.getNazwisko()));
        	  }
        	  catch (Exception e) {
        		  System.out.println("Taki pracownik nie pracuje w firmie.");
        	  }
        	  
          }
 
          /* Dzialania na dzialach */
          
          public void searchDzialByPhrase (String phrase) {
        	  
        	  System.out.println("Dzialy z fraza " + phrase + ": ");
        	  
        	  int licznik = 0;
        	  
        	  for (Dzial d : dzialy) {
        		  if (d.getNazwa().toLowerCase().indexOf(phrase.toLowerCase()) != -1) {
        			  
        			  System.out.println(d);
        			  licznik++;
        		  }
        	  }
        	  
        	  if (licznik == 0) System.out.println("Brak dzialu z frazÄ…" + phrase + " w nazwie.");
          }
          
          public void searchDzialByNazwa (String nazwa) throws MyException {
        	  try {
        		  System.out.println("Dzial o nazwie " + nazwa + ": ");
        		  Dzial d = getDzialRef(nazwa);
        		  System.out.println(d + "\n");
        	  }
        	  catch (MyException e) {
        		  e.drukujBlad();
        	  }
          }
          
          private Dzial getDzialRef (String nazwa) throws MyException {
        	  
        	  for (Dzial d : dzialy) {
        		  if (d.getNazwa() == nazwa) return d;
        	  }
        	  throw new MyException("Dzial o nazwie " + nazwa + " nie istnieje w firmie.");
          }
          
          public void editDzialName (String staraNazwa, String nowaNazwa) {
        	  
        	  try {
        		  Dzial d = getDzialRef(staraNazwa);
        		  d.setNazwa(nowaNazwa);  
        	  }
        	  catch (MyException e) {
        		  e.drukujBlad();
        	  }
          }
          
          public void deleteDzial (Dzial d) {
        	  
        	  try {
        		  dzialy.remove(getDzialRef(d.getNazwa()));
        	  }
        	  catch (Exception e) {
        		  System.out.println("Ten dzial nie funkcjonuje w firmie.");
        	  }
        	  
          }
          
    }


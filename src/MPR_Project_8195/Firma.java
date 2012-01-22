
   package MPR_Project_8195;

    import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

    @Entity
    public class Firma {

    	private String nazwa; 
    
    	@OneToMany(mappedBy="zawiera", cascade=javax.persistence.CascadeType.PERSIST)
    	
         private List<Pracownik> pracownicy= new ArrayList<Pracownik>();
         @OneToMany(mappedBy="zawiera", cascade=javax.persistence.CascadeType.PERSIST)
		
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
        	  System.out.println();
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
          
          public void drukujPracownikByNazwisko (String nazwisko) {
        	  try {
        		System.out.println("Pracownik o nazwisku " + nazwisko + ": ");
				System.out.println(searchPracownikByNazwisko(nazwisko) + "\n");
			} catch (MyException e) {
				e.drukujBlad();
			}
          }
          
          public void drukujPracownikByPhrase (String phrase) {
        	  try {
        		System.out.println("Pracownik z fraza " + phrase + ": ");
        		drukujListe(searchPracownikByPhrase(phrase));
			} catch (MyException e) {
				e.drukujBlad();
			}
          }
          
          public void drukujPracownikByImie (String imie) {
        	  try {
        		System.out.println("Pracownik o imieniu " + imie + ": ");
        		drukujListe(searchPracownikByImie(imie));
			} catch (MyException e) {
				e.drukujBlad();
			}
          }
          

          public void drukujDzialByPhrase(String phrase) {
        	  System.out.println("Dzialy z fraza " + phrase + ": ");
        	  try {
				drukujListe(searchDzialByPhrase(phrase));
			} catch (MyException e) {
				e.drukujBlad();
			}
          }
    	  
          
          public void drukujDzialByNazwa(String nazwa) {
        	  System.out.println("Dzial o nazwie " + nazwa + ": ");
        	  try {
				System.out.println(searchDzialByNazwa(nazwa));
				System.out.println();
			} catch (MyException e) {
				e.drukujBlad();
			}
          }
          
          /* Dzialania na listach */
          
          public ArrayList<Pracownik> searchPracownikByPhrase (String phrase) throws MyException {
        	  
        	  ArrayList<Pracownik> arr = new ArrayList<Pracownik>();
        	  
        	  for (Pracownik p : pracownicy) {
        		  if (p.getImie().toLowerCase().indexOf(phrase.toLowerCase()) != -1
        				  || p.getNazwisko().toLowerCase().indexOf(phrase) != -1) {
        			  
        			  arr.add(p);
        		  }
        	  }

        	  if (arr.isEmpty()) throw new MyException("Brak pracownika z fraz��" + phrase + " w imieniu lub nazwisku.");
        	  else return arr;
          }
          
          public ArrayList<Pracownik> searchPracownikByImie (String imie) throws MyException {
        	  
        	  ArrayList<Pracownik> arr = new  ArrayList<Pracownik>();
        	  
        	  for (Pracownik p : pracownicy) {
        		  if (p.getImie() == imie) {
        			  arr.add(p);
        		  }
        	  }
        	  
        	  if (arr.isEmpty()) throw new MyException("Brak pracownika o imieniu" + imie + ".");
        	  else return arr;
          }
          
          public Pracownik searchPracownikByNazwisko (String nazwisko) throws MyException {
        	  try {
        		  
        		  return getPracRef(nazwisko);
        	  }
        	  catch (MyException e) {
        		  throw e;
        	  }
          }          
        	
          private Pracownik getPracRef (String nazwisko) throws MyException {
        	  
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
          
          public void deletePracownik (String nazwisko) {
        	  
        	  try {
        		  pracownicy.remove(getPracRef(nazwisko));
        	  }
        	  catch (Exception e) {
        		  System.out.println("Pracownik o nazwisku " + nazwisko + " nie pracuje w firmie.");
        	  }
        	  
          }
 
          /* Dzialania na dzialach */
          
          public ArrayList<Dzial> searchDzialByPhrase (String phrase) throws MyException {
        	  
        	  ArrayList<Dzial> arr = new ArrayList<Dzial>();
        	  
        	  for (Dzial d : dzialy) {
        		  if (d.getNazwa().toLowerCase().indexOf(phrase.toLowerCase()) != -1) {
        			  arr.add(d);
        		  }
        	  }
        	  if (arr.isEmpty()) throw new MyException("Brak dzialu z fraz�: " + phrase + " w nazwie.");
        	  else return arr;
          }
          
          public Dzial searchDzialByNazwa (String nazwa) throws MyException {
        	  try {
        		  return getDzialRef(nazwa);
        	  }
        	  catch (MyException e) {
        		  throw e;
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
          
          public void deleteDzial (String nazwa) {
        	  
        	  try {
        		  dzialy.remove(getDzialRef(nazwa));
        	  }
        	  catch (Exception e) {
        		  System.out.println("Dzial o nazwie " + nazwa + " nie funkcjonuje w firmie.");
        	  }
        	  
          }
          
    }


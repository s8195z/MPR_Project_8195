package MPR_Project_8195;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@GeneratedValue

public class Pracownik {
	@Id
	public  int id;
	private String imie;
	private  String nazwisko;
	private  double wynagrodzenie;
	private int wiek;

	
    public Pracownik(String imie, String nazwisko, int id, double wynagrodzenie, int wiek)  
      {
           this.imie=imie;
           this.nazwisko=nazwisko;
           this.id=id;
           this.wynagrodzenie=wynagrodzenie;
           this.wiek=wiek;
     }
    @ManyToOne
      public String getImie(){
          return imie;
       }

      public void setImie(String Imie){
    	   Imie = imie;
      }

      
       
      public String getNazwisko() {
         return this.nazwisko;
      }
      public void setNazwisko(String nazwisko){
         this.nazwisko=nazwisko;
      }
      

  
     public int getID(){
        return this.id;
     }

     public void setID(int id){
        this.id=id;
     }
    
     public int getWiek(){
         return this.wiek;
      }

      public void setWiek(int wiek){
         this.wiek=wiek;
      }
     
 
    public double getWynagrodzenie()
    {
            return this.wynagrodzenie;
}
    public void setWynagrodzenie(double wynagrodzenie){
        this.wynagrodzenie=wynagrodzenie;
    }

    
    @Override
    public String toString () {
    	return "\nID: "+id+"\n Imi�: "+imie+"\n Nazwisko: "+nazwisko+"\n Wynagrodzenie: "+wynagrodzenie+"\n Wiek: "+wiek+"\n ";
    }

}  


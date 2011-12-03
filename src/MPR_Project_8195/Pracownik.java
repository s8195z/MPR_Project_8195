package MPR_Project_8195;

public class Pracownik {

	private  int id;
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
    
    
 
    public double getWynagrodzenie()
    {
            return this.wynagrodzenie;
}
    public void setWynagrodzenie(double wynagrodzenie){
        this.wynagrodzenie=wynagrodzenie;
    }
    
    @Override
    public String toString () {
    	return "\nID: "+id+"\n Imiê: "+imie+"\n Nazwisko: "+nazwisko+"\n Wynagrodzenie: "+wynagrodzenie+"\n Wiek: "+wiek+"\n ";
    }

}  


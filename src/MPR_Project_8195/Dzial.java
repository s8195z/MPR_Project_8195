package MPR_Project_8195;

public class Dzial {
	
	private int ID_dzial;
	private String Nazwa;

	public Dzial(int id_dzial, String nazwa) {
		
		this.ID_dzial = id_dzial;
		this.Nazwa=nazwa;	
	}

	public String getNazwa() {
		return Nazwa;
	}
	
	public void setNazwa(String nazwa) {
		Nazwa = nazwa;
	}


	
	public Integer getID_dzial() {
		return ID_dzial;
	}

	public void setID_dzial(int id_dzial) {
		this.ID_dzial = id_dzial;
		
	}

	//@Override
	public String toString () {
		return "ID dzia³u: " + ID_dzial + ". Nazwa: " + Nazwa;
	}
	
    //zamiast funkcji
	//public void printDzial()
	//{
	//	System.out.println("ID dzaï¿½u: " + ID_dzial +". Nazwa: " +Nazwa);
	//}

   } 
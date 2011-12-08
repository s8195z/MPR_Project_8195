package MPR_Project_8195;

public class MyException extends Exception {

	private static final long serialVersionUID = 1L;
	private String message;

	public MyException(String message) {
		super(message);
		this.message = message;
	}
	
	public void drukujBlad () {
		System.out.println(message);
		System.out.println();
	}

}

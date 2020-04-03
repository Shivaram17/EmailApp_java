package emailapp;

public class EmailApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// creating a new  object 
		Email em1 = new Email("ram", "laxman"); 
		//em1.setAlternateEmail("jsgmail.com");
		//System.out.println(em1.getAlternateEmail());
		System.out.println(em1.showInfo());
	}

}

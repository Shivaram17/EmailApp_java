package emailapp;
// to use Scanner class import it
import java.util.Scanner;
public class Email {
	//using private for encapsulation
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity=500;
	private String alternateEmail;
	private String email;
	private String companySuffix="ramcompany.com";
	// constructor to receive the first and last name
	public Email(String firstName, String lastName) 
	{
		//this is a keyword used as a reference variable to current objects 
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email created;" + this.firstName + " " + this.lastName);
		
		//call a method asking for department return the department
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);
		
		// call a method for generating a password
		
		this.password =randomPassword(5);
		System.out.println("Your password is: " + this.password);
		
		//combine the collected info to get our email id
		this.email= firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		//System.out.print("Your email id is:" + this.email);
	}
	
	
	
	// ask for the department
	private String setDepartment()
	{
		System.out.println("Department number\n 1 for Sales\n 2 for Development\n 3 for Accountings\n 0 for none\n Enter the department");
		// taking input using Scanner class
		Scanner in = new Scanner(System.in);
		
		//The nextInt() method of a Scanner object reads in a string of digits (characters) and converts them into an int type
		
		int depChoice = in.nextInt();
		if (depChoice == 1) {return "Sales";}
		else if (depChoice == 2) {return "development";}
		else if (depChoice == 3) {return "Accounting";}
		else {return "none";}
		
	}
	
	
	// generate a random password
	private String randomPassword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
		// using  char[] instead of string is to keep passwords secure
		char[] password = new char[length];
		for (int i=0; i<length; i++)
		{
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			//System.out.println(rand);
			//System.out.println(passwordSet.charAt(rand));
		}
		return new String(password);
		
	}
	
	// set methods
	
	// set the mailbox capacity
	public void setMailboxCapacity(int capacity)
	{
		this.mailboxCapacity= capacity;
	}
	// Set the alternate email
	public void setAlternateEmail(String altEmail)
	{
		this.alternateEmail=altEmail;
		
	}
	// Change the password
	public void changePassword(String password)
	{
		this.password=password;
	}
	
	
	//get methods
	public int getmailboxCapacity(){return mailboxCapacity;}
	public String getAlternateEmail(){return alternateEmail;}
	public String getPassword(){return password;}
	
	public String showInfo()
	{
		return ("\nDisplay name: " + firstName + "" + lastName +
				"\nCompany Email: " + email +
				"\nMailboxcapacity: " + mailboxCapacity + " mb ");
	}
	
}

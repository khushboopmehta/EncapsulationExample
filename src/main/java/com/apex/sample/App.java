package com.apex.sample;


public class App {
	public static void main(String[] args) {
		// System.out.println( "Hello World!" );
		JobApplication jobApplication1 = new JobApplication(); // 1st classname 2nd object name

		jobApplication1.setFirstName("Ram"); // Assignment of value to object
		jobApplication1.setLastName("K");
		jobApplication1.setYear(1995);
		jobApplication1.display();						//disply method will display everything
		System.out.println("Company Name:"+JobApplication.companyName); //JobAppliction.companyName call by class name bcz its class leve n shared by all so
		
		
		JobApplication jobApplication2=new JobApplication();	//2nd application 
		jobApplication2.setFirstName("Ravan");
		jobApplication2.setLastName("L");
		jobApplication2.setYear(1949);
		jobApplication2.display();

		JobApplication jobApplication3=new JobApplication("Sita","G",1997);	//give direct input here
		jobApplication3.display();					// so define new constructor with input argument in class.
		
	}
}

class JobApplication { // ENCAPSULATION EXAMPLE
	// data
	private String firstName, lastName; // Instance variable
	private int year;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year <= 1960) {
			System.out.println("Error: You are too old to apply.");
		}
		this.year = year;
	}

	// class level varible shared by all objects( starts with STATIC)
	static String companyName = "AMAZON.COM";

	// methods
	// JobApplication is constructor
	JobApplication() { // constructor name must same as class
		firstName = "DEFAULT"; // constructor will initialize data so defalult.
		lastName = "DEFAULT";
		year = 1990;
	}

	JobApplication(String firstName, String lastName, int year) { // for input parameters
		this.firstName = firstName; // THI IS USED
		this.lastName = lastName;
		this.year = year;
	}

	int getAge() { // another constructor
		int currentYear = 2018; // local varible
		int age = currentYear - year;
		return age;
	}

	void display() { // another constructor
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Year of birth : " + year);
		System.out.println("Age: " + getAge());

	}
}
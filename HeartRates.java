import classesAndObjectsIntro.Date;// I can Use maven to handle this dependency
import java.time.LocalDate;

public class HeartRates {
	
	private String firstName;
	private String lastName;
	private Date dob; // this is an Injection// has-a relationship
	private static final short MAX_HEART_RATE_REF = 220;
	
	public HeartRates(String firstName, String lastName, int day, int month, int year){
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = new Date(month, day, year);// poor design?
	}
	
	public void setFirstName(String fname){
		this.firstName = fname;
	}
	
	public void setLastName(String lname){
		this.lastName = lname;
	}
	
	public String getLastName(){
		return this.lastName;
		}
		
	public String getFirstName(){
		return this.firstName;
		}
	
	public Date getDOB(){
		return this.dob;
	}
	
	public int getAge(){
		LocalDate now = LocalDate.now();
		return now.getYear() - dob.getYear();
	}
	
	public int getMaxHeartrate(){
		return MAX_HEART_RATE_REF - getAge(); 
	}
	
}
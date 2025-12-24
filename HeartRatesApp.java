import java.util.Scanner;

public class HeartRatesApp {
    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
		
		HeartRates person = new HeartRates("Laurent", "Wambura", 02, 07, 1997);
		System.out.println();
		System.out.println("Name: " + person.getFirstName() + " " + person.getLastName()); 
		System.out.println("Date of Birth: " + person.getDOB().getMonth() + "/" + person.getDOB().getDay() + "/" + person.getDOB().getYear()); 
		System.out.println("Age: " + person.getAge() + " years"); 
		System.out.println("Max Heart Rate: " + person.getMaxHeartrate() + " bpm"); 
		System.out.println("Target Heart Rate Range: " + person.getTartgetRate().get("min") + " - " + person.getTartgetRate().get("max") + " bpm");
	}
}

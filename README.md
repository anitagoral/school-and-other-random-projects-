# Welcome to My Portfolio!

>All of the work posted on here are examples of work I have done, either for fun or for school. 
>As someone who has been working in the hair industry, I have mastered working with people.  I am confident that I can convince you of my qualifications given the oppertunity for an interview, however I want you to be able to see what I can bring to the table as well.

###Here is an example of my first java program

```Javascript
package commissiondetails;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		double comissionRate, haircutsDone, hoursWorked, hourlyRate,comissionableHaircut;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Comission Rate");
		comissionRate = sc.nextDouble();
		
		System.out.println("Input Number of Haircuts Done");
		haircutsDone = sc.nextDouble();
		
		System.out.println("Input Number of Hours Worked");
		hoursWorked = sc.nextDouble();
		
		System.out.println("Input Hourly Rate");
		hourlyRate = sc.nextDouble();
		
		System.out.println("Input Comissionable Haircut Rate");
		comissionableHaircut = sc.nextDouble();
		
		sc.close();
		
		double comission = comissionableHaircut*comissionRate*haircutsDone;
		double hourlyRate1 = hourlyRate * hoursWorked;
		double rph = comission/hoursWorked;
		
		System.out.println("Comission equals " + comission); 
		System.out.println ("Hourly equals "+ hourlyRate);		
		
		if (hourlyRate1>comission) {
			System.out.println("Hourly rate earned!");
			System.out.println("Rate per hour equals " + hourlyRate);
		}
		
		else {
			System.out.println ("Comission rate earned!");
			System.out.println("Rate per hour equals " + rph);
    
        }
		
	}

}
```

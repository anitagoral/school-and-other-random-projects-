# Welcome to My Portfolio!

>All of the work posted on here are examples of work I have done, either for fun or for school. 
>I have been doing hair for over 10 years and have been developing my skills as a hair designer. Recently I have decided to go back to school to pursue my passion for computer technology. I am looking for a position where I can combine my passion for computers with my past work experience. I love the challenge computer programming gives me. It is my passion to look at a problem and solve that issue via technology. As someone who has been working in the hair industry, I have mastered working with people. and have excellent communication and people skills. I am confident that I can convince you of my qualifications given the opportunity for an interview and I look forward to hearing from you! 

>For more examples of my work please view on Github!

## **Here is an example of my first java program**

> I wanted to create a program that automatcially caluclated your pay for the salon I work at.  The way our paystructue works is that we make either houlry or comission based on which ever is higher.  You have differnt tiers of commission based on your position, and our boss takes a small amount of each haircut.  As you can tell, there are alot of factors that go into figuring out our paychecks, and often times stylists dont know how much they are making each day.  This program allows for stylists to figure out their paycheck simply by imputing the information that might change day by day.  
>
>
>

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


# _Please feel free to reach out to me!_  

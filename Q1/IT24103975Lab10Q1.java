import java.util.Scanner;

	public class IT24103975Lab10Q1 {
		public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
	
	
	System.out.print("Enter the mark(0-100):");
	int mark= scanner.nextInt();

	assert mark >=0 && mark <= 100 : "Invalid Mark";
		
	System.out.println("Mark is validated");

	if(mark>=75){
	System.out.println("The Grade for the Entered Mark is:A");
	}
 	
	else if (mark>=60){
	System.out.println("The Grade for the Entered Mark is :B");
	}
	else if(mark>=50){
	System.out.println("The Grade for the Entered Mark is :C");
	}
	else if(mark>=40){
	System.out.println("The Grade for the Entered Mark is :D");
	}

	assert Grade == ExpectedGrade :" Incorrect Grade Assigned";

	System.out.println("Mark is validated");
	System.out.println("The assigned grade is: " + Grade);

	scanner.close();


    }
}

package StudentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstname;
    private String lastName;
    private String gradeYear;
    private String studentId;
    private String courses="";
    private int tutionBalance;
    private int costOfCourse=600;
    private static int id=1000;
    
    public Student(){
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter first name");
    	this.firstname=sc.nextLine();
    	System.out.println("Enter last name");
    	this.lastName=sc.nextLine();
    	System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
    	this.gradeYear=sc.nextLine();
    	setStudentId();
    }
    
    //generate ID
    private void setStudentId() {
    	//studentId is gradeYear and id
    	id++;
    	this.studentId=gradeYear+id;
    }
    
   //enroll for courses
   public void enroll() {
   do {
    	System.out.print("enter courses to enroll or Q to quit");
        Scanner in=new Scanner(System.in);
        String course=in.nextLine();
        if(!course.equalsIgnoreCase("Q")) {
    	 courses=courses + "\n " +course;
    	 tutionBalance=tutionBalance+costOfCourse;
        }
        else {
        	break;
        }
    } while(1!=0);
   }
   public void viewBalance() {
	   System.out.println("your balance is: $" +tutionBalance);
   }
   public void payTution() {
	   viewBalance();
	   System.out.print("Enter your payment : $");
	   Scanner sc=new Scanner(System.in);
	   int payment=sc.nextInt();
	   tutionBalance=tutionBalance-payment;
	   System.out.println("Thank you for your payment of $"+payment);
	   viewBalance();
   }
   public String toString() {
	   return "Name: "+firstname+" "+lastName
			   +"\nGrade Level: "+gradeYear
			   +"\nStudent ID: "+studentId
			   +"\nCourses Enrolled:"+courses
			   +"\nBalace: $"+tutionBalance;
			   
   }
}

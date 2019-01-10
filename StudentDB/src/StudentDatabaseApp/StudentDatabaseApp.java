package StudentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
    	//ask how many students we want to add
    	System.out.println("enter number of students to enroll");
    	Scanner sc=new Scanner(System.in);
    	int noOfStudents=sc.nextInt();
    	Student[] student=new Student[noOfStudents];
    	//create n number of new students
    	for(int n=0;n<noOfStudents;n++) {
    		student[n]=new Student();
    		student[n].enroll();
    		student[n].payTution();
        	System.out.println(student[n].toString());
    	}
    }
}

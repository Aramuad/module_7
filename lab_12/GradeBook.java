/*	Class:			CSE 1321L
	Section: 		28          
	Term:			FALL  
	Instructor:		AFRIN
	Name:			SAM BALLARD  
	Lab:			12	←		*/

package lab_12;
import java.util.Scanner;
public class GradeBook {
	private int[] classSize;
	private int score;
	
	GradeBook() {
	}
	
	private int[] makeGradeBook(int size) {
		classSize = new int[size];
		return classSize;
	}
	private void assignGrades(int student, int score) {
		classSize[student] = score;
	}
	private int getGrades(int student) {
		return classSize[student];
	}
	public String[] printGrades(int[] grades) {
		String[] phrase = new String[grades.length];
		for(int i = 0; i < grades.length; i++) {
			score = grades[i];
			if(score >= 90 && score <= 100) {
				phrase[i] = "Student " + i + " score is " + score + " and grade is A";
			} else if(score >= 80 && score < 90) {
				phrase[i] = "Student " + i + " score is " + score + " and grade is B";
			} else if(score >= 70 && score < 80) {
				phrase[i] = "Student " + i + " score is " + score + " and grade is C";
			} else if(score >= 60 && score < 70) {
				phrase[i] = "Student " + i + " score is " + score + " and grade is D";
			} else if(score >= 0 && score < 60) {
				phrase[i] = "Student " + i + " score is " + score + " and grade is F";
			} else {
				phrase[i] = "Invalid entry";
			}
		}
		return phrase;
	}
	public static void main(String[] args) {
		GradeBook grades = new GradeBook();
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter the class size: ");
		int kids = sc.nextInt();
		int[] classReportCard = grades.makeGradeBook(kids);
		for(int i = 0; i < classReportCard.length; i++) {
			System.out.print("Enter student " + i + "'s grade: ");
			grades.assignGrades(i, sc.nextInt());
		}
		System.out.println();
		System.out.println("Class size: " + classReportCard.length);
		System.out.print("Entered grades: ");
		for(int i = 0; i < classReportCard.length; i++) {
			System.out.print(grades.getGrades(i) + ", ");
		}
		System.out.println();
		System.out.println();
		for(int i = 0; i < classReportCard.length; i++) {
			System.out.println(grades.printGrades(classReportCard)[i]);
		}
		System.out.println();
		sc.close();
	}

}

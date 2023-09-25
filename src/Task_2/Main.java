package Task_2;
//STUDENT GRADE CALCULATOR

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	
		// Create a Scanner object to read user input
		        Scanner scanner = new Scanner(System.in);

		        // Prompt the user to enter the number of subjects
		        System.out.println("Enter the number of subjects: ");
		        int numberOfSubjects = scanner.nextInt();

		        // Create an array to store the marks obtained in each subject
		        int[] marks = new int[numberOfSubjects];

		        // Prompt the user to enter the marks obtained in each subject
		        for (int i = 0; i < numberOfSubjects; i++) {
		            System.out.println("Enter the marks obtained out of 100 in subject " + (i + 1) + ": ");
		            marks[i] = scanner.nextInt();
		        }

		        // Calculate the total marks
		        int totalMarks = 0;
		        for (int mark : marks) {
		            totalMarks += mark;
		        }

		        // Calculate the average percentage
		        float averagePercentage = (float) totalMarks / numberOfSubjects;

		        // Assign a grade based on the average percentage
		        String grade;
		        if (averagePercentage >= 90) {
		            grade = "A";
		        } else if (averagePercentage >= 80) {
		            grade = "B";
		        } else if (averagePercentage >= 70) {
		            grade = "C";
		        } else if (averagePercentage >= 60) {
		            grade = "D";
		        } else {
		            grade = "F";
		        }

		        // Display the results
		        System.out.println("Total marks: " + totalMarks+"/"+(numberOfSubjects*100));
		        System.out.println("Average percentage: " + averagePercentage);
		        System.out.println("Grade: " + grade);

		        // Close the Scanner object
		        scanner.close();
		    }
		}

		

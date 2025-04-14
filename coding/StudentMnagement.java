package coding;

import java.util.Scanner;

public class StudentMnagement {
	int id;
	String name;
	int fees;
	String [] courses=new String[3];
	int[] marks = new int[3];
    
	
	StudentMnagement(int id, String name)
	{
		 this.id=id;
		 this.name = name;
	}
	
	StudentMnagement(int id, String name, int fees){
		this(id,name);
		this.fees=fees;
		
	}
	
	void enrollCourses(String[] courseList) {
		for(int i = 0; i< courseList.length;i++) {
			courses[i]=courseList[i];
		}
	}
	void marksObtained(int[] marksList) {
		for(int i = 0; i< marksList.length;i++) {
			marks[i]=marksList[i];
		}
	}
	int calculateTotal() {
		int total=0;
		for(int mark : marks) {
			total += mark;
		}
		return total;
	}
	
	void display() {
		System.out.println("Student Id : "+id);
		System.out.println("Name of the student: "+name);
		System.out.println("Fees amount "+fees);
		System.out.println("Enrolled Courses: ");
		for(String course:courses) {
			if(course != null) {
				System.out.print(course+" ");
			}
		}
		System.out.println();
		System.out.println("Marks :");
	
		for(int mark:marks) {
			System.out.print(mark+" ");
		
			}
		System.out.println();
		System.out.println("Total Marks : " + calculateTotal());
		System.out.println();
		}
	
	
	
	public static void main(String[] args) {
		StudentMnagement ob[] = new StudentMnagement[2];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i < ob.length;i++) {
		
		System.out.println("Enter the Id of Student" +(i+1));
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Student Name");
		String name=sc.nextLine();
		System.out.println("Fees");
		int fees = sc.nextInt();
		 sc.nextLine();
		ob[i] = new StudentMnagement(id,name,fees);
		
		System.out.println("Enter 3 courses for student " + name + ": ");
        String[] courses = new String[3];
        
        for (int j = 0; j < 3; j++) {
            System.out.print("Enter course " + (j + 1) + ": ");
            courses[j] = sc.nextLine();
        }
        ob[i].enrollCourses(courses);

        // Enter marks for the student
        System.out.println("Enter marks : ");
        int[] marks = new int[3];
        for (int j = 0; j < 3; j++) {
            System.out.print("Enter mark for subject " + (j + 1) + ": ");
            marks[j] = sc.nextInt();
        }
        sc.nextLine();
        ob[i].marksObtained(marks);

        System.out.println();
    }

    
        int[] totalMarks = new int[ob.length];
        for (int i = 0; i < ob.length; i++) {
            totalMarks[i] = ob[i].calculateTotal();
        }

        // Find topper and lowest scorer
        int topperIndex = 0, lowestIndex = 0;
        for (int i = 1; i < totalMarks.length; i++) {
            if (totalMarks[i] > totalMarks[topperIndex]) {
                topperIndex = i;
            }
            if (totalMarks[i] < totalMarks[lowestIndex]) {
                lowestIndex = i;
            }
        }

        // Display topper and lowest scorer details
        System.out.println("\nTopper Details:");
        System.out.println("Student Id: " + ob[topperIndex].id);
        System.out.println("Name: " + ob[topperIndex].name);
        System.out.println("Total Marks: " + totalMarks[topperIndex]);

        System.out.println("\nLowest Scorer Details:");
        System.out.println("Student Id: " + ob[lowestIndex].id);
        System.out.println("Name: " + ob[lowestIndex].name);
        System.out.println("Total Marks: " + totalMarks[lowestIndex]);


    }

		
			

	}

	


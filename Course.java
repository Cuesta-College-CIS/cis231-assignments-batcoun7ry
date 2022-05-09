import java.util.ArrayList;

public class Course {

	// course object fields/attributes:
	String courseID = "no course ID";
	String courseName = "no course name";
	Integer courseCredit = -1;
	String studentGrade = "no grade"; 
	ArrayList<Student> courseEnrolment = new ArrayList<Student>(); 

	// constructor sets courseID, courseName, courseCredits, and studentGrade:
	public Course(String courseID, String courseName, Integer courseCredit, String studentGrade) {
		this.courseID = courseID;
		this.courseName = courseName;
		this.courseCredit = courseCredit;
		this.studentGrade = studentGrade;
	}

	public String toString() { // not gonna use this since I cant format the text
		//override toString() to print the course object
		String printedCourse = "     Course: " +
		courseID.toString() + "  " +
		courseName.toString() + "  " +
		courseCredit.toString() + "  " +
		studentGrade.toString() + "\n";

		return printedCourse;
	}

	public void printCourse() { // this lets me format the text
		String outputFormat = "      Course: %-7s%-7s%-4s%-4s"; // why is output not perfect?
		System.out.printf(outputFormat, 	courseID.toString(),
											courseName.toString(),
											courseCredit.toString(),
											studentGrade.toString()+ "\n");
	}

	public Integer returnCourseCredit() {
		return courseCredit;
	}
}



/* // code for lab736:
import java.util.ArrayList;

public class Course {

	private ArrayList<Student> roster; //collection of Student objects

	public Course() {
		roster = new ArrayList<Student>();
	}

	public Student findStudentHighestGpa() {
        double maxGPA = 0;
		for (Student stud : roster) {
            if (stud.getGPA() > maxGPA) {
                maxGPA = stud.getGPA();
            }
        }
        for (Student student : roster) {
            if (maxGPA == student.getGPA()) {
                return student;
            } 
        }
        return roster.get(1);
	}

	public void addStudent(Student s) {
		roster.add(s);
	}
}
 */



/* // code for lab735:
import java.util.ArrayList;

public class Course {

	private ArrayList<Student> roster; //collection of Student objects

	public Course() {
		roster = new ArrayList<Student>();
	}

	public void dropStudent(String last) {
		for (int i = 0; i < roster.size(); i++) {
            if (roster.get(i).getLast().equals(last)) {
                roster.remove(i);
            }
        }
    }


    public void addStudent(Student s) {
        roster.add(s);
    }
    
    public int countStudents() {
        return roster.size();
    }
}
 */


/* //code for lab734:
import java.util.ArrayList;

public class Course {

	private ArrayList<Student> roster; //collection of Student objects
    private ArrayList<Student> deanList = new ArrayList<Student>();

	public Course() {
		roster = new ArrayList<Student>(); //instantiates ArrayList
	}

	public ArrayList<Student> getDeansList() {
        for (Student student: roster) {
            if (student.getGPA() > 3.4) {
                deanList.add(student);
            }
        } return deanList;
	}

	public void addStudent(Student s) {
		roster.add(s);
	}
}
 */


/*
code for lab733:
import java.util.ArrayList;

public class Course {

	private ArrayList<Student> roster;  //collection of Student objects

	public Course() {
		roster = new ArrayList<Student>();
	}

	public int courseSize() {
		return roster.size();
	}
	
	public void addStudent(Student s) {
		roster.add(s);
	}
} */
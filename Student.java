import java.util.ArrayList;

public class Student extends Person {

	// Student objects's fields/attributes:
	private Integer studentID = -1;
	private String studentName = "no name";
	private Integer studentCredits = 0;
	ArrayList<Course> studentCourses = new ArrayList<Course>();
	private String studentSummary = "blank";
	Integer totalCredits;


	// constructor sets Student's ID and name:
	public Student(Integer id, String name) {
		studentID = id;
		studentName = name;
	}

	// constructor for FinalExam3:
	Student(String name, String DOB, Integer studentID, Integer studentCredits) {
		super(name, DOB);
		this.studentID = studentID;
		this.studentCredits = studentCredits;
	}

	// setter: add a course object to Student object's ArrayList of courses:
	public void addStudentCourse(Course course) {
		this.studentCourses.add(course);
	}

	// getter: return Integer of Student object ID:
	public Integer getStudentID() {
		return studentID;
	}

	// getter: return String of Student object name:
	public String getStudentName() {
		return studentName;
	}

/* 	// getter: return String of Student object courses:
	public String getStudentCourses() {
		String printStudentCourses = " ";
		for (int i = 0; i < studentCourses.size(); i++) {
			printStudentCourses += studentCourses.get(i) + " : ";

		}
		return printStudentCourses;
	} */

/* 	// getter: return ArrayList of Student object courses:
	public ArrayList<Course> getStudentCoursesAL() {
		return studentCourses;
	} */

	// getter: return Integer of total credits for Student object:
	public Integer getStudentCredits() {
		Integer creditSum = 0;
		for (int i = 0; i < studentCourses.size(); i++) {
			creditSum += studentCourses.get(i).courseCredit;
		}
		totalCredits = creditSum;
		return studentCredits;
	}

/* 	// getter: print string of Student object attributes:
	public String toString() {
		// TODO: make studentSummary string

		return studentSummary;
	} //(is this unnecessary given main class has something simmilar?) */

}




/* // code for lab736:
import java.text.DecimalFormat;

// Class representing a student
public class Student {

	private String first;  // first name
	private String last;   // last name
	private double gpa;    // grade point average

	// Student class constructor
	public Student(String first, String last, double gpa) {
		this.first = first; // first name
		this.last = last;   // last name
		this.gpa = gpa;     // grade point average
	}

	public double getGPA() {
		return gpa;
	}

	public String getLast() {
		return last;
	}

	// Returns a String representation of the Student object, with the GPA
	// formatted to one decimal
	public String toString() {
		DecimalFormat fmt = new DecimalFormat("#.0");
		return first + " " + last + " " + "(GPA: " + fmt.format(gpa) + ")";
	}
} */


/* // Code for lab735:
import java.text.DecimalFormat;

// Class representing a student
public class Student {

	private String first;  // first name
	private String last;   // last name
	private double gpa;    // grade point average

	// Student class constructor
	public Student(String f, String l, double g) {
		first = f;  // first name
		last = l;   // last name
		gpa = g;    // grade point average
	}

	public double getGPA() {
		return gpa;
	}

	public String getLast() {
		return last;
	}

   // Returns a String representation of the Student object, with the GPA
   // formatted to one decimal
	public String toString() {
		DecimalFormat fmt = new DecimalFormat("#.0");
		return first + " " + last + " " + fmt.format(gpa);
	}
} */



/* //code for lab734:
import java.text.DecimalFormat;

// Class representing a student
public class Student {

	private String first;  // first name
	private String last;   // last name
	private double gpa;    // grade point average

	// Student class constructor
	public Student(String first, String last, double gpa) {
		this.first = first; // first name
		this.last = last;   // last name
		this.gpa = gpa;     // grade point average
	}

	public double getGPA() {
		return gpa;
	}

	public String getLast() {
		return last;
	}
	
	// Returns a String representation of the Student object, with the GPA
	// formatted to one decimal
	public String toString() {
		DecimalFormat fmt = new DecimalFormat("#.0");
		return first + " " + last + " (GPA: " + fmt.format(gpa) + ")";
	}
} */



/* // code for lab733:
// Class representing a student
public class Student {

	private String first;  // first name
	private String last;   // last name
	private double gpa;    // grade point average
	
	// Student class constructor
	public Student(String first, String last, double gpa) {
		this.first = first;    // first name
		this.last = last;      // last name
		this.gpa = gpa;        // grade point average
	}

	public double getGPA() {
		return gpa;
	}

	public String getLast() {
		return last;
	}
}
 */



/* 
Code for lab732:
// Simple class to hold student information
public class Student {
    String name;
    Double gpa;
   
    //define two private member fields
    public Student() {
        this.name = "Louie";
        this.gpa = 1.0;
    }
     
    public void setName(String n) {
        //assign parameter to instance field  
        this.name = n;
    }
    
    // Add three more methods
    public String getName() {
        return name;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public Double getGPA() {
        return gpa;
    }
 } */


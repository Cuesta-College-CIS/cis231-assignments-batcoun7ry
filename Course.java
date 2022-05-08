import java.util.ArrayList;

public class Course {

	// Course object fields/attributes:
	private String courseID;
	private String courseName;
	private Integer courseCredit;
	private String grade; 
	private ArrayList<Student> courseEnrolment; // why "ArrayList cannot be resolved to a type"?

	// constructor initilizes course ID, name, credits, and enrolment:
	public Course(String courseID, String courseName, Integer courseCredit, String studentGrade) {
		this.courseID = courseID;
		this.courseName = courseName;
		this.courseCredit = courseCredit;
		this.grade = grade;
	}

	public String toString() {
		//override toString() to print the course object
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
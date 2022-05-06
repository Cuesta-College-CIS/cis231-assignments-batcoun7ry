
public class Course {
	String cid;
	String cname;
	Integer credit;
	String grade;

	Course(String id, String name, Integer c, String g) { 
		//code:
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

public class Student {
	Integer sid;
	String sname;
	ArrayList<Course> clist;

	Student(Integer id, String name, ArrayList<course> c) {

	}

	public String toString() {
		//print student object:
		return someString;
	}

	public Integer getTotalCredits() {
		//retrun total credits for Student object:
		return someInt;
	}

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


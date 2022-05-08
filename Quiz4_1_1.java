import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File; // do I need this?
import java.io.FileNotFoundException; // do I need this?
import java.io.IOError; // do I need this?


public class Quiz4_1_1 {

    // This is the format I coppied from minute 23 in the lecture video. But it differs from
    // how zylabs teaches file input. I will follow zylab's teaching.
    /*
    // populate and return studentList with studentData.txt (file in same directory):
    public static ArrayList<Student> fillupStudent() throws FileNotFoundException {
        
        Integer studentID;
        String studentName;
        Integer courseTally;
        String courseID;
        String courseName;
        Integer courseCredit;
        String studentGrade;

        File studentData = new File("studentData.txt");
        Scanner scnr = new Scanner(studentData);
        while (scnr.hasNextLine()) {
            studentID = scnr.nextInt();
            studentName = scnr.next();
            courseTally = scnr.nextInt();
            ArrayList<Course> courseList = new ArrayList<Course>();
            for (int i = 0; i < courseTally; i++) {
                courseID = scnr.next();
                courseName = scnr.next();
                courseCredit = scnr.nextInt();
                studentGrade = scnr.next();
                Course c = new Course(courseID, courseName, courseCredit, studentGrade);
                courseList.add(c);
            }
            Student s = new Student(studentID, studentName, studentCourses);
            studentList.add(s);
        }

        return studentList;
    } */

    public static ArrayList<Student> fillStudentList()  throws IOException {

        // set up file input:
        FileInputStream fileByteStream = null;
        Scanner inFS = null;

        // student variables to be assigned from studentData.txt:
        Integer studentID;
        String studentName;
        Integer studentCourseTally;
        String studentGrade;
        
        // course variables to be assigned from studentData.txt:
        String courseID;
        String courseName;
        Integer courseCredit;

        // school enrolment: ArrayList of students enrolled at school:
        ArrayList<Student> studentList = new ArrayList<Student>();

        // parse data from studentData.txt
        fileByteStream  = new FileInputStream("studentData.txt");
        inFS = new Scanner(fileByteStream);

        while (inFS.hasNextLine()) {
            // instantiate Student:
            studentID = inFS.nextInt();
            studentName = inFS.next();
            Student currentStudent = new Student(studentID, studentName);

            // populate current Student object with course details:
            studentCourseTally = inFS.nextInt();

            for (int i = 0; i < studentCourseTally; i++) {
                // collect one row of student's course data (i.e. one course):
                courseID = inFS.next();
                courseName = inFS.next();
                courseCredit = inFS.nextInt();
                studentGrade = inFS.next();
                // populate a Course object with above data:
                Course currentCourse = new Course(  courseID, courseName, 
                                                    courseCredit, studentGrade);
                // push above course object into currentStudent's ArrayList of courses:
                currentStudent.addStudentCourse(currentCourse);
            }

            // add complete Student object to an ArrayList of Students called studentList:
            studentList.add(currentStudent);
        }

        inFS.close(); // vscode gets mad if I dont have this
        fileByteStream.close();
        

        return studentList;

    }

    // print studentList:
    public static void printStudent(ArrayList<Student> studentList) {
        
        // iterate throguh studentList and print each Student object's fields/attributes:
        for (int i = 0; i < studentList.size(); i++) {
            System.out.print(studentList.get(i).getStudentName());
        } // this is still printing only three student memory adresses. why?
        
    }

/*     public static void printStudent(ArrayList<Student> studentList, Integer studentID) {
        // Code:
    }

    public static Integer findStudent(ArrayList<Student> studentList) {
        // code:
        return studentID;
    } */


	public static void main(String args[]) throws IOException {

        ArrayList <Student> studentList = fillStudentList();
        //printStudent =(studentList);
        //studentID = findStudent(studentList);

        //printStudent(studentList, studentID);
        System.out.print(studentList);
    }
}
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.IOException;

public class FinalExam3 {

    // method to populate school's list of students from text file. 
    public static ArrayList<Student> fillUpStudentList() throws IOException {

        // set up file input:
        FileInputStream fileByteStream = null;
        Scanner inFS = null;

        // student variables to be assigned from studentData2.txt:
        Integer studentID;
        Integer studentCourseTally;
        Integer studentCredits;
        Integer studentGrade;
        String studentName;
        String studentDOB;
    

        // course Variables to be assigned from studentData2.txt:
        String courseID;
        String courseName;
        Integer courseCredit;

        // school; enrolment: ArrayList of students enrolled at school:
        ArrayList<Student> studentList = new ArrayList<Student>();

        // parse data from studentData2.txt:
        fileByteStream = new FileInputStream("studentData2.txt");
        inFS = new Scanner(fileByteStream);

        while (inFS.hasNextLine()) {
            // gather student data from file:
            studentID = inFS.nextInt();
            studentName = inFS.next();
            studentCredits = inFS.nextInt();
            studentDOB = inFS.next();
            studentCourseTally = inFS.nextInt();
            // instantiate student:
            Student currentStudent = new Student(   studentName, studentDOB, 
                                                    studentID, studentCredits);

            // populate current Student object with course details:
            studentCourseTally = inFS.nextInt();

            for (int  i = 0; i < studentCourseTally; i++) {
                courseID = inFS.next();
                courseName = inFS.next();
                studentGrade = inFS.nextInt();
                // populate a Course object with above data:
                Course currentCourse = new Course(courseID, courseName, studentGrade);
            }
            studentList.add(currentStudent);
        }

        inFS.close();
        fileByteStream.close();
        
        return studentList;
    }

	public static void main(String[] args) throws IOException {
        ArrayList<Student> studentList = fillUpStudentList();
        System.out.print(studentList);
	}
}
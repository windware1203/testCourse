package utwork;
import java.util.*;
/**
Manager:Takeda Nana
V.2 Functional Object

*/
public class Course
{
	private ArrayList<Student> students = new ArrayList<Student>();
	private String teacherName;
	private String courseName;
	private String courseIntro;
	private String courseCode;
	private int courseCredit;
	
	public Course(String CourseName,String TeacherName
				,String CourseIntro,String CourseCode,int CourseCredit)
	{
		this.courseName = CourseName;
		this.teacherName = TeacherName;
		this.courseIntro = CourseIntro;
		this.courseCode = CourseCode;
		this.courseCredit = CourseCredit;
	}
	public void addStudent(int studentID,String studentName,int studentClass)
	{
		students.add(new Student(studentID,studentName,studentClass));
	}
	public boolean get(int code)
	{
		
		switch (code)
		{
			case 0:
				System.out.println("Exiting");
				System.out.println("Thanks to using this system. See you next time. ");
				System.out.println("");
				return false;
			case 1:
				getCourseCode();
				System.out.println("");
				return true;
			case 2:
				getnumOfStudents();
				System.out.println("");
				return true;
			case 3:
				getCourseCredit();
				System.out.println("");
				return true;
			case 4:
				getCourseIntro();
				System.out.println("");
				return true;
			case 5:
				getStudentName();
				System.out.println("");
				return true;
			case 6:
				getCourseName();
				System.out.println("");
				return true;
			case 7:
				getTeacherName();
				System.out.println("");
				return true;
			default:
				System.out.println("error!Please type it again.");
				System.out.println("");
				return true;
		}
	}
	public void getCourseCode()
	{
		System.out.println("The Coursecode is " + this.courseCode);
	}
	public void getnumOfStudents()
	{
		System.out.println("The number of students is " + this.students.size());
	}
	public void getCourseCredit()
	{
		System.out.println("The CourseCredit is " + this.courseCredit);
	}
	public void getCourseIntro()
	{
		System.out.println("The Course Introdution is " + this.courseIntro);
	}
	public void getStudentName ()
	{
		System.out.println("Names of all students in the class : ");
		System.out.println("");
		for(int i=0;i<students.size();i++)
		{
			if(students.get(i)!=null)
				System.out.println(students.get(i));
		}
	}
	public void getCourseName()
	{
		System.out.println("The Coursename is " + this.courseName);
	}
	public void getTeacherName()
	{
		System.out.println("The teacher of this Course is " + this.teacherName);
	}
}

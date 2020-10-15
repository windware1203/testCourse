package utwork;
public class Student {
	private int studentID;
	private String studentName;
	private int studentClass;
	
	public  Student(int studentID,String studentName,int studentClass){
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentClass = studentClass;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentClasst() {
		return studentClass;
	}
	
}

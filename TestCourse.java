package utwork;
import java.util.Scanner;
/**
Manager:Takeda Nana
V.2 Driver

*/
public class TestCourse
{
	public static void main(String[] args)
	{
		Course course1 = new Course("Foundation of computer science","Dr. Lee","w","1463",3);
		Course course2 = new Course("Japanese","Dr. Takeda","Enhancing your Japanese language skill about reading and writing.","5473",2);
		Course course3 = new Course("Computer Network","Dr. Ishigawa","A computer network is a group of computers that use a set of common communication protocols over digital interconnections for the purpose of sharing resources located on or provided by the network nodes. ","9511",3);
		Course course4 = new Course("Information Security","Dr. Obama","Information security, sometimes shortened to infosec, is the practice of protecting information by mitigating information risks. It is part of information risk management.","7715",3);
		course1.addStudent(109898,"LIN",1233);course1.addStudent(109871,"Wuyos",1233);
		course2.addStudent(109228,"Zoe",1233);course2.addStudent(109111,"Kaga",1213);
		course3.addStudent(102118,"Sayuri",1021);course3.addStudent(102098,"Bobo",1012);
		course4.addStudent(109318,"Peter",2011);course4.addStudent(109819,"ZuK Osas",2210);
		int usingCode=0;
		int courseCode=0;
		Scanner buffer = new Scanner(System.in);
		do
		{
			print();
			courseCode = buffer.nextInt();
			switch(courseCode)
			{
				case 1463:
					do
					{ 
						print();
						usingCode = buffer.nextInt();
						course3.get(usingCode);
					}while(usingCode!=0);
					break;
				case 5473:
					do
					{ 
						print();
						usingCode = buffer.nextInt();
						course3.get(usingCode);
					}while(usingCode!=0);
					break;
				case 9511:
					do
					{ 
						print();
						usingCode = buffer.nextInt();
						course3.get(usingCode);
					}while(usingCode!=0);
					break;
				case 7715:
					do
					{ 
						print();
						usingCode = buffer.nextInt();
						course3.get(usingCode);
					}while(usingCode!=0);
					break;
			}
			
		}while(courseCode!=0);buffer.close();
		
	}
		
	public static void print()
	{
		System.out.println("This is course one.please input the code.");
		System.out.println("【0】exit");
		System.out.println("【1】Course Code");
		System.out.println("【2】Total Number Of Students");
		System.out.println("【3】Course Credit");
		System.out.println("【4】Course Intro.");
		System.out.println("【5】Student Name");
		System.out.println("【6】Course Name");
		System.out.println("【7】Teacher Name");
	}
}

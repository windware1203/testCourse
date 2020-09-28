package utwork;
import java.util.Scanner;
public class TestCourse
{
	public static void main(String[] args)
	{
		Course course1 = new Course("Foundation of computer science","Dr. Lee","w","1463",3);
		Course course2 = new Course("Japanese","Dr. Takeda","Enhancing your Japanese language skill about reading and writing.","5473",2);
		Course course3 = new Course("Computer Network","Dr. Ishigawa","A computer network is a group of computers that use a set of common communication protocols over digital interconnections for the purpose of sharing resources located on or provided by the network nodes. ","9511",3);
		Course course4 = new Course("Information Security","Dr. Obama","Information security, sometimes shortened to infosec, is the practice of protecting information by mitigating information risks. It is part of information risk management.","7715",3);
		course1.addStudent("Mamami");course1.addStudent("Nakashima");course1.addStudent("Oosaki");
		course1.addStudent("Mashiro");course1.addStudent("Lucius");course1.addStudent("Albert");
		course2.addStudent("Gaga");course2.addStudent("Lin s");course2.addStudent("Kei Wu");
		course2.addStudent("Zhang osasu");course2.addStudent("ovuvuevuevue enyetuenwuevue ugbemugbem osas");
		course3.addStudent("Iwamoto");course3.addStudent("Okamoto");course3.addStudent("Wernher ");
		course3.addStudent("Zhang");course3.addStudent("Kim Jong-un");course3.addStudent("Gen Shi");
		course4.addStudent("Wang");course4.addStudent("Lulu");course4.addStudent("Gate");
		course4.addStudent("Brandt");course4.addStudent("Planck");course4.addStudent("Schweitzer");
		int usingCode=0;
		int courseCode=0;
		Scanner buffer = new Scanner(System.in);
		do
		{
			System.out.println("please choose the courseCode.");
			System.out.println("【1463】 Foundation of computer science");
			System.out.println("【5473】 Japanese");
			System.out.println("【9511】 Computer Network");
			System.out.println("【7715】 Information Security");
			courseCode = buffer.nextInt();
			switch(courseCode)
			{
				case 1463:
					do
					{ 
						System.out.println("This is course one.please buffer the code.");
						System.out.println("【0】exit");
						System.out.println("【1】Course Code");
						System.out.println("【2】Total Number Of Students");
						System.out.println("【3】Course Credit");
						System.out.println("【4】Course Intro.");
						System.out.println("【5】Student Name");
						System.out.println("【6】Course Name");
						System.out.println("【7】Teacher Name");
						usingCode = buffer.nextInt();
						course1.get(usingCode);
					}while(usingCode!=0);
					break;
				case 5473:
					do
					{ 
						System.out.println("This is course one.please buffer the code.");
						System.out.println("【0】exit");
						System.out.println("【1】Course Code");
						System.out.println("【2】Total Number Of Students");
						System.out.println("【3】Course Credit");
						System.out.println("【4】Course Intro.");
						System.out.println("【5】Student Name");
						System.out.println("【6】Course Name");
						System.out.println("【7】Teacher Name");
						usingCode = buffer.nextInt();
						course2.get(usingCode);
					}while(usingCode!=0);
					break;
				case 9511:
					do
					{ 
						System.out.println("This is course one.please buffer the code.");
						System.out.println("【0】exit");
						System.out.println("【1】Course Code");
						System.out.println("【2】Total Number Of Students");
						System.out.println("【3】Course Credit");
						System.out.println("【4】Course Intro.");
						System.out.println("【5】Student Name");
						System.out.println("【6】Course Name");
						System.out.println("【7】Teacher Name");
						usingCode = buffer.nextInt();
						course3.get(usingCode);
					}while(usingCode!=0);
					break;
				case 7715:
					do
					{ 
						System.out.println("This is course one.please buffer the code.");
						System.out.println("【0】exit");
						System.out.println("【1】Course Code");
						System.out.println("【2】Total Number Of Students");
						System.out.println("【3】Course Credit");
						System.out.println("【4】Course Intro.");
						System.out.println("【5】Student Name");
						System.out.println("【6】Course Name");
						System.out.println("【7】Teacher Name");
						usingCode = buffer.nextInt();
						course4.get(usingCode);
					}while(usingCode!=0);
			}
			
		}while(courseCode!=0);buffer.close();
		
	}
}

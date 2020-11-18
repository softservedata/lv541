package Homework_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		
			
		
		List<Student> studentsList = new ArrayList<Student>();
		
		studentsList.add (new Student("Kim", 5));
		studentsList.add (new Student("Pete", 8));
		studentsList.add (new Student("Layla", 2));
		studentsList.add (new Student("Claudia",4));
		studentsList.add (new Student("Ellen", 9));
		Student.printStudents(studentsList,5);
		
		studentsList.sort(new NameComparator());
		for (Student student : studentsList) {
			System.out.println(student);
		
			}
		studentsList.sort( new CourseComparator());
		for (Student student : studentsList) {
			System.out.println (student);
			}
		}
	
	}
 
		

	
		

	

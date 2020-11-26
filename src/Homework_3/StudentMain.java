package Homework_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Iterator;


public class StudentMain {

	public static void main(String[] args) {
		
			
		
		List<Student> studentsList = new ArrayList<Student>();
		
		studentsList.add (new Student("Kim", 5));
		studentsList.add (new Student("Pete", 8));
		studentsList.add (new Student("Layla", 2));
		studentsList.add (new Student("Claudia",4));
		studentsList.add (new Student("Ellen", 9));
		
		Student.printStudents(studentsList,5);
	

        System.out.println("");
        Collections.sort(studentsList);
        Iterator<Student> iterator = studentsList.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student);
        }

        System.out.println("");
        Collections.sort(studentsList, new Student.ByCourse());
        System.out.println(studentsList);

        }
        }	

	
		

	

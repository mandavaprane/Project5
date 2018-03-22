package command;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Praneetha
 */
public class CommandExercise {

    public static void main(String[] args) {
        
        List<Student> list = newList();
        
        System.out.println("\nThe Random list:");
        Display(list);
        Collections.sort(list, new GradeComparator()); 
        System.out.println("\nDescending order of grade: ");
        Display(list);
        
        System.out.println("\nAscending order of firstName: ");
        Collections.sort(list, new FirstNameComparator()); 
        Display(list); 
 
        System.out.println("\nDescending sort of lastname and GPA: ");
        Collections.sort(list, new LastNameComparator()); 
        Display(list); 
    }
    
    public static List<Student> newList() {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(11, "Rashmi", "Kamma", 7.7));
        list.add(new Student(6, "Praneetha", "Mandava", 9.1));
        list.add(new Student(4, "Arun", "Sonti", 7.4));
        list.add(new Student(1, "Jethin", "Yelamanchali", 7.0));
        list.add(new Student(2, "Nagi", "Reddy", 7.5));
        list.add(new Student(7, "Madhu", "Sudhen", 6.7));
        list.add(new Student(17, "Madhu", "Babu", 9.9));
        list.add(new Student(20, "Sai", "Naveen", 8.5));
        list.add(new Student(13, "Sneha", "Choudhary", 6.1));
        list.add(new Student(3, "Harika", "Maneni", 8.9));
        list.add(new Student(15, "Rakesh", "Mahanthi", 10.0));
        list.add(new Student(14, "Himaja", "Shivaram", 6.5));
        list.add(new Student(16, "Raja", "Sethil", 7.2));
        list.add(new Student(5, "Michelle", "Postman", 8.0));
        list.add(new Student(12, "Priyatham", "Reddy", 8.2));
        list.add(new Student(18, "Muni", "Pawan", 6.9));
        list.add(new Student(9, "Chaithanya", "Reddy", 7.7));
        list.add(new Student(19, "Jannet", "Crane", 8.8));
        list.add(new Student(8, "Rania", "Hodhod", 7.6));
        list.add(new Student(10, "Raghu", "Kumar", 8.7));
        return list;

    }
    
    private static void Display(List<Student> l) {
        
        System.out.println("*****************************************************");

        System.out.format("%5s%15s%16s%12s\n","ID","FirstName","LastName","Grade");
        System.out.println("*****************************************************");
        for (Student student : l) {
            System.out.format("%5s%15s%16s%12s\n",student.getStudentID(),student.getFirstName(),student.getLastName(),student.getGrade());
        }

    }
}

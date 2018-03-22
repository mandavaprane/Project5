package command;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Praneetha
 */
public class LastNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s, Student t) {
        String ln = s.getLastName();
        String ln1 = t.getLastName();
        int compare = ln.compareTo(ln1); 
        if(compare == 0){
            return new GradeComparator().compare(s, t);
        }
        else if(compare > 0){
            return -1;
        }
        else{
            return 1;
        }
    }

}

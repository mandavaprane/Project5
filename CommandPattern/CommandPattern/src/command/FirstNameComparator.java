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

public class FirstNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s, Student t) {
        String fn = s.getFirstName();
        String fn1 = t.getFirstName();
        return fn.compareTo(fn1);
    }

}


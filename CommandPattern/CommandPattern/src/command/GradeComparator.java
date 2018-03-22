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

public class GradeComparator implements Comparator<Student> {

    @Override
    public int compare(Student s, Student t) {
        if (s.getGrade()<t.getGrade()){
            return 1;
        }
        else
        {
            return -1;
        }

    }
}

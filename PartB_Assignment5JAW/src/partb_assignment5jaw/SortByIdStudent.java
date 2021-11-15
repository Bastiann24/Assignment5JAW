package partb_assignment5jaw;


import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bastian Ugalde
 * Method to sort the student by id using comparator
 */
public class SortByIdStudent implements Comparator<Student>
{
    public int compare(Student s1, Student s2)
    {
        return s1.id - s2.id;
    } 
}

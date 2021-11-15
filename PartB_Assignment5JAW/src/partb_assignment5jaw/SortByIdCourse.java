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
 * Method to sort the course by ID using comparator
 */
public class SortByIdCourse implements Comparator<Course>
{
    public int compare(Course c1, Course c2)
    {
        return c1.courseCode - c2.courseCode;
    } 
}

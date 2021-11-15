package partb_assignment5jaw;


import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bastian ugalde
 * Method to sort the enrollment by id using comparator
 */
public class SortByIdEnrollment implements Comparator<Enrollment>
{
    public int compare(Enrollment e1, Enrollment e2)
    {
        return e1.enrollmentID - e2.enrollmentID;
    } 
}

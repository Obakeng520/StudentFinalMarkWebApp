/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.ejb.bl.StudentFacadeLocal;

/**
 *
 * @author Obakeng
 */
public class GetStatisticsServlet extends HttpServlet {
    
    @EJB StudentFacadeLocal sfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long totalStudents = sfl.getTotalStudents();
        Double highestMark = sfl.getHighestMark();
        Double lowestMark = sfl.getLowest();
        Long passedStudent = sfl.getPassedStudents();
        Long failedStudents = sfl.getFailedStudent();
        Double avgMark = sfl.getAvarage();
        Long supplementaryStudents = sfl.getSupplementeryStudents();
        Long distinction = sfl.getStudentsWithDistinction();
        
        request.setAttribute("totalStudents", totalStudents);
        request.setAttribute("highestMark", highestMark);
        request.setAttribute("lowestMark", lowestMark);
        request.setAttribute("passedStudent", passedStudent);
        request.setAttribute("failedStudents", failedStudents);
        request.setAttribute("avgMark", avgMark);
        request.setAttribute("supplementaryStudents", supplementaryStudents);
        request.setAttribute("distinction", distinction);
        
        RequestDispatcher disp = request.getRequestDispatcher("get_statistics_outcome.jsp");
        disp.forward(request, response);
    }


}

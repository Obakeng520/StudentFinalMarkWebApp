/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.ejb.bl.StudentFacadeLocal;
import za.ac.tut.entities.Student;

/**
 *
 * @author Obakeng
 */
public class GetStudentsByStatusServlet extends HttpServlet {
    
    @EJB StudentFacadeLocal sfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String status = request.getParameter("status");
        List<Student> students = sfl.getStudentsByStatus(status);
        
        request.setAttribute("students", students);
        
        RequestDispatcher disp = request.getRequestDispatcher("get_students_by_status_outcome.jsp");
        disp.forward(request, response);
    }

   
}

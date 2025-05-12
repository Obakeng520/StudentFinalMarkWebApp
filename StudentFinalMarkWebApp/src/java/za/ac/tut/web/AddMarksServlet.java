/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.ejb.bl.FinalMarkCalculatorLocal;
import za.ac.tut.ejb.bl.StudentFacadeLocal;
import za.ac.tut.entities.Student;

/**
 *
 * @author Obakeng
 */
public class AddMarksServlet extends HttpServlet {
    @EJB StudentFacadeLocal bf1;
    @EJB FinalMarkCalculatorLocal sf1;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        Long id = Long.parseLong(request.getParameter("id"));
        Double semesterMark = Double.parseDouble(request.getParameter("semesterMark"));
        Double examMark = Double.parseDouble(request.getParameter("examMark"));
        Double total = sf1.CalculateMark(semesterMark,examMark);
        String status = sf1.Result(total);
        
        session.setAttribute("semesterMark", semesterMark);
        session.setAttribute("examMark", examMark);
        session.setAttribute("total", total);
        
        Student student = createMarks(id,semesterMark,examMark,total,status);
        bf1.create(student);
        
        RequestDispatcher disp = request.getRequestDispatcher("add_marks_outcome.jsp");
        disp.forward(request, response);
        
        
        
    }

    private Student createMarks(Long id, Double semesterMark, Double examMark, Double total, String status) {
        Student student = new Student();
        student.setId(id);
        student.setSemesterMark(semesterMark);
        student.setExamMark(examMark);
        student.setTotalMark(total);
        student.setStatus(status);
        student.setCreationDate(new Date());
        return student;
    }


}

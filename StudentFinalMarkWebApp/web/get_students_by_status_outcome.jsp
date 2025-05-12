<%-- 
    Document   : newjspget_students_by_status_outcome
    Created on : 10-May-2025, 22:48:46
    Author     : Obakeng
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entities.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get Students By Status Outcome Page</title>
    </head>
    <body>
        <h1>Get Students By Status Outcome</h1>
        <%
            List<Student> students = (List<Student>)request.getAttribute("students");
        %>
        <table border="1">
            <th>Student number</th>
            <th>Semester mark</th>
            <th>Exam mark</th>
            <th>Total</th>
            <th>Status</th>
            <%
                for(Student std: students){
                    Long id = std.getId();
                    Double semesterMark = std.getSemesterMark();
                    Double examMark = std.getExamMark();
                    Double total = std.getTotalMark();
                    String status = std.getStatus();
            %>
            <tr>
                <td><%=id%></td>
                <td><%=semesterMark%></td>
                <td><%=examMark%></td>
                <td><%=total%></td>
                <td><%=status%></td>
            </tr>
            <%
                }
            %>
        </table>
            <ul>
            <li><a href="menu.html">MENU PAGE</a></li>
            <li><a href="index.html">HOME PAGE</a></li>
        </ul>
    </body>
</html>

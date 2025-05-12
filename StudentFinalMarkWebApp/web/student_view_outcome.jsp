<%-- 
    Document   : student_view_outcome
    Created on : 10-May-2025, 22:14:56
    Author     : Obakeng
--%>

<%@page import="za.ac.tut.entities.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student View Outcome Page</title>
    </head>
    <body>
        <h1>Results</h1>
        <%
            Student student = (Student)request.getAttribute("student");
        %>
        <p>
            Student number: <b><%=student.getId()%></b><br>
            Semester mark: <b><%=student.getSemesterMark()%></b><br>
            Exam mark: <b><%=student.getExamMark()%></b><br>
            Final mark: <b><%=student.getTotalMark()%></b><br>
            Status: <b><%=student.getStatus()%></b>
        </p>
        <ul>
            <li><a href="menu.html">MENU PAGE</a></li>
            <li><a href="index.html">HOME PAGE</a></li>
        </ul>
    </body>
</html>

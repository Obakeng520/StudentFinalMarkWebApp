<%-- 
    Document   : get_statistics_outcome
    Created on : 10-May-2025, 23:31:59
    Author     : Obakeng
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get Statistics Outcome Page</title>
    </head>
    <body>
        <h1>Get Statistics Outcome Page</h1>
        <%
            Long totalStudents = (Long) request.getAttribute("totalStudents");
            Double highestMark = (Double) request.getAttribute("highestMark");
            Double lowestMark = (Double) request.getAttribute("lowestMark");
            Long passedStudent = (Long) request.getAttribute("passedStudent");
            Long failedStudents = (Long) request.getAttribute("failedStudents");
            Double avgMark = (Double) request.getAttribute("avgMark");
            Long supplementaryStudents = (Long) request.getAttribute("supplementaryStudents");
             Long distinction = (Long) request.getAttribute("distinction");
        %>
        <table>
            <tr>
                <td>Total number of students:</td>
                <td><%=totalStudents%></td>
            </tr>
            <tr>
                <td>Highest mark:</td>
                <td><%=highestMark%></td> 
            </tr>
            <tr>
                <td>Lowest mark:</td>
                <td><%=lowestMark%></td>
            </tr>
            <tr>
                <td>Total number of students passed:</td>
                <td><%=passedStudent%></td>
            </tr>
            <tr>
                <td>Total number of students passed with distinction:</td>
                <td><%=distinction%></td>
            </tr>
            <tr>
                <td>Total number of students failed:</td>
                <td><%=failedStudents%></td>
            </tr>
            <tr>
                <td>Total number of students who qualify for supplementary:</td>
                <td><%=supplementaryStudents%></td>
            </tr>
            <tr>
                <td>Average mark:</td>
                <td><%=avgMark%></td>
            </tr>
        </table>
        <ul>
            <li><a href="menu.html">MENU PAGE</a></li>
            <li><a href="index.html">HOME PAGE</a></li>
        </ul>
    </body>
</html>

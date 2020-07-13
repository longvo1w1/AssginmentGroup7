<%-- 
    Document   : insert
    Created on : Jul 11, 2020, 10:25:50 PM
    Author     : longvo
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="data.DTO"%>
<%@page import="data.DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="insert"  method="post">
            <h1>List Student</h1>
            <%!

            %>
            <table border="1">

                <tbody><%
                    DAO dao = new DAO();
                    ArrayList<DTO> listadmins = dao.getAdmin();

                    %>
                    <tr>
                        <td>Username</td> 
                        <td><input type="text" name="Username" value=""></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="text" name="Password" value=""></td>
                    </tr>
                    <tr>
                        <td>Classname</td>
                        <td><input type="text" name="Classname" value=""></td>
                    </tr>

                    </tr>

                </tbody>

            </table>
            <input type="submit" value="insert" /></form>

    </body>
</html>

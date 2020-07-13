<%-- 
    Document   : table
    Created on : Jul 11, 2020, 11:36:51 AM
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
        <link rel="stylesheet" href="newcss.css" />
    </head>
    <body>

        <form action="Doing"  method="post">

            <%!
                int no;
            %>
            <table border="1">
                <tbody >
                    <tr >
                        <td> <h3>List Student</h3></td> 
                    </tr>

                </tbody>
                <tbody><%
                    DAO dao = new DAO();
                    ArrayList<DTO> listadmins = dao.getAdmin();

                    for (DTO admins : listadmins) {
                    %>
                    <tr>
                        <td>Username</td> 
                        <td><input type="text" name="Username" value="<%=admins.getUsername()%>" readonly=" " ></td>
                        <td>Password</td>
                        <td><input type="text" name="Password" value="<%=admins.getPassword()%>"></td>
                        <td>Classname</td>
                        <td><input type="text" name="Classname" value="<%=admins.getClassname()%>"></td>
                        <td>  <input type="submit" value="update" name="doing" /> </td>
                          <td>   <input type="submit" value="delete" name="doing" /></td>
                    </tr>

                    <%
                        }
                    %>
                </tbody>

            </table>
            <input type="submit" value="insert" name="doing"/>
            
        </form>


    </body>
</html>

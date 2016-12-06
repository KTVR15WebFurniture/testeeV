<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HR</title>
    </head>
    <body>
        <h1>отдел кадров!</h1>
        <p style="font-size: 23px"><a href="/WebFurniture/addWorker.jsp">add Worker</a></p>
        <!--отбражение списка отдела кадров-->
        <c:forEach var="worker" items="${workers}">
            <div name="empNo">№: 
              
${workers.id}
            </div>
            <div name="empFullname">Fullname: 
${workers.surname} ${workers.name} 
            </div>
            <div name="idCode">ID-Code is: 
${workers.idCode}
            </div>
         
        </c:forEach>


                <table class="table">
                    <thead>
                        <tr>
                            <th>No</th>
                            <th>Name</th>
                            <th>Surname</th>
                            <th></th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>1</td>
                            <td>Andre</td>
                            <td>Eps</td>
                            <td></td>
                            <td></td>
                        </tr>
                    </tbody>
                </table>
        <br>
        <a class="btn-default" href="../WebFurniture/">Back</a>
    </body>
</html>

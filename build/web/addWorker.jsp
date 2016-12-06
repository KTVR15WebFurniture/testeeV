<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>add</title>
    </head>
    <body>
        <h1>add!</h1>
        <form>
                    <h3>Добавьте нового сотрудника </h3>
            <input type="text" id="_name" name="name" placeholder="Введите имя сотрудника"><br/>
            <input type="text" id="_surname" name="surname" placeholder="Введите фамилию сотрудника">
            <input class="btn-danger" type="submit" id="submit" value="Добавить">
        </form>
            <br>
        <a style="color:red" href="../WebFurniture/worker.jsp">Back</a>
        <br>
        <a href="../WebFurniture/">To main</a>
    </body>
</html>

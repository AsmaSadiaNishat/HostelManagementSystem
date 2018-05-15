<%--
  Created by IntelliJ IDEA.
  User: success
  Date: 5/11/2018
  Time: 10:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        body{
            margin: 0;
            background-color:orange;
        }
        .header{

            width: 1500px;
            height: 120px;
            margin: auto;
        }
        .nav{
            width: 1500px;
            background-color: purple;
            margin: auto;
            overflow: auto;
        }
        ul{
            margin: 0;
            padding: 0;
            list-style: none;
        }
        li{
            float: left;

        }
        a:link{
            color: goldenrod;
            width: 125px;
            text-decoration: none;
            display: block;
            text-align: center;
            padding: 15px;
            text-transform: uppercase;
            font-size: 18px;
            font-family: Verdana;

        }
        a:hover{
            background-color: black;

        }



    </style>

    <style>
        body{
            margin: 0;
            background-color: chartreuse;
        }
        .footer{

            width: 1500px;
            height: 120px;
            margin: auto;
        }
        .nav{
            width: 1500px;
            background-color:white;
            margin: auto;
            overflow: auto;
        }
        ul{
            margin: 0;
            padding: 0;
            list-style: none;
        }
        li{
            float: left;

        }
        a:link{
            color: goldenrod;
            width: 125px;
            text-decoration: none;
            display: block;
            text-align: center;
            padding: 15px;
            text-transform: uppercase;
            font-size: 18px;
            font-family: Verdana;

        }
        a:hover{
            background-color: black;

        }



    </style>
</head>



<body>
<div class="header">
    <img src="images.jpg" width="1500px" height="120px">
</div>

<div class="nav">
    <ul>
        <li><a href="#">Home</a></li>
        <li><a href="/menuServlet">Menu</a></li>
        <li><a href="#">Student</a></li>

    </ul>
</div>

<nav>
    <style>
        text {
            background-color: blueviolet;
            color: white;
            padding: 10px;
        }
    </style>

    <form action="/allocating">
        <h3> Student Name:</h3>
        <input type="text" name="student">
        <h3> Seat No.:</h3>
        <input type="text" name="seat">
        <input type="submit" value="Add Student">
    </form>


</nav>

<div class="footer">
    <img src="images.jpg" width="1500px" height="150">
</div>

<div class="nav">
    <ul>
        <li><a href="#">Contuct us</a></li>
        <li><a href="#">previous</a></li>
        <li><a href="#">Next</a></li>
        <li><a href="#">Exit</a></li>

    </ul>
</div>
</body>
</html>

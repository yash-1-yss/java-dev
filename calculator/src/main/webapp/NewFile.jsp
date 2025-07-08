<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator</title>
<style>
body {
  font-size: 40px;
  text-align:center;
  background: linear-gradient(to right,  #2b40ff,#07121a);
}

h1,h3{
color: white;
margin:15px;
}
input, button {
  font-size:40px;
  color: white;
  border-radius: 5%;
  background-color: black;
  border: 2px solid white;
}

img{
width: 20%;
height:20%;
margin-top: 20px;
}
img:hover{
  -ms-transform: scale(1.1); /* IE 9 */
  -webkit-transform: scale(1.1); /* Safari 3-8 */
   transform: scale(1.1); 
}
</style>
</head>
<body>
<img alt="calculator" src="https://media1.giphy.com/media/v1.Y2lkPTc5MGI3NjExaWVlcnZ6d2N3azc2YjBrajZ2bXM0emZwd3VqZHNyYmxrM2JwcWVqNyZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/CiC5N2o57QVmLInd4J/giphy.gif">
<h1>ENTER HERE TO CALCULATE</h1>
<form action="MyServlet">
<input name="number1" placeholder="num1"></input>
<input name="number2" placeholder="num2"></input>
<button name="bt1" value="1">+</button>
<button name="bt1" value="2">-</button>
<button name="bt1" value="4">*</button>
<button name="bt1" value="3">/</button>
</form>
<h1>ans=<%=request.getParameter("ans")%></h1>
</body>
</html>
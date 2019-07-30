<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="getWeatherData">
<table>
<tr>
<td>City</td>
<td><input type="text" name="city"></td>
</tr>
<tr>
<td>Country</td>
<td><input type="text" name="country"></td>
</tr>
<tr>
<td>Scale</td>
<td> 
<input type="radio"  name="scale" value="celcius"checked>
<label for="celcius">Celcius</label>
<input type="radio"  name="scale" value="farenhiet">
<label for="farenhiet">Farenhiet</label>
</td>
</tr>
<tr>
<td><input type="submit" value="click me"></td>
</tr>
</table>
</form>
</body>
</html>
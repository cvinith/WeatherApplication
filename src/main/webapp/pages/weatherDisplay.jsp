<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr> 
<td>City</td><td>${jsonObject.getString("name")}</td>
</tr>
<tr> 
<td>Country</td><td>${jsonObject.getJSONObject("sys").get("country")}</td>
</tr>
<tr>
<td>${jsonObject.getJSONArray("weather").getJSONObject(0).getString("description")}</td>
<td><img src=${src}></td>
</tr>
<tr> 
<td>Temperature</td><td>${temperature}</td>
</tr>
</table>
</body>
</html>
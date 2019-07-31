<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#parent{
		height: 300px;
		width: 450px;
		border: 1px solid #b2bdb5;
		//background-color: #b2bdb5;
		margin-left: 350px;
		margin-top: 50px;
		}
	#city{
		font-weight: bold;
		//color: #b2bdb5;
		//font-style:italic;
		font-size: 50px;
		line-height: 50px;
		margin-top: 0px;
		margin-left: 0px;
		margin-bottom: 20px;
		padding: 0px;
	}
	#description{
		//font-style:italic;
		//color: #b2bdb5;
		font-size: 30px;
		line-height: 0px;
		margin-top: 0px;
		padding: 0px;
	}
	#pic{
		height: 100px;
		float: left;
		width: 100px;
	}
	#temp{
		height: 100px;
		width: 100px;
		float:left;
	}
	#pht{
		height: 100px;
		width: 100px;
		float:left;
	}

	span{
		font-size: 70px;
	}
    p{
    	color: #C0C0C0;
    }
</style>
</head>
<body>
	<div id="parent">
		<div id="child1">
			<p id="city">${jsonObject.getString("name")},${jsonObject.getJSONObject("sys").get("country")}</p>
            <p id="description" >${jsonObject.getJSONArray("weather").getJSONObject(0).getString("description")}</p>
		</div>
		<div id="pic" class="child2">
			<img src=${src}>
		</div>
		<div id="temp" class="child2">
			<span>${temperature}</span>
		</div>
		<div id="phw" class="child2">
			<p>Precipitation&nbsp;:&nbsp;${jsonObject.getJSONObject("main").getDouble("pressure")}<p>
			<p>Humidity&nbsp;:&nbsp;${jsonObject.getJSONObject("main").getDouble("humidity")}%</p>
			<p>Wind&nbsp;:&nbsp;24&nbsp;${jsonObject.getJSONObject("wind").getDouble("speed")}Km/h</p>	
		</div>
	</div>

</body>
</html>

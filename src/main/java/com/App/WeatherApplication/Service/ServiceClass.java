package com.App.WeatherApplication.Service;




import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.App.WeatherApplication.Client.ClientClass;
import com.App.WeatherApplication.Model.InputModel;
import com.App.WeatherApplication.Model.OutputModel;

@Service
public class ServiceClass {
	@Autowired
	OutputModel outputModel;
	@Autowired
	ClientClass clientClass;


	public OutputModel  getData(InputModel cityDetails) {
		String data=clientClass.getWeatherJSONdata(cityDetails);
		JSONObject jsonObject =new JSONObject(data);
	    outputModel.setTemperature((int) Math.round((jsonObject.getJSONObject("main").getDouble("temp"))));
	    outputModel.setJsonObject(jsonObject);
	    outputModel.setSrc("http://openweathermap.org/img/wn/"+jsonObject.getJSONArray("weather").getJSONObject(0).getString("icon")+"@2x.png");
		return outputModel;
	}

}

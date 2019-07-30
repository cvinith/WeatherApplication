package com.App.WeatherApplication.Service;



import org.json.JSONObject;
import org.springframework.web.servlet.ModelAndView;

import com.App.WeatherApplication.Model.CityDetails;
import com.App.WeatherApplictaion.Client.ClientClass;

public class ServiceClass {
	Double temperature;
	public Double getTemperature() {
		return temperature;
	}
	
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}
	public ModelAndView  getData(CityDetails cityDetails) {
		ModelAndView modelAndView=new ModelAndView("weatherDisplay");
		ClientClass clientClass=new ClientClass();
		String data=clientClass.getWeatherJSONdata(cityDetails);
		JSONObject jsonObject =new JSONObject(data);
		if(cityDetails.getScale().equals("farenhiet")) {
			temperature=(jsonObject.getJSONObject("main").getDouble("temp") *9/5) - 459.67;
		}
		else {
			temperature=jsonObject.getJSONObject("main").getDouble("temp")-273.15;
		}
		modelAndView.addObject("temperature",temperature);
		modelAndView.addObject("jsonObject", jsonObject);
		modelAndView.addObject("src", "http://openweathermap.org/img/wn/"+jsonObject.getJSONArray("weather").getJSONObject(0).getString("icon")+"@2x.png");
		return modelAndView;
	}

}
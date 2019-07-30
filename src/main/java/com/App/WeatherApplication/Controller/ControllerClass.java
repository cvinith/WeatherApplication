package com.App.WeatherApplication.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.App.WeatherApplication.Model.CityDetails;
import com.App.WeatherApplication.Service.ServiceClass;



@Controller
public class ControllerClass {
	
	//mapping for home page
	@RequestMapping("weatherHomePage")
	public String homePage() {
		return "weatherHome";

	}
	
	@RequestMapping("getWeatherData")
	public ModelAndView getWeatherData(CityDetails cityDetails) {
		ServiceClass serviceClass=new ServiceClass();
		ModelAndView modelAndView =serviceClass.getData(cityDetails);
		return modelAndView;
	}
}

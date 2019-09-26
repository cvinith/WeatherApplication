package com.App.WeatherApplication.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.App.WeatherApplication.Model.InputModel;
import com.App.WeatherApplication.Model.OutputModel;
import com.App.WeatherApplication.Service.ServiceClass;



@Controller
public class ControllerClass {
	
	@Autowired
	ServiceClass serviceClass;
	
	@RequestMapping("weatherHomePage")
	public String homePage() {
		return "weatherHome";
	}
	
	@RequestMapping("getWeatherData")
	public ModelAndView getWeatherData(InputModel inputModel) {
		OutputModel outputModel =serviceClass.getData(inputModel);
		ModelAndView modelAndView=new ModelAndView("weatherDisplay");
		modelAndView.addObject("outputModel", outputModel);
		return modelAndView;
	}
}

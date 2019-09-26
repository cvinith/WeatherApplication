package com.App.WeatherApplication.Client;

import org.springframework.stereotype.Component;

import org.springframework.web.client.RestTemplate;

import com.App.WeatherApplication.Model.InputModel;


@Component
public class ClientClass {
	
	public String getWeatherJSONdata(InputModel inputModel) {
		
		String data=null;
		String url;
		
		if(inputModel.getScale().equals("celcius"))
		    url="http://api.openweathermap.org/data/2.5/weather?q="+inputModel.getCity()+","+inputModel.getCountry()+"&units=metric"+"&appid=adc0ee5c1ffcbab850bfc5a927e67749";
		else
			url="http://api.openweathermap.org/data/2.5/weather?q="+inputModel.getCity()+","+inputModel.getCountry()+"&units=imperial"+"&appid=adc0ee5c1ffcbab850bfc5a927e67749";
			
	    data=new RestTemplate().getForObject(url, String.class);
		return data;
	}

}

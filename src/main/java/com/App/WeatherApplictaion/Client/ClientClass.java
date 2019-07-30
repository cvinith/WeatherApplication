package com.App.WeatherApplictaion.Client;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.App.WeatherApplication.Model.CityDetails;
@Configuration
public class ClientClass {
	
	public String getWeatherJSONdata(CityDetails cityDetails) {
		String data=null;
		String url="http://api.openweathermap.org/data/2.5/weather?q="+cityDetails.getCity()+","+cityDetails.getCountry()+"&appid=adc0ee5c1ffcbab850bfc5a927e67749";
	    data=new RestTemplate().getForObject(url, String.class);
		return data;
	}

}

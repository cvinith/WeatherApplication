package com.App.WeatherApplication.Model;

import org.json.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class OutputModel {
	
	int temperature;
	JSONObject jsonObject;
	String src;
	
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public JSONObject getJsonObject() {
		return jsonObject;
	}
	public void setJsonObject(JSONObject jsonObject) {
		this.jsonObject = jsonObject;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}

}

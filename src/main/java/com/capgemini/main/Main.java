package com.capgemini.main;

import java.util.Map;

import javax.xml.ws.BindingProvider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.capgemini.webservice.client.GlobalWeather;
import com.capgemini.webservice.client.GlobalWeatherSoap;
import com.capgemini.ws.soap.handler.WebServiceLogHandler;
import com.capgemini.ws.soap.init.SoapWSInitializer;

public class Main {

	// Logger
	private static final Logger log = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) throws Exception {
		System.setProperty("http.proxyHost", "10.68.64.37");
		System.setProperty("http.proxyPort", "8081");

		WebServiceLogHandler wsl = new WebServiceLogHandler();
		GlobalWeather g = new GlobalWeather();
		
		 GlobalWeatherSoap port = g.getGlobalWeatherSoap();
		Map<String, Object> responseContext = ((BindingProvider)port).getResponseContext();
		Object response = SoapWSInitializer.callWebServiceMethodWithCustomLogging(GlobalWeather.class, "getWeather","","");
		SoapWSInitializer.getWebServiceMethod(GlobalWeather.class, "getGlobalWeatherSoap");
		log.debug("Respose {}",response);

	}
}

package com.capgemini.main;

import java.lang.reflect.Method;
import java.net.URL;

import com.capgemini.webservice.client.GlobalWeather;
import com.capgemini.webservice.client.GlobalWeatherSoap;
import com.capgemini.ws.soap.init.SoapWSInitializer;
import com.capgemini.ws.soap.log.SoapRequestResponseLogger;

public class Main {

	public static void main(String[] args) throws Exception {
		System.setProperty("http.proxyHost", "10.68.64.37");
		System.setProperty("http.proxyPort", "8081");

		SoapRequestResponseLogger log = SoapRequestResponseLogger.getInstance();
		GlobalWeather b = new GlobalWeather();
		
		log.enableAutomaticWSLog();
		GlobalWeatherSoap port = b.getGlobalWeatherSoap();
		
		URL url = Main.class.getResource("/wsdl/globalweather.wsdl");
		

		SoapWSInitializer.inizializeWebServiceClient(GlobalWeather.class, url, URL.class);
		
		Object s = GlobalWeather.class.newInstance();
		
		Method method = GlobalWeather.class.getMethod("getGlobalWeatherSoap");
		
		Object invoke = method.invoke(s);
		
		Method method1 = GlobalWeatherSoap.class.getMethod("getWeather",String.class, String.class);
		
		method1.invoke(invoke, "Akola", "India");

		//port.getWeather("Akola", "India");

	}
}

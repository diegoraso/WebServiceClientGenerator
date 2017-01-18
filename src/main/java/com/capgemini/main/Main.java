package com.capgemini.main;

import com.capgemini.webservice.client.GlobalWeather;
import com.capgemini.ws.soap.init.SoapWSInitializer;

public class Main {

	public static void main(String[] args) throws Exception {
		System.setProperty("http.proxyHost", "10.68.64.37");
		System.setProperty("http.proxyPort", "8081");

		SoapWSInitializer.callWebServiceMethodWithSystemLogging(GlobalWeather.class, "getWeather", "","");
		

	}
}

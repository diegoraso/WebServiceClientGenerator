package com.capgemini.main;

import javax.xml.ws.WebServiceFeature;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.capgemini.webservice.client.GlobalWeather;
import com.capgemini.ws.soap.init.SoapWSInitializer;

public class Main {

	// Logger
	private static final Logger log = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) throws Exception {
		System.setProperty("http.proxyHost", "10.68.64.37");
		System.setProperty("http.proxyPort", "8081");

		Object response = SoapWSInitializer.callWebServiceMethodWithSystemLogging(GlobalWeather.class, "getWeather","","");
		SoapWSInitializer.getWebServiceMethod(GlobalWeather.class, "getGlobalWeatherSoap");
		log.debug("Respose {}",response);

	}
}

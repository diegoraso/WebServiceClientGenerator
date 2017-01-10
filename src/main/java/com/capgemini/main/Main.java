package com.capgemini.main;

import java.io.File;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;

import com.capgemini.soap.handler.MyServiceLogHandler;
import com.capgemini.webservice.client.GlobalWeather;
import com.capgemini.webservice.client.GlobalWeatherSoap;

public class Main {

	public static void main(String[] args) throws Exception {
		File f = new File("src/main/resources/wsdl/globalweather.wsdl");
		URL url = new URL(f.toURI().toString());
		QName serviceQname = new QName("http://www.webserviceX.NET", "GlobalWeather");
		GlobalWeather b = new GlobalWeather();
		GlobalWeatherSoap port = b.getGlobalWeatherSoap();

		BindingProvider bindProv = (BindingProvider) port;
		@SuppressWarnings("rawtypes")
		List<Handler> handlers = bindProv.getBinding().getHandlerChain();
		handlers.add(new MyServiceLogHandler());
		bindProv.getBinding().setHandlerChain(handlers);

		port.getWeather("Levanto", "Italy");
	}

}

package com.capgemini.ws.soap.log;

import java.util.List;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;

import com.capgemini.ws.soap.handler.WebServiceLogHandler;
/**
 * 
 * @author diraso
 * 
 * Classe che permette di loggare le richieste e le risposte dei web service SOAP
 * sono previste due modalità operative:
 * - log abilitato per tutti i servizi impostatndo le properties di sistema
 * - log abilitato al singolo servizio specificato
 *
 */
public class SoapRequestResponseLogger {
	/**
	 * Handler che permette di 
	 */
	private WebServiceLogHandler handler;

	private static SoapRequestResponseLogger instance;

	private SoapRequestResponseLogger() {

		this.handler = new WebServiceLogHandler();

	}

	public static SoapRequestResponseLogger getInstance() {

		if (instance == null) {
			instance = new SoapRequestResponseLogger();
		}

		return instance;
	}
	/**
	 * impostati il log a livello sistema, quindi saranno loggati tutte le richieste e risposte. Da utilizzare prima di istanziare i servizi altrimenti non ha effetto
	 */
	public void enableAutomaticWSLog() {
		setSystemWSProperty("true");
	}
	/**
	 * associa handler al servizio per loggare le richieste e risposte soap del client specificato come parametro
	 * @param service
	 */
	public void setUpWebServiceLog(Object service) {
		
		 BindingProvider bindProv = (BindingProvider) service;
		 
		 @SuppressWarnings("rawtypes")
		 List<Handler> handlers = bindProv.getBinding().getHandlerChain();
		 
		 handlers.add(handler);
		 
		 bindProv.getBinding().setHandlerChain(handlers);
		
	}
	
//	public void disableAutomaticWSLog() {
//		setSystemWSProperty("false");
//	}
	
	private  void setSystemWSProperty(String s) {
		System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", s);
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", s);
		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", s);
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", s);
	}

	public WebServiceLogHandler getHandler() {
		return handler;
	}

	public void setHandler(WebServiceLogHandler handler) {
		this.handler = handler;
	}
}

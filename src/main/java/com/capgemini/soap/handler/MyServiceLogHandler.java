package com.capgemini.soap.handler;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class MyServiceLogHandler implements SOAPHandler<SOAPMessageContext> {

	// Logger	
	private static final Logger log = LoggerFactory.getLogger(MyServiceLogHandler.class);
	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		logMessage(context);
		return true;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		logMessage(context);
		return true;
	}

	private void logMessage(SOAPMessageContext smc) {
		// which log-level is best suited depends on your use-case
		if (log.isInfoEnabled()) {
			try {
				final String message = messageToString(smc);
				if (isOutboundMessage(smc)) {
					log.info("Outbound message : " + message);
				} else {
					log.info("Inbound message : " + message);
				}
			} catch (IOException e) {
				log.error("Exception in handler: " + e, e);
			} catch (SOAPException e) {
				log.error("Exception in handler: " + e, e);
			}
		}
	}

	private String messageToString(SOAPMessageContext smc) 
			throws SOAPException, IOException {

		final ByteArrayOutputStream baos = new ByteArrayOutputStream();
		smc.getMessage().writeTo(baos);
		return baos.toString();
	}

	private boolean isOutboundMessage(SOAPMessageContext smc) {
		final Boolean outboundProperty = 
				(Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if(outboundProperty != null) {
			return outboundProperty.booleanValue();
		} else {
			return false;
		}
	}

	@Override
	public void close(MessageContext context) {
	}

	@Override
	public Set<QName> getHeaders() {
		return Collections.emptySet();
	}
}
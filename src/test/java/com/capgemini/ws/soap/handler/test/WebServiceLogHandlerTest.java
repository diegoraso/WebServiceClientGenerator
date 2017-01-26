package com.capgemini.ws.soap.handler.test;

import static org.junit.Assert.fail;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import java.io.ByteArrayInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import com.capgemini.ws.soap.handler.WebServiceLogHandler;

@Ignore
@RunWith(MockitoJUnitRunner.class)
public class WebServiceLogHandlerTest {

	  @Mock private SOAPMessage message;

	    @Mock private SOAPEnvelope envelope;

	    @Mock private SOAPHeader header;

	    @Mock private SOAPPart part;



	    @Mock

	    private SOAPMessageContext context;



	    @Before

	    public void setup() throws SOAPException{

	        when( context.getMessage()).thenReturn(message);

	        when( message.getSOAPPart()).thenReturn(part);

	        when( part.getEnvelope()).thenReturn(envelope);

	        when( envelope.getHeader()).thenReturn(header);

	    }

	@Test
	public final void testHandleMessage() throws SOAPException {
		when( context.get(SOAPMessageContext.MESSAGE_OUTBOUND_PROPERTY)).thenReturn(false);



        when(header.getElementsByTagName(anyString())).thenAnswer(new Answer<NodeList>() {

            /* (non-Javadoc)

             * @see org.mockito.stubbing.Answer#answer(org.mockito.invocation.InvocationOnMock)

             */

            @Override

            public NodeList answer(InvocationOnMock invocation) throws Throwable {

                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

                DocumentBuilder db = dbf.newDocumentBuilder();

                Document doc = db.parse(new ByteArrayInputStream(new String("<wsa:MessageID>messageId</wsa:MessageID>").getBytes()));

                // TODO Auto-generated method stub

                return doc.getElementsByTagName("wsa:MessageID");

            }



        });

		WebServiceLogHandler handler = new WebServiceLogHandler();
		handler.handleMessage(context);
		//Assert.assertEquals(myMessageId, MDC.get("MyMessageID1"));
		

	}
	
	@Test
	public final void testHandleFault() {
		fail("Not yet implemented"); // TODO
	}
	@Test
	public final void testClose() {
		fail("Not yet implemented"); // TODO
	}
	@Test
	public final void testGetHeaders() {
		fail("Not yet implemented"); // TODO
	}

}

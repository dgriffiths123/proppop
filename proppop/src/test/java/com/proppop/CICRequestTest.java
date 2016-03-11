package com.proppop;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

import junit.framework.TestCase;

public class CICRequestTest extends TestCase { 

	private static final int SUCCESSFUL_RESONSE_OK = 200;
	
	public CICRequestTest() {
		super("CICRequestTest");
	}

	@Test
	public void testConnectionToGoogle() throws Exception{
		verifyConnection("http://www.google.com");
		verifyConnection("https://www.cicdata.info/xml.php");
	}

	private void verifyConnection(String googleURL) throws MalformedURLException, IOException {
		URL requestURL = new URL (googleURL);
        HttpURLConnection connection = null;
        connection = (HttpURLConnection) requestURL.openConnection ();
        
		assertEquals("incorrect connection response code?", SUCCESSFUL_RESONSE_OK, connection.getResponseCode());
		//COMMENT TO TEST COMMIT -> PUSH -> AUTO BUILD GENERATION.  attempt 32
	}
}

package demo;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiResource {
	
	private static final Logger LOG = LogManager.getLogger(RestApiResource.class.getName());
	
	@RequestMapping(value = "/elkdemo")
	public String helloWorld() {
		String response = "Hello user !- Message form Second Log App" + new Date();
		LOG.log(Level.INFO, "/elkdemo - > " + response);

		return response;
	}
	
	@RequestMapping(value = "/exception")
	public String exception() {
		String rsp = "";
		try {
			int i = 1 / 0;
			// should get exception
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(e);
			
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			String sStackTrace = sw.toString(); // stack trace as a string
			LOG.error("Exception As String from Log App - 2 :: - > "+sStackTrace);
			
			rsp = sStackTrace;
		}

		return rsp;
	}

}

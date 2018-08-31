package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import demo.MyService;

public class MyServiceImpl implements MyService {

	private static final Logger LOGGER = LoggerFactory.getLogger(MyServiceImpl.class);
	@Override
	public void doStuff(String value) {
		LOGGER.trace("doStuff needed more information - {}", value);
	    LOGGER.debug("doStuff needed to debug - {}", value);
	    LOGGER.info("doStuff took input - {}", value);
	    LOGGER.warn("doStuff needed to warn - {}", value);
	    LOGGER.error("doStuff encountered an error with value - {}", value);

	}

}

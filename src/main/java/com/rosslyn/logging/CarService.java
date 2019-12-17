package com.rosslyn.logging;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {

    private final Logger  log = LoggerFactory.getLogger(CarService.class);

    public void process(String input){
        //only if debug is enabled log the file specified
            log.debug("processing car:  {}" ,input);
    }
}

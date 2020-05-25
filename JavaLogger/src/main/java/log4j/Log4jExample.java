package log4j;

import org.apache.log4j.Logger;

public class Log4jExample {
    final static Logger logger = Logger.getLogger(Log4jExample.class);

    public static void main(String[] args) {

        Log4jExample obj = new Log4jExample();
        obj.runMe("Sadman");

    }

    private void runMe(String parameter){

        if(logger.isDebugEnabled()){
            logger.debug("This is debug : " + parameter);
        }

        if(logger.isInfoEnabled()){
            logger.info("This is info : " + parameter);
        }

        logger.warn("This is warn : " + parameter);
        logger.error("This is error : " + parameter);
        logger.fatal("This is fatal : " + parameter);
    }
}

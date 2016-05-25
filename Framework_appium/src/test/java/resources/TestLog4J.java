package resources;

import libraries.utility.Common;
import libraries.utility.Utilities;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Created by User on 5/24/2016.
 */



public class TestLog4J {
//    public static final Log log = LogFactory.getLog(TestLog4J.class.getName());
//    public static final Logger log = Logger.getRootLogger();

    public static final Logger log = Logger.getLogger(Common.getClassName().toString());
    public static void main(String[] args) {
        /**
         * To point out specific log4j.properties for config structure framework
         */
        PropertyConfigurator.configure("src/main/config/log4j.properties");
        if(log.isDebugEnabled()){
            System.out.println("Đây là chế độ debug");
        } else if(log.isInfoEnabled()){
            System.out.println("Đây là chế độ info");
        }
        log.debug("DEBUG Log4j configuration is successful");
        log.error("ERROR Log4j configuration is successful");
        log.warn("WARN Log4j configuration is successful");
        log.info("INFO Log4j configuration is successful");

        System.out.println(Common.getClassName());
    }

}








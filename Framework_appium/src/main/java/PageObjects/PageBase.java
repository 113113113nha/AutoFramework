package PageObjects;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Created by User on 5/25/2016.
 */
public class PageBase {
    public static Logger log = Logger.getLogger("toLog");

    public PageBase() {
        PropertyConfigurator.configure("src/main/config/log4j.properties");
    }
}

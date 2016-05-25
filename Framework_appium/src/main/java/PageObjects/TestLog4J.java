package PageObjects;

import org.testng.annotations.Test;

/**
 * Created by User on 5/25/2016.
 */

public class TestLog4J extends PageBase {
    @Test
    public void testchoi() {
            print();
    }

    public static void print(){
        log.debug("Test config log for test");
    }
}


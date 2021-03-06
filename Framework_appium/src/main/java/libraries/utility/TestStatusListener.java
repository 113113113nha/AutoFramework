package libraries.utility;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

/**
 * Created by User on 5/10/2016.
 */
public class TestStatusListener extends TestListenerAdapter {

    private int count = 1;

    @Override
    public void onTestSuccess(final ITestResult tr) {
        logTestResultToConsole("PASSED", tr);
    }

    @Override
    public void onTestFailure(final ITestResult tr) {
        logTestResultToConsole("FAILED", tr);
    }

    private void logTestResultToConsole(final String testStatus, final ITestResult tr) {
        Common.logInfo(String.format("%s - Test script #%d: %s", testStatus, count++, tr.getMethod().getMethodName()));
    }

}

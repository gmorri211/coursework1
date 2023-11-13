package convertor;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.logging.Logger;

public class TestRunner {

    private static final Logger log = Logger.getLogger(TestRunner.class.getName());

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Dec2HexTest.class);
        int fails = 0;
        try{
            for (Failure failure : result.getFailures()) {
                log.info(failure.toString());
                fails++;
            }
            if(fails >0)
                throw  new IllegalArgumentException();
            log.info(String.valueOf(result.wasSuccessful()));
        }
        catch(Exception e)
        {
            String failMsg = "" + fails + " tests failed";
            log.info(failMsg);
            System.exit(1);
        }
        System.exit(0);
    }
}

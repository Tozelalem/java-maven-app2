// Java simple test script
import com.example.Application;
import org.junit.Test;
import static org.junit.Assert.*;
// add more comment here
public class AppTest {

    @Test
    public void testApp() {
        Application myApp = new Application();

        String result = myApp.getStatus();

        assertEquals("OK", result);
    }

}

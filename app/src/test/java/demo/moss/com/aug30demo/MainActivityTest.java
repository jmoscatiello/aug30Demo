package demo.moss.com.aug30demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by josephmoscatiello1 on 16-08-13.
 */

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {


    @Test
    public void testTakeScreenshot() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);

        assertNotNull(activity);

        //onView(withId(R.id.fab)).perform(click());

        //Screengrab.screenshot("afterFabClick");
    }

}

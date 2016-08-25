package demo.moss.com.aug30demo;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import tools.fastlane.screengrab.Screengrab;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;



/**
 * Created by josephmoscatiello1 on 16-08-13.
 */

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class MainActivityTest {

    MainActivity activity;

    @Before
    public void setup() {
        // Convenience method to run MainActivity through the Activity Lifecycle methods:
        //onCreate(...) => onStart() => onPostCreate(...) => onResume()
        activity = Robolectric.setupActivity(MainActivity.class);
    }

    @Test
    public void shouldHaveHappySmiles() throws Exception {
        String hello = activity.getResources().getString(
                R.string.world);
        assertThat(hello, equalTo("Hello World"));
    }

    @Test
    public void testTakeScreenshot() {

        //assertNotNull(activity);

        //onView(withId(R.id.fab)).perform(click());

        //Screengrab.screenshot("afterFabClick");
    }

}

package demo.moss.com.aug30demo;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import tools.fastlane.screengrab.Screengrab;

/**
 * Created by josephmoscatiello1 on 16-08-13.
 */

@RunWith(AndroidJUnit4.class)
@SmallTest
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testTakeScreenshot() {
       // onView(withId(R.id.greeting)).check(matches(isDisplayed()));

        Screengrab.screenshot("beforeFabClick");

        //onView(withId(R.id.fab)).perform(click());

        Screengrab.screenshot("afterFabClick");
    }

}

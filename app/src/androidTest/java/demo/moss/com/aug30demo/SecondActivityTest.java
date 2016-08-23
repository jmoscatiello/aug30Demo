package demo.moss.com.aug30demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import tools.fastlane.screengrab.Screengrab;

/**
 * Created by josephmoscatiello1 on 16-08-20.
 */
@RunWith(RobolectricTestRunner.class)
public class SecondActivityTest {

    @Test
    public void titleIsCorrect() throws Exception {
        SecondActivity activity = Robolectric.setupActivity(SecondActivity.class);

        Screengrab.screenshot("beforeFabClick");

        //uuassertTrue(activity.getTitle().toString().equals("Deckard"));
    }
}

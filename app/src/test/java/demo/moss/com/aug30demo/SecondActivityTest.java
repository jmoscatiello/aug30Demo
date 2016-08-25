package demo.moss.com.aug30demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by josephmoscatiello1 on 16-08-20.
 */
@RunWith(RobolectricTestRunner.class)
public class SecondActivityTest {

    @Test
    public void titleIsCorrect(){
        SecondActivity activity = Robolectric.setupActivity(SecondActivity.class);

        assertNotNull(activity);

        //Screengrab.screenshot("beforeFabClick");

        //assert(activity.getTitle().toString().equals("Deckard"));
    }
}

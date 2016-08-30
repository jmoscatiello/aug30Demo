import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import demo.moss.com.aug30demo.R;
import demo.moss.com.aug30demo.SecondActivity;

import static junit.framework.Assert.assertNotNull;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by josephmoscatiello1 on 16-08-20.
 */
@RunWith(RobolectricTestRunner.class)
public class SecondActivityTest {

    SecondActivity activity;

    TextView secondText;

    @Before
    public void setup() {
        // Convenience method to run MainActivity through the Activity Lifecycle methods:
        // onCreate(...) => onStart() => onPostCreate(...) => onResume()
        activity = Robolectric.setupActivity(SecondActivity.class);

        secondText = (TextView) activity.findViewById(R.id.text_second);
    }

    @Test
    public void titleIsCorrect(){

        assertNotNull(secondText);

        assertThat(secondText.getText().toString(), equalTo("Second Screen"));
    }
}

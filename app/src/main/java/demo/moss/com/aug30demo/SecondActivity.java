package demo.moss.com.aug30demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by erc774 on 8/23/16.
 */

public class SecondActivity extends Activity {

    Button button;

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        text = (TextView) findViewById(R.id.text);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeText();
            }
        });
    }

    public void changeText(){

        String textValue = text.getText().toString();

        if(textValue.equalsIgnoreCase(getString(R.string.world)))
            text.setText(getString(R.string.universe));
        else
            text.setText(getString(R.string.world));
    }
}

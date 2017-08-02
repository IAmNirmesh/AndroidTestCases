package rahul.nirmesh.androidtestcases;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;

/**
 * Created by N I R M E S H on 2017-08-01.
 */

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 26)
public class MainActivityTest {

    MainActivity activity;
    EditText firstNumber, secondNumber;
    TextView addResult;
    Button btnAdd;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
        firstNumber = (EditText) activity.findViewById(R.id.txtNumber1);
        secondNumber = (EditText) activity.findViewById(R.id.txtNumber2);
        addResult = (TextView) activity.findViewById(R.id.txtResult);
        btnAdd = (Button) activity.findViewById(R.id.btnAdd);
    }

    @Test
    public void testMainActivityAddition() {
        // setup
        firstNumber.setText("12.2");
        secondNumber.setText("13.3");

        // test
        btnAdd.performClick();

        // verify
        assertEquals(25.5, Double.parseDouble(addResult.getText().toString()), 0.0);
    }
}

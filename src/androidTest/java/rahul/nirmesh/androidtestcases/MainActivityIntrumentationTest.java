package rahul.nirmesh.androidtestcases;

import android.support.test.annotation.UiThreadTest;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by N I R M E S H on 2017-08-02.
 */

public class MainActivityIntrumentationTest
        extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity activity;
    EditText firstNumber, secondNumber;
    TextView addResult;
    Button btnAdd;

    public MainActivityIntrumentationTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        setActivityInitialTouchMode(true);

        activity = getActivity();
        firstNumber = (EditText) activity.findViewById(R.id.txtNumber1);
        secondNumber = (EditText) activity.findViewById(R.id.txtNumber2);
        addResult = (TextView) activity.findViewById(R.id.txtResult);
        btnAdd = (Button) activity.findViewById(R.id.btnAdd);
    }

    @UiThreadTest
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

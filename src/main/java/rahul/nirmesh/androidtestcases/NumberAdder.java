package rahul.nirmesh.androidtestcases;

import android.support.annotation.VisibleForTesting;

/**
 * Created by N I R M E S H on 2017-08-01.
 */

public class NumberAdder {

    private final MainActivity mMainActivity;

    public NumberAdder(MainActivity activity) {
        mMainActivity = activity;
    }

    public void performAddition() {

        double number1 = mMainActivity.getFirstNumber();
        double number2 = mMainActivity.getSecondNumber();

        if(!isNumberValid(number1) || !isNumberValid(number2)) {
            throw new RuntimeException("invalid numbers");
        }

        double result = number1 + number2;

        mMainActivity.setAdditionResult(result);
    }

    @VisibleForTesting
    boolean isNumberValid(double number) {

        if(number > 0) {
            return true;
        } else {
            return false;
        }
    }
}

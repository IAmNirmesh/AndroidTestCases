package rahul.nirmesh.androidtestcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.*;

/**
 * Created by N I R M E S H on 2017-08-01.
 */

@RunWith(MockitoJUnitRunner.class)
public class NumberAdderTest {

    @Mock
    MainActivity mMockMainActiviy;

    @Test
    public void testIsNumberValid() {
        // setup

        // test
        NumberAdder numberAdder = new NumberAdder(mMockMainActiviy);
        assert (numberAdder.isNumberValid(55.0));
    }

    @Test
    public void testIsNumberNotValid() {
        // setup

        // test
        NumberAdder numberAdder = new NumberAdder(mMockMainActiviy);
        assertFalse(numberAdder.isNumberValid(-55.0));
    }

    @Test
    public void testPerformAddition() {
        // setup
        when(mMockMainActiviy.getFirstNumber()).thenReturn(10.0);
        when(mMockMainActiviy.getSecondNumber()).thenReturn(11.0);

        // test
        NumberAdder numberAdder = new NumberAdder(mMockMainActiviy);
        numberAdder.performAddition();

        // verify
        verify(mMockMainActiviy).setAdditionResult(21.0);
    }
}

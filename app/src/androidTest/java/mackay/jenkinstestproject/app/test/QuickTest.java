package mackay.jenkinstestproject.app.test;

import android.os.SystemClock;
import android.test.ActivityInstrumentationTestCase2;

import mackay.jenkinstestproject.app.MainActivity;

/**
 * Created by bqmackay on 5/17/14.
 */
public class QuickTest extends ActivityInstrumentationTestCase2<MainActivity>{

    public QuickTest() {
        super("mackay.jenkinstestproject.app.test", MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testName() throws Exception {
        SystemClock.sleep(2000);
        assertTrue(false);
    }
}

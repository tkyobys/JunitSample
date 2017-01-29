package helper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestStringHelper.class,
		TestValidateHelper.class,
		TestCalculateHelper.class})
public class TestSuiteHelper {

}

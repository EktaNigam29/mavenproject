package utility_packages;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer

{
	int current_count=0;
    int retry_count=1;

	public boolean retry(ITestResult result) {
		
		if(current_count<retry_count)
		{
			current_count++;
			return true;
		}
		
		return false;//I will not retry the Testcases return True means I will not retry the Testcases 
	}

}

package commonmethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShot extends TestBase{
	
	
	public static void scshot() throws IOException {
		
		File scnfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(scnfile, new File("‪D:\\rawedit\\error123.png"));
		
	}
		

}

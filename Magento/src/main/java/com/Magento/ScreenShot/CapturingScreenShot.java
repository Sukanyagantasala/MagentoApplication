package com.Magento.ScreenShot;

import java.io.File;
import com.Magento.Browser.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CapturingScreenShot extends Browser{
	
//	Method for Capturing the Screen Shot
	public static String screenShot(String name) throws Exception{
		String path=null;
		try
		{
			TakesScreenshot screenshot=((TakesScreenshot)driver);
			File source=screenshot.getScreenshotAs(OutputType.FILE);
			 path=System.getProperty("user.dir")+ "\\target\\ScreenShot\\"+name+".png";
			File destination=new File(path);
	//		FileUtils.copyFile(source,destination);
			source.renameTo(destination);
			
		}
		catch(Exception e)
		{
			System.out.println("During Screenshot");
		}
		return path;
	}

}

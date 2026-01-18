package com.utilities;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.Base.BaseClass;

public class Screenshots extends BaseClass {
	static void getInstance(String name) throws Exception {
		String path = System.getProperty("user.dir") +"//ScreenShots"+name+".png";
		TakesScreenshot tks = (TakesScreenshot)driver;
		File source = tks.getScreenshotAs((OutputType.FILE));
		
		File target = new File(path);
		
		FileHandler.copy(source, target);
	}

}

package com.ss.selinium.library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReaderrr {
	
	Properties pro;
	
	
	
	public ConfigReaderrr() {
		File src = new File("./Configuration/Config.property");
		FileInputStream fis;
		try {
			fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			pro.setProperty("browser", "chrome");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String getURL() {
		return pro.getProperty("URL");
	}
	
	public String getChromePath() {
		return pro.getProperty("ChromePath");
	}
	
	public String getFirefoxPath() {
		return pro.getProperty("FirefoxPath");
	}
	
	public String getAdminUsername() {
		return pro.getProperty("AdminUserName");
	}
	
	public String getAdminPassword() {
		return pro.getProperty("AdminPassword");
	}

}
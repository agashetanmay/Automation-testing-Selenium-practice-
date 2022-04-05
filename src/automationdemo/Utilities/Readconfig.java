package automationdemo.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig{
	Properties pro;
	
	public Readconfig() {
		File src = new File("C:\\Users\\Tanmay\\eclipse-workspace\\ACSA9\\configration\\config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		   } catch (Exception e) {
			   System.out.println(e.getMessage());
		   }
		}
	    public  String baseurl() {
	    	 String url = pro.getProperty("url");
	    	return url;
	    }
	    public String firstname() {
	    	String firstname =pro.getProperty("firstname");
	    	return firstname;
	    }
	    public String lastname() {
	    	String lastname =pro.getProperty("lastname");
	    	return lastname;
	    }
	}


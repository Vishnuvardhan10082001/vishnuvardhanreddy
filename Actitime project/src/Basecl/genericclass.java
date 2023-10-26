package Basecl;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class genericclass {
	public   String property(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/comman.praperty.txt");
		Properties p1=new Properties();
		p1.load(fis);
		String usn=p1.getProperty(key);
		return usn;
		
		
	
		
	    
	}

}

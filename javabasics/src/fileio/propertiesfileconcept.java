package fileio;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class propertiesfileconcept {

	public static void main(String[] args) throws Exception {
		String userdir= System.getProperty("user.dir");
		 String fileseparator=System.getProperty("file.separator");
	String filepath=userdir+fileseparator+"files"+fileseparator+"properiesfile.properties.txt";
 System.out.println(filepath);
 
 FileInputStream fileinput=new FileInputStream(filepath);
 Properties prop=new Properties();
 prop.load(fileinput);
System.out.println( prop.get("username"));
	}

}

package fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class readfile {

	public static void main(String[] args) throws IOException {
	String userdir=	System.getProperty("user.dir");
	System.out.println(userdir);
	String fileseparetor=System.getProperty("file.separator");
	String filePath=userdir+fileseparetor+"files"+fileseparetor+"readfile.text.txt";
FileReader filereader=new FileReader(filePath);
       BufferedReader bufferedreader=new BufferedReader(filereader);
       FileWriter filewriter=new FileWriter("C:\\Users\\CKAMB\\eclipse-workspace\\eclips\\javabasics\\files\\write1.txt");
       BufferedWriter bufferedwriter=new BufferedWriter(filewriter);
      // System.out.println(bufferedreader.readLine());
      // System.out.println(bufferedreader.readLine());
       
       
 String str;

while((str=bufferedreader.readLine()) != null) {
	 System.out.println(str);
	 
 }



}
}
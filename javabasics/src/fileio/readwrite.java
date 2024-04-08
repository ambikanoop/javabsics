package fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class readwrite {

	public static void main(String[] args) throws IOException {
		FileInputStream r =new FileInputStream("C:\\Users\\CKAMB\\eclipse-workspace\\eclips\\javabasics\\files\\readfile.text.txt");
     FileOutputStream f=new FileOutputStream("C:\\Users\\CKAMB\\eclipse-workspace\\eclips\\javabasics\\files\\write1");
    int i;
    while((i=r.read())!=-1) {
    	
    
     f.write((char)i);
     
	}
	System.out.println("data  copied");
	

}}

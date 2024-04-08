package fileio;

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;

public class writefile {

	public static void main(String[] args) throws IOException {
		String userdir=System.getProperty("user.dir");
		String fileseparator=System.getProperty("file.separator");
		String filepath=userdir+fileseparator+"files"+fileseparator+"write.text.txt";
        System.out.println(filepath);
        FileWriter filewriter=new FileWriter(filepath);
        BufferedWriter bufferedwriter=new BufferedWriter(filewriter);
        bufferedwriter.write("hi i am learning java");
        bufferedwriter.write("\n");
        bufferedwriter.write("All the best");
        bufferedwriter.close();
	}

}

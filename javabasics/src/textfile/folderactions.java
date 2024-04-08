package textfile;

import java.io.File;

public class folderactions {
   //create folder  
	
	public static void CreateFolder(String folderpath) {
		
		File folder=new File(folderpath); 
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("folder created"+folderpath);
		}
	}
	
	//rename a folder
	public static void renamefolder(String oldPath,String newPath) {
		File oldfolder=new File(oldPath);
		File newfolder=new File(newPath);
		if(oldfolder.exists()) {;
			oldfolder.renameTo(newfolder);
			System.out.println("folder renamed to"+newPath);
		}
		
	}
	
	public static void main(String[] args) {
		String folderpath="C:\\myfiles";
		CreateFolder(folderpath);
		String newfolder="C:\\myfiles1";
		renamefolder(folderpath,newfolder);
	}

}

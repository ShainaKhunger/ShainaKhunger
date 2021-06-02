package fileHandling;

import java.io.File;

public class FileUtility {

	public static void main(String[] args) {
		
		String dirname = "/tmp/user/java/Sk";
		
		File fileobj = new File(dirname);
		fileobj.mkdirs();
		
		
		String dir = "/Important";
		File obj = new File(dir);
		
		obj.mkdir();

	}

}

//叼泛配府, 颇老 积己窍扁
package step08.test3;

import java.io.File;
import java.io.IOException;

public class TestMakeDirAndFile {
	public static void main(String[] args) {
		//叼泛配府 积己 棺 颇老 积己 抛胶飘
		String dirPath="c:"+File.separator+"kosta238"+File.separator+"iotest"+File.separator+"test";
		File dir=new File(dirPath);
		if(dir.isDirectory()==false) {
			dir.mkdirs(); //颇老 积己凳
		}
		File file=new File(dirPath+File.separator+"ok.mp3");
		if(file.isFile()==false) {
			try {
				file.createNewFile();
				System.out.println("颇老积己");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

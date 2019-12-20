import java.io.File;

public class CleanMvn {

	public static void main(String[] args){
		    //ָMAVEN路径
	        File f=new File("F:\\MAVEN\\repository");
	        findAndDelete(f);
	    }

	public static boolean findAndDelete(File file) {
		if (!file.exists()) {
		} else if (file.isFile()) {
			if (file.getName().endsWith("lastUpdated")) {
				deleteFile(file.getParentFile());
				return true;
			}
		} else if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				if (findAndDelete(f)) {
					break;
				}
			}
		}
		return false;
	}

	public static void deleteFile(File file) {
		if (!file.exists()) {
		} else if (file.isFile()) {
			print("删除:" + file.getAbsolutePath());
			file.delete();
		} else if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				deleteFile(f);
			}
			print("删除:" + file.getAbsolutePath());
			print("====================================");
			file.delete();
		}
	}

	public static void print(String msg) {
		System.out.println(msg);
	}
}


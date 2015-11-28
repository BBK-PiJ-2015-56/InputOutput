import java.io.*;

public class FileUtilitiesImpl{
	public static void main(String[] args){
		FileUtilitiesImpl fu = new FileUtilitiesImpl();
		fu.launch();
	}
	
	public void launch(){
		this.filesInCurrent();
	}
	
	public void filesInCurrent(){
		File f = new File(".");
		String[] fileList = f.list();
		for(int i = 0; i< fileList.length; i++){
			System.out.println(fileList[i]);
		}
	}
	
	
}
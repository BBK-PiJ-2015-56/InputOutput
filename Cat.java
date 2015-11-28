import java.io.*;

public class Cat{
	public static void main(String[] args){
		File f = new File(args[0]);
		System.out.println(f.getAbsolutePath());
		if (f.exists()){
			if (f.isFile()){
				try (BufferedReader in = new BufferedReader(new FileReader(f))){
					String line;
					while ((line = in.readLine()) != null){
						System.out.println(line);
					}
				}
				catch(FileNotFoundException ex){
					System.out.println("File" + f + " no longer found");
				}
				catch(IOException ex){
					ex.printStackTrace();
				}
				
			}
			else{
				String[] fileList = f.list();
				for(String fileName : fileList){
					System.out.println(fileName);
				} 
			}
		}
		else{
			System.out.println("This file or directory cannot be found.");
		}
	}
}
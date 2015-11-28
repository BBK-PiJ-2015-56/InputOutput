import java.io.*;

//q) It copied one line to asecondfile, and then it didn't copy anything to athirdfile!

/**
* This program copies a file onto another file
*/
public class CP{
	public static void main(String[] args) 
				throws FileNotFoundException, IOException{ 
				// Q) so you always need to declare the checked exceptions all the way up trace??
		CP cp = new CP();
		String originalFile = args[0];
		String anotherFile = args[1];
		cp.launch(originalFile , anotherFile);
	}
	
	public void launch(String firstFile , String secondFile) 
	            throws FileNotFoundException, IOException{ 
		
		File file1 = new File(firstFile);
		File file2 = new File(secondFile);
		this.copyFile(file1 , file2);
		
		//case where file1 exists
		if(file1.exists()){                      
		// Is there any point in using exists(), given that we have the exceptions in the copyFile method anyway?
			if(!file2.exists()){
				this.copyFile(file1, file2);	
			}
			else{
				System.out.println("The file " + file2 + "already exists. ");
				System.out.println("Press enter to overwrite, or C to cancel");
				//create reader and read answer
				String answer = //next line
				if (answer == ""){
					cp.copyFile(file1 , file2);
				}
				else;
			}	
			}
			else;
		}
		
		//case where file1 does not exist
		else{
			System.out.println("The file   " + file1 + "   cannot be found.");
		}
		
		
	}
	/**
	* This copies a readable file to another file.
	*/
	private void copyFile(File a , File b) throws FileNotFoundException, IOException {  
		try(BufferedReader in = new BufferedReader(new FileReader(a));
			PrintWriter out = new PrintWriter(b)){
				
			String line;
			while((line = in.readLine()) != null){
				out.write(line);
				System.out.println();
				out.flush();                 //Q) Is this in correct place? what does it do?
			}
		}catch(FileNotFoundException ex){
			System.out.println("File " + a + " really does not exist."); 
			// Q) How do I have a separate IO exception if file b has IO error? or is not found?
		}catch(IOException ex){
			ex.printStackTrace();
		}
	
	}
	
}

// Tests: 
//a new file - yes but not sep lines
//an existing blank file - yes but not sep lines
//an existing file with content - yes it wipes over the existing file!!
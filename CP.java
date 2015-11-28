import java.io.*;
import java.util.Scanner;

//q) It copied one line to asecondfile, and then it didn't copy anything to athirdfile!

/**
* This program copies a file onto another file
*/
public class CP{
	public static void main(String[] args){
				//throws FileNotFoundException, IOException{ 
				// Q) so you always need to declare the checked exceptions all the way up trace??
		CP cp = new CP();
		String originalFile = args[0];
		String anotherFile = args[1];
		cp.launch(originalFile , anotherFile);
	}
	
	public void launch(String firstFile , String secondFile){
	            //throws FileNotFoundException, IOException{ 
		
		File file1 = new File(firstFile);
		File file2 = new File(secondFile);
	                     
		// No point in using file1.exists(), given that we have the exceptions in the copyFile method anyway?
			if(!file2.exists()){
				this.copyFile(file1, file2);	
			}
			else{
				System.out.println("The file " + file2 + " already exists. ");
				System.out.println("Press enter to overwrite, or any other key to cancel");
				Scanner scanner = new Scanner(System.in);   // could use buff reader here also
				String answer = scanner.nextLine();
				System.out.println(answer);
				if (answer.equals("")){
					System.out.println("You have pressed: enter");
					this.copyFile(file1 , file2);
				}
				else{
					System.out.println("Your request has been cancelled");
				}
			}	
	}
		
	/**
	* This copies a readable file to another file.
	*/
	private void copyFile(File a , File b)  {   
	// no need to throw as it is caught here. I think if I do write throws... then that will take it as being another exception, that is not 
	//caught, and therefore I will need to write throws in the calling methods too - unless if I catch it up there.
		try(BufferedReader in = new BufferedReader(new FileReader(a));
			PrintWriter out = new PrintWriter(b)){
				
			String line;
			while((line = in.readLine()) != null){
				out.write(line);
				System.out.println();
				out.flush();                 //Q) Is this in correct place? what does it do?
			}
		}catch(FileNotFoundException ex){
			System.out.println("File " + a + " does not exist."); 
			// Q) How do I have a separate IO exception if file b has IO error? ie not found due to connection issue?
		}catch(IOException ex){
			ex.printStackTrace();
		}
	
	}
	
}
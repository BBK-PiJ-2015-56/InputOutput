public class TempAverages{
	public static void main(String[] args) throws FileNotFoundException, IOException{
		TempAverages t = new TempAverages();
		t.launch();
	}
	
	public void launch() throws FileNotFoundException, IOException{
		File f = new File("CelciusNumbers");
		try(BufferedReader in = new BufferedReader(new FileReader(f))){
			String line;
			while((line = in.readLine()) != null){
				// 1.create list arrayList;
				//2. first create substring from pos 0 to first comma.
				//3. Then while charAt each place == ,  create a new substring from prev comma+1  to this comma.
				//4. Then for each substring, parseInt and add it to the array. 
				//5. find total number of ints and average.
				//6. repeat 1-5 for each line
				//7. add (total x average)/ sum of totals    to get overall average;
			
			}
		}
		
	}
}
import java.util.Scanner;

public class ScannerTest{
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter yes or no");
		String answer = s.nextLine();
		System.out.println("You entered: " + answer);
		if(answer.equals("yes")){
			System.out.println("Your answer equals yes");
		}
		else{
			System.out.println("Your answer was not yes");
		}
	}
}
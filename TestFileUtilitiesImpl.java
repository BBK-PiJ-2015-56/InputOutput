import org.junit.*;
import static org.junit.Assert.*;

public class TestFileUtilitiesImpl{
	
	
	@Test
	public void testsfilesInCurrent(){
		//Q) do we need try-catch in tests aswell? 
		// How do exceptions relate to tests?
		File input = new File(".");
		String[] output = f.list();
		String[] expected;
		AssertEquals();
	}
}
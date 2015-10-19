import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	
public class HelloUser {
	
	public static void greetUser(){
	
		System.out.println("Please enter your name: ");
		try{
		    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		    String username = bufferRead.readLine();
		      
		    System.out.println("Hello " + username +"!");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
}

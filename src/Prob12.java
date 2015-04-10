import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Prob12
	{

	public static void main(String[] args) throws IOException
		{
		Scanner file = new Scanner( new File( "Prob12.in.txt" ) );
	    String str ="";
	    while(file.hasNextLine())
	    	{
	    	str.concat(file.nextLine());
	    	}
	   }

		

	}

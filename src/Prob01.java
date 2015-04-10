import java.util.*;
import java.io.*;

public class Prob01
	{

	public static void main(String[] args) throws IOException
		{
		      Scanner file = new Scanner( new File( "Prob01.in.txt" ) );
		      int numberOfLinesOfData = file.nextInt();      
		      file.nextLine();
		      for( int i = 0; i < numberOfLinesOfData; i++ )
		      {
		         int mine = file.nextInt();
		         if(mine%3==0&&mine%7==0)
		        	 {
		        	 System.out.println("CODEQUEST");
		        	 }
		         else if(mine%3==0)
		        	 {
		        	 System.out.println("CODE");
		        	 }
		         else if(mine%7==0)
		        	 {
		        	 System.out.println("QUEST");
		        	 }
		         else
		        	 {
		        	 System.out.println(mine);
		        	 }
		         
		      }
		   }

		

	}

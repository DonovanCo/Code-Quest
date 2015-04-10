import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Prob12
	{

	public static void main(String[] args) throws IOException
		{
		Scanner file = new Scanner( new File( "Prob12.in.txt" ) );
	    String str ="";
	    int count = 0;
	    ArrayList<Integer> spacing = new ArrayList<Integer>();
	    int lastSize=0;
	   
	    while(file.hasNextLine())
	    	{
	    	str+=file.nextLine();
    		System.out.println(str);
	    	spacing.add(str.length()-lastSize);
	    	lastSize=str.length();
	    	}
	    int rowNum=0;
	    for(int i = str.length()-2; i>=0; i--)
	    	{
	    	if(str.substring(i,i+1).equals("X")&&str.length()%i==0)
	    		{
	    		rowNum=(str.length()-1)-i;
	    		}
	    	break;
	    	}
	    
	    String[][] scytale = new String[rowNum][(str.length()/rowNum)];
	    for(int x = 0; x<scytale[0].length; x++)
	    	{
	    	for(int y = 0; y<scytale.length; y++)
	    		{
	    		
	    		}
	    	}
	   }

		

	}

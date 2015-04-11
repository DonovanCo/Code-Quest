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
	    	spacing.add(str.length()-lastSize);
	    	lastSize=str.length();
	    	}
//	    System.out.println(str);
	    int rowNum=0;
	    String last=str.substring(0, str.length()-1);
	    int xLoc=last.lastIndexOf("X");
	    rowNum=(str.length()-1)-xLoc;
//	    System.out.println(rowNum);
	    String[][] scytale = new String[rowNum][(str.length()/rowNum)];
	    int ind = 0;
	    for(int x = 0; x<scytale[0].length; x++)
	    	{
	    	for(int y = 0; y<scytale.length; y++)
	    		{
	    		scytale[y][x]=str.substring(ind, ind+1);
	    		ind++;
	    		}
	    	}
	    String aftScy="";
	    for(int a = 0; a<scytale.length; a++)
	    {
	    	for(int b = 0; b<scytale[0].length; b++)
	    	{
	    		aftScy+=scytale[a][b];
	    	}
	    }
	    int lastX=str.length()-1;
	    for(int k = aftScy.length(); k>=0; k--)
	    {
	    	if(!aftScy.substring(k-1, k).equals("X"))
	    	{
	    		lastX=k;
	    		break;
	    	}
	    }
	    String temp = aftScy.substring(0, lastX);
	    aftScy=temp;
//	    System.out.println(aftScy);
	    int shift = 6;
//	    System.out.println();
	    char[] bob = aftScy.toCharArray();
	    for(int c = 0; c<bob.length-3; c++)
	    {
	    	if((bob[c+1]-33)==bob[c]&&(bob[c+2]-29)==bob[c]&&(bob[c+3]-46)==bob[c])
	    	{
	    		shift=(bob[c]-68);
	    	}
	    }
//	    System.out.println(shift);
	    for(int fred = 0; fred<bob.length; fred++)
	    {
	    	if(97<=bob[fred]&&bob[fred]<=102)
	    	{
	    		bob[fred]+=26;
	    	}
	    	if(65<=bob[fred]&&bob[fred]<=70)
	    	{
	    		bob[fred]+=26;
	    	}
	    	bob[fred]=(char) (bob[fred]-6);
//	    	System.out.print(bob[fred]);
	    }
//	    System.out.println();
//	    System.out.println();
	    int total = 0;
    	int jeff = 0;
    	for(int h = 0; h<bob.length; h++)
    	{
    		if(h==(total+spacing.get(jeff)))
    		{
    		System.out.println();
    		total+=spacing.get(jeff);
    		jeff++;
    		}
    		System.out.print(bob[h]);
    	}
	   }
	}
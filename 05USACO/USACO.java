import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class USACO{
    //Here is the bronze problem, Cows make a lake by stomping
    public static int bronze(String filename){
		int row,column,elev,instruct;
		//mr K why are you so smart
		//Big thanks to mr K for the scanner, try catch thing
		Scanner in1 = null;
		try{
			File file = new File(filename);
			in1 = new Scanner(file);
		}
		catch(Exception e){
			System.out.println("Something went wrong. Exiting...");
			System.exit(0);
		}
		Scanner ln1 = new Scanner(in1.nextLine()).useDelimiter("\\s");
		row = ln1.nextInt();
		column = ln1.nextInt();
		elev = ln1.nextInt();
		instruct = ln1.nextInt();
		System.out.println(row);
		return 3;
		
    }
    
    //This is the end of the bronze problem code
    //Here is the silver problem
    public int silver(String filename){
		return 3;
	}
	public static void main(String[] args){
		USACO.bronze("makelake.in");
	}
    //End of the silver
}

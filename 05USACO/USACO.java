import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.io.File;

public class USACO{
    //Here is the bronze problem, Cows make a lake by stomping
    public static int bronze(String filename){
		boolean debug = false;
		int[][] field;
		int row,column,height,instruct;
		Scanner in1 = null;
		//mr K why are you so smart
		//Big thanks to mr K for the scanner, try catch thing
		
		try{
			File file = new File(filename);
			in1 = new Scanner(file);
		}
		catch(Exception e){
			System.out.println("Something went wrong. Exiting...");
			System.exit(0);
		}
		
		Scanner lnPar = new Scanner(in1.nextLine()).useDelimiter("\\s");
		row = lnPar.nextInt();
		column = lnPar.nextInt();
		height = lnPar.nextInt();
		instruct = lnPar.nextInt();
		
		field = new int[row][column];
		for (int i=0;i<row;i++){
			lnPar = new Scanner(in1.nextLine()).useDelimiter("\\s");
			for (int j=0;j<column;j++){
				field[i][j] = lnPar.nextInt();
			}
		}
			//^This boord method is fairly useful^
		//Here is the part where we stomp
		int r=0;
		int c=0;
		int d=0;
		//System.out.println(boord(field));
		for (int i=0;i<instruct;i++){
			lnPar = new Scanner(in1.nextLine()).useDelimiter("\\s");
			r = lnPar.nextInt()-1;
			c = lnPar.nextInt()-1;
			d = lnPar.nextInt();
			stomp(field, r, c, d);
			//System.out.println(boord(field));
			
		}
		//Now lets calculate it!
		int aggh = 0;
		for (int i=0; i<field.length; i++){
			for (int j=0; j<field[i].length; j++){
				if (field[i][j]<height){
					aggh+=height-field[i][j];
				}
			}
		}
		if(debug){
			System.out.println(""+row+","+column);
			System.out.println(boord(field));
			System.out.println(""+r+","+c);
			//^This boord method is fairly useful^
		}
		
		return aggh*72*72;
		
    }
	
	private static int[][] stomp(int[][] board, int row, int col, int dep)
	{
		//yikes this is gonna be ugly
		int[] lis = {board[row][col],board[row][col+1],board[row][col+2],
					board[row+1][col],board[row+1][col+1],board[row+1][col+2],
					board[row+2][col],board[row+2][col+1],board[row+2][col+2]};
		int max = 0;
		int maxLoc = 0;
		for (int i = 0; i<lis.length; i++){
			if (lis[i] > max){
				max = lis[i]+0;
				maxLoc = i;
			}
		}
		for (int i=0; i<lis.length; i++){
			lis[i] = dep-(max-lis[i]);
			if (lis[i]<0){
				lis[i] = 0;
			}
		}
		//Where we actually stomp
		int randcount = 0;
		for (int i=0; i<3; i++){
			for (int j=0; j<3; j++){
				board[row+i][col+j] -= lis[randcount];
				randcount+=1;
			}
		}
		if(false){System.out.println(Arrays.toString(lis));}
		return board;
	}

	public static String boord(int[][] field){
		String ret = "Y->\n";
		for (int i = 0; i<field.length;i++){
			for (int j = 0;j<field[i].length;j++){
				ret+=""+field[i][j]+"\t";
			}
			ret+="\n";
		}
		return ret;
    }
    
    //This is the end of the bronze problem code
    //Here is the silver problem
    public int silver(String filename){
		return 3;
	}
	public static void main(String[] args){
		System.out.println(USACO.bronze("makelake.in"));
	}
    //End of the silver
}

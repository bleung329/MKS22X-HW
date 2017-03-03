import java.util.*;
import java.io.*;

public class Maze{
    private char[][] maze;
    private boolean animate;
    private int 
    private boolean debug = true;
    /*Constructor loads a maze text file, and sets animate to false by default.
      1. The file contains a rectangular ascii maze, made with the following 4 characters:
      '#' - locations that cannot be moved onto
      ' ' - locations that can be moved onto
      'E' - the location of the goal (exactly 1 per file)
      'S' - the location of the start(exactly 1 per file)

      2. The maze has a border of '#' around the edges. So you don't have to check for out of bounds!
      3. When the file is not found OR there is no E or S then: print an error and exit the program.
    */
    public Maze(String filename){
        //COMPLETE CONSTRUCTOR
		String thing = "";
		String rawthing = "";
		int ctrx = 0;
		int ctry = 0;
		int counter = 0;
		try{
			// This part gets a String of the thing
			File file = new File(filename);
			Scanner scanner = new Scanner(file);
			int lineNum = 1;
			while(scanner.hasNextLine()){
				String bloop = scanner.nextLine();
				rawthing+=bloop;
				thing+=bloop+"\n";
				lineNum+=1;
				if(debug){System.out.println(bloop);}
			}
			//This part puts the string into an array
			if(debug){System.out.println(thing);}
			while (!(thing.charAt(ctrx)=='\n')){ctrx+=1;}
			if(debug){System.out.println(ctrx);}
			ctry = (thing.length()/ctrx)-1;
			if(debug){System.out.println(ctry);}
			maze = new char[ctry][ctrx];
			for(int i=0;i<ctry;i++){
				for(int j=0;j<ctrx;j++){
					maze[i][j] = rawthing.charAt(counter);
				counter+=1;
				}
			}//U know what theres probably a faster way to do all this stuff
		}catch(Exception e){
			System.out.println("Something went wrong. Are you sure "+filename+" exists?");
		}
    }

    public void setAnimate(boolean b){
        animate = b;
    }

    public void clearTerminal(){
        System.out.println("\033[2J");
    }
	
    public String boord(){
	String ret = "Y->\n";
	for (int i = 0; i<maze.length;i++){
	    for (int j = 0;j<maze[i].length;j++){
		ret+=""+maze[i][j]+"\t";
	    }
	    ret+="\n";
	}
	System.out.println(ret);
	return ret;
    }

    /*Wrapper Solve Function
      Since the constructor exits when the file is not found or is missing an E or S, we can assume it exists.
    */
    public void solve(){
            int startx=0,starty=0;
            //Initialize startx and starty with the location of the S. 
            maze[startx][starty] = ' ';//erase the S, and start solving!
            //return solve(startx,starty);
    }

    /*
      Recursive Solve function:

      A solved maze has a path marked with '@' from S to E.

      Returns true when the maze is solved,
      Returns false when the maze has no solution.

      Postcondition:
        The S is replaced with '@' but the 'E' is not.
        All visited spots that were not part of the solution are changed to '.'
        All visited spots that are part of the solution are changed to '@'
      *//*
    private boolean solve(int x, int y){
        if(animate){
            System.out.println(this);
            wait(20);
        }

        //COMPLETE SOLVE
        return false; //so it compiles
	*/
}


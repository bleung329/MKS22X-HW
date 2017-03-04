public class Driver{

    public static void main(String[]args){
        Maze f;
		
		try{
			f = new Maze(args[0]);
			f.clearTerminal();
			f.setAnimate(false);
			f.solve();
			f.clearTerminal();
			System.out.println(f);
			//f.solve();
		}catch(Exception e){
			System.out.println("We need you to give a filename");
		}//true animates the maze.
        
	
    }
}

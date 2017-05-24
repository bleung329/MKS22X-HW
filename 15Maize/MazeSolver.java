import java.util.*;

public class MazeSolver
{
	public Maze board;
	public boolean aStar;
	public boolean solved = false;
	
	public MazeSolver(String filename)
	{
		this(filename, false);
	}
	public MazeSolver(String filename, boolean animate) {
		this.animate = animate;
		board = new Maze(filename);
    }
	/*
	The toStrings
	*/
	public String toString()
	{
	}
	
	public String toString(int delay)
	{
	}
	
	public void solve(int style)
	{
		Location current;
		rest = new FrontierPriorityQueue();
		rest.add(
		while ((rest.size() > 0)&&(!(solved)))
		{
			current = rest.next();
			if (current == board.mazeEnd)
			{
				solved = true;
				board.set(current,'E');
				while (!(current.previous==null))
				{
					current = current.previous;
					board.set(current, '@');
				}
				board.set(current, 'S');
			}
		}
	}
	
	public void solve()
	{
		solve(1);
	}
	
}
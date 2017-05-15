import java.util.*;

public class MazeSolver
{
	public class Location implements Comparable<Location>
	{
		public int row, col;
		Location previous;
		private int distStart;
		private boolean aStar = false;
		
		public Location(int r, int c, Location prev,  int distToStart, int distToGoal)
		{
			row = r;
			col = c;
			previous = prev;
			distStart = distToStart;
		}
		
		public Location(int r, int c, Location prev, int distToStart, int distToGoal, boolean aStar)
		{
			row = r;
			col = c;
			previous = prev;
			distStart = distToStart;
			this.aStar = aStar;
		}
		
		public int compareTo(Location other)
		{
			return 2;
		}
		
	}
	public interface Frontier
	{
		public void add(Location loc);
		public Location next();
	}
	public class FrontierPriorityQ implements Frontier
	{
		PriorityQueue<Location> locations;
		
		public void add(Location loc)
		{
			
		}
	/*	public Location next()
		{
	
		} */
	}
}
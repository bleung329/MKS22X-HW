import java.util.*;

public class MazeSolver
{
	public Maze board;
		
	/*****
	THIS IS THE FRONTIER INTERFACE
	*****/
	public interface Frontier
	{
		public void add(Location loc);
		public Location next();
	}
	
	/*****
	HERE IS THE PRIORITIZED OPEN RANGE
	*****/
	public class FrontierPriorityQ implements Frontier
	{
		PriorityQueue<Location> locations;
		
		public void add(Location loc)
		{
			
		}
		public Location next()
		{
		
		}
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
}
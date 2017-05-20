public class Location implements Comparable<Location>
{
	public int row, col;
	public Location previous;
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
		//Compare the distance to end
	}
	
	public Location getStart()
	{
		Location prev = previous;
		while (!(previous == null))
		{
			prev = prev.previous;
		}
		return prev;
	}
	
	public Location getEnd()
	{
	}
}

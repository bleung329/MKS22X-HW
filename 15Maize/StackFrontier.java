import java.util.*;
public class StackFrontier implements Frontier
{
	public Stack<Location> locations;
	
	public StackFrontier()
	{
		locations = new Stack()<Location>;
	}
	public void add(Location loc)
	{
		locations.push(loc);
	}
	public Location next()
	{
		return locations.pop();
	}
	public boolean hasNext()
	{
		return !(locations.empty());
	}
	public int size()
	{
		return locations.size()+0;
	}
}
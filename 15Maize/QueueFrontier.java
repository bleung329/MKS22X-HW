public class QueueFrontier implements Frontier
{
	LinkedList<Location> locations;
	public QueueFrontier()
	{
		locations = new LinkedList()<Location>;
	}
	public void add(Location loc)
	{
		locations.add(loc);
	}
	public Location next()
	{
		
	}
	
}
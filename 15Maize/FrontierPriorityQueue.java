public class FrontierPriorityQueue implements Frontier
{
	PriorityQueue<Location> locations;
	
	public FrontierPriorityQueue()
	{
		locations = new PriorityQueue()<Location>;
	}
	
	public void add(Location loc)
	{
		locations.add(loc);
	}
	public Location next()
	{
		
	}
	
}
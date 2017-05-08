import java.util.ArrayList;

public class MyHeap
{
	private ArrayList<String> heap;
	private int style;
	
    public MyHeap()
    {
		heap = new ArrayList<String>();
		heap.add(" ");
    }
	
	//True = Max
	//False = Min
    public MyHeap(boolean bool)
    {
		heap = new ArrayList<String>();
		if (bool)
			style = 1;
		else
			style = 0;
    }
	
    public void add(String item)
    {
		heap.set(heap.size(),item);
		pushUp();
    }
	
    public String remove(String item)
    {
    }
    public String peek()
    {
    }
	
    private void pushUp()
    {
    }
    private void pushDown()
    {
    }
	
	private String dePrint()
	{
		String ret = "[";
		for (String hop: heap)
		{
			ret+=hop+" "
		}
		ret+="]";
		return ret;
	}
}

import java.lang.reflect.Array;

class MyDeque<String> 
{
	private int maxSize=1000;
	private final String[] array;
	private int front,rear;
	private int numberOfStrings;
	public MyDeque()
	{
		array=(String[])(new Object[maxSize]);
		front=0;
		rear=-1;
		numberOfStrings=0;
	}
	public boolean isEmpty()
	{
		return (numberOfStrings==0);
	} 
	public void addFirst(String item)
	{
		if(front==0)
			front=maxSize;
		array[--front]=item;
		numberOfStrings++;
	}
	public void addLast(String item)
	{
		if(rear==maxSize-1)
			rear=-1;
		array[++rear]=item;
		numberOfStrings++;
	}
	public String removeFirst() 
	{
		String temp=array[front++];
		if(front==maxSize)
			front=0;
		numberOfStrings--;
		return temp;
	}
	public String removeLast() 
	{
		String temp=array[rear--];
		if(rear==-1)
			rear=maxSize-1;
		numberOfStrings--;
		return temp;
	}
	public int getFirst()
	{
		return front;
	}
	public int getLast()
	{
		return rear;
	}
	public static void main(String[] args)
	{
		MyDeque<String> element1=new MyDeque<String>();
		MyDeque<String> element2=new MyDeque<String>();
		for(int i=0;i<args.length;i++)
		element1.addFirst(args[i]);
		try {
		for(;element1.numberOfStrings+1>0;)
		{
			String temp=element1.removeFirst();
			System.out.println(temp);
		}
		}
		catch(Exception ex)
		{
			System.out.println("End Of Execution due to remove from empty queue");
		}
		System.out.println();
		for(int i=0;i<args.length;i++)
		element2.addLast(args[i]);
		try {
		for(;element2.numberOfStrings+1>0;)
		{
			String temp=element2.removeLast();
			System.out.println(temp);
		}
		}
		catch(Exception ex)
		{
			System.out.println("End Of Execution due to remove from empty queue");
		}
	}
} 
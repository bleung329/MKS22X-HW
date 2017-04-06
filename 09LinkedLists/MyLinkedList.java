public class MyLinkedList{
	
	/*
	Whoops I kinda need to set the prev and next
	Completed Functions:
	YEP getNthNode
	addAfter
	YEP remove(LNode)
	YEP toString
	add(val)
	YEP get
	YEP set
	indexOf
	YEP? remove(i)
	add(i,val)
	*/
	
	LNode head;
	LNode tail;
	int size = 0;
	
	public MyLinkedList(){
		//Nothing here
	}
	
	//Here is the LNode
	private class LNode{
		int value;
		LNode next = null;
		LNode prev = null;
		
		//tbh this is the only constructor we need//
		
		public LNode(int val, LNode nexto, LNode previo){
			prev = previo;
			value = val;
			next = nexto;
		}
		public LNode(int val, LNode nexto){
			next = nexto;
			value = val;
		}
		public String toString(){
			return "["+value+"]";
		}
	}
	
	//CHANGING FUNCTIONS
	public void add(int value)
	{
		if (head == null)
		{
			head = new LNode(value,null,null);
		}
		else
		{
			LNode cdr = head;
			for (int i = 0; i < size; i++)
			{
				if (cdr.next == null)
				{
					cdr.next = new LNode(value,null,cdr);
					break;
				}
				else
				{
					cdr = cdr.next;
				}
			}
		}
		size++;
	}
	//^I should have used getNthNode but at this point Im too afraid to.
	
	public int set(int index, int newVal)
	{
		if (index>size)
		{
			throw new IllegalArgumentException();
		}
		int ret = getNthNode(index).value;
		(getNthNode(index)).value = newVal;
		return ret;
	}
	
	//THE REMOVE SQUAD
	public int remove(int index){
		if (index>size){
			throw new IllegalArgumentException();
		}
		size--;
		return remove(getNthNode(index));
	}
	
	//The Actual Remove
	public int remove(LNode Node)
	{	
		if (size<=1)
		{
			head = null;
			tail = null;
			return Node.value;
		}
		if (Node == head)
		{
			head = head.next;
			return Node.value;
		}
		if (Node == tail)
		{
			tail = Node.prev;
			return Node.value;
		}
		else
		{
			(Node.prev).next = Node.next;
			(Node.next).prev = Node.prev;
			return Node.value;
		}
		
	}
	
	//ACCESS THINGS
	public int size()
	{
		return size+0;
	}
	
	public int get(int index)
	{
		if (index>size)
		{
			throw new IllegalArgumentException();
		}
		LNode cdr = head;
		for (int i = 0; i<index; i++)
		{
			cdr = cdr.next;
		}
		return cdr.value;
	}
	public LNode getNthNode(int index)
	{
		if (index>size)
		{
			throw new IllegalArgumentException();
		}
		LNode cdr = head;
		for (int i = 0; i<index; i++)
		{
			cdr = cdr.next;
		}
		return cdr;
	}
	
	public int indexOf(int target)
	{
		LNode cdr = head;
		for (int i = 0; i<size; i++)
		{
			if (cdr.value==target) return i;
			else cdr = cdr.next;
		}
		return -1;
	}
	
	//NEW HELPFUL FUNCTIONS
	private int insertAfter(LNode toba, LNode location){
		return 1;
	}
	private int insertBefore(LNode toba, LNode location){
		return 1;
	}
	
	
	public String toString(){
		if (size==0) return "[]";
		String ret = "[";
		LNode cdr = head;
		for (int i = 0; i<size; i++){
			if (i==0){
				ret+=cdr.value;
			}
			else{
				ret+=", "+cdr.value;
			}
			cdr = cdr.next;
		}
		return ret+"]";
	}
	
	//END OF CODE, head OF MAIN
	public static void main(String[] args){
		MyLinkedList Link = new MyLinkedList();
		Link.add(0);
		System.out.println("We good");
		Link.add(1);
		System.out.println("We good");
		Link.remove(0);
		System.out.println("We good");
		System.out.println(Link);
	}
	
}

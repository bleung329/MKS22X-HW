public class MyLinkedList{
	
	/*
	Completed Functions:
	YEP getNthNode
	addAfter
	YEP remove(LNode)
	YEP toString
	add(val)
	YEP get
	YEP set
	indexOf
	remove(i)
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
	public void add(int value){
		if (head == null){
			head = new LNode(value,null);
		}
		else{
			LNode cdr = head;
			for (int i = 0; i < size; i++){
				if (cdr.next == null){
					cdr.next = new LNode(value,null);
					break;
				}
				else{
					cdr = cdr.next;
				}
			}
		}
		size++;
	}
	
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
	
	public int remove(int index){
		if (index>size){
			throw new IllegalArgumentException();
		}
		return remove(getNthNode(index))
	}
	
	//THE REMOVE
	public int remove(LNode Node)
	{	
		if (size<=1)
		{
			//Do something
			return Node.value;
		}
		if (Node == head)
		{
			return Node.value;
		}
		if (Node == tail)
		{
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
	public int size(){
		return size+0;
	}
	
	public int get(int index){
		if (index>size){
			throw new IllegalArgumentException();
		}
		LNode cdr = head;
		for (int i = 0; i<index; i++){
			cdr = cdr.next;
		}
		return cdr.value;
	}
	public LNode getNthNode(int index){
		if (index>size){
			throw new IllegalArgumentException();
		}
		LNode cdr = head;
		for (int i = 0; i<index; i++){
			cdr = cdr.next;
		}
		return cdr;
	}
	
	public int indexOf(int target){
		LNode cdr = head;
		for (int i = 0; i<size; i++){
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
		Link.add(1);
		Link.add(-2000);
		Link.add(3);
		Link.add(4);
		Link.add(5);
		//System.out.println(Link.set(2,100));
		//System.out.println("100 is at "+Link.indexOf(100));
		System.out.println(Link.get(3));
		System.out.println(Link.set(3, 10000));
		//System.out.println("I removed: "+Link.remove(Link.get(3)));
		//Link.add(5);
		
		//System.out.println(Link.set(2,100));
		//System.out.println("100 is at "+Link.indexOf(100));
		System.out.println("I removed: "+Link.remove(2));
		System.out.println(Link);
		//System.out.println(Link.get(3));
	}
	
}

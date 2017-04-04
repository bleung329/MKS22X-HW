public class MyLinkedList{
	
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
	
	public int set(int index, int newVal){
		if (index>size){
			throw new IllegalArgumentException();
		}
		LNode cdr = head;
		for (int i = 0; i<index; i++){
			cdr = cdr.next;
		}
		int ret = cdr.value;
		cdr.value = newVal;
		return ret;	
		
	}
	
	public int remove(int index){
		if (index>size){
			throw new IllegalArgumentException();
		}
		int ret = 0;
		LNode cdr = head;
		if (index == 0){
			head = head.next;
		}
		else{
			for (int i = 0; i<index-1; i++){
				//System.out.println(cdr.value);
				cdr = cdr.next;
				//System.out.println(cdr.value);
			}
			LNode first = cdr;
			cdr = cdr.next;
			ret = cdr.value;
			first.next = cdr.next;
		}
		size--;		
		return ret;
	}
	
	//THE NEW REMOVE
	public int remove(LNode Node){
		
		if (size<=1)
		{
			//Do something
			return 2;
		}
		if (Node == head)
		{
			return 2;
		}
		if (Node == tail)
		{
			return 2;
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
	
	public int indexOf(int target){
		LNode cdr = head;
		for (int i = 0; i<size; i++){
			if (cdr.value==target) return i;
			else cdr = cdr.next;
		}
		return -1;
	}
	
	//NEW HELPFUL FUNCTIONS
	private LNode getNode(int index){
		LNode cdr = head;
		for (int i = 0; i<index; i++){
			cdr = cdr.next;
		}
		return cdr;
	}
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
		System.out.println(Link.getNode(3));
		System.out.println("I removed: "+Link.remove(Link.getNode(3)));
		Link.add(5);
		
		//System.out.println(Link.set(2,100));
		//System.out.println("100 is at "+Link.indexOf(100));
		System.out.println("I removed: "+Link.remove(2));
		System.out.println(Link);
		//System.out.println(Link.get(3));
	}
}

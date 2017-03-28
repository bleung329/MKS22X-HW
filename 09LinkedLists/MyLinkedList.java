public class MyLinkedList{
	LNode start;
	int size = 0;
	
	public MyLinkedList(){
	}
	//Here is the LNode
	private class LNode{
		int value;
		LNode next = null;
		//Only value
		public LNode(int val){
			value = val;
		}
		
		public LNode(int val, LNode ref){
			value = val;
			next = ref;
		}
	}
	
	public void add(int value){
		if (start == null){
			start = new LNode(value);
		}
		else{
			LNode cdr = start;
			for (int i = 0; i < size; i++){
				if (cdr.next == null){
					cdr.next = new LNode(value);
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
		LNode cdr = start;
		for (int i = 0; i<index; i++){
			cdr = cdr.next;
		}
		int ret = cdr.value;
		cdr.value = newVal;
		return ret;	
		
	}
	
	//ACCESS THINGS
	public int size(){
		return size+0;
	}
	
	public int get(int index){
		LNode cdr = start;
		for (int i = 0; i<index; i++){
			cdr = cdr.next;
		}
		return cdr.value;
	}
	
	public String toString(){
		if (size==0) return "[]";
		
		String ret = "[";
		LNode cdr = start;
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
	public static void main(String[] args){
		MyLinkedList Link = new MyLinkedList();
		Link.add(0);
		Link.add(1);
		Link.add(2);
		Link.add(3);
		Link.add(4);
		Link.add(5);
		System.out.println(Link.set(2,100));
		
		System.out.println(Link);
		System.out.println(Link.get(3));
	}
}
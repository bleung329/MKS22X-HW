public class MyLinkedList{
	LNode start;
	int size = 0;
	
	public MyLinkedList(){
	}
	//Here is the LNode
	private class LNode{
		int value;
		LNode next;
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
			LNode cdr = start.next;
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
	}/*
	public int set(int index, int newVal){
	}
	
	//ACCESS THINGS
	public int size(){
		return size+0;
	}
	public int get(int index){
		
	}*/
	public String toString(){
		String ret = "";
		LNode cdr = start.next;
		for (int i = 0; i<size; i++){
			cdr.next
		}
		return ""+start.value;
	}
	public static void main(String[] args){
		MyLinkedList Link = new MyLinkedList();
		Link.add(3);
		System.out.println(Link);
	}
}
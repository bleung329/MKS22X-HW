import java.util.*;

public class MyDeque{
    int front, size, back;
    String[] stuff;

    public MyDeque(){
		stuff = new String[10];
    }
    
    public void addFirst(String i){
		if (i.equals(null)){
			throw new NullPointerException();
		}
		else{
			if(size == stuff.length){
				resize();
			}
		if(size != 0){
			front --;
			if (front < 0)
				front = stuff.length - 1;
		}
		stuff[front] = i;
		size+=1;
		}
	}
    
    public void addLast(String i){
		if (i.equals(null)){
			throw new NullPointerException();
		}
		if(size == stuff.length){
			resize();
		}
		else{
		if (size != 0){
			back++;
			if(back >= stuff.length)
				back = 0;
		}
		}
		stuff[back] = i;
		size++;
    }
    
    public String removeFirst(){
		if (size == 0){
			throw new NullPointerException();
		}
		String i = stuff[front];
		front++;
		if (front >= stuff.length){
			front = 0;
		}
		size--;
		return i;       
    }

    public String removeLast(){
		if (size == 0){
			throw new NullPointerException();
		}
		String i = stuff[back];
		back --;
		if (back <= -1){
			back = stuff.length - 1;
		}
		size --;
		return i;
    }

    public String getLast()
	{
		if (size == 0){
			throw new NullPointerException();
		}
		else{
		return stuff[back];
		}
    }

    public String getFirst(){
		if (size == 0){
			throw new NullPointerException();
		}
		return stuff[front];
    }


    private void resize(){
		String[] temp = new String[stuff.length*2];
		int i = 0;
		int f = front;
		while (f < front + size){
			temp[i] = stuff[f % stuff.length];
			i++;
			f++;	
		}	
		front = 0;
		back = size-1;
		stuff = temp;
    }

    public String toString(){
		String ret = "[";
		int f = front;
		for(int i = 0; i < size; i++){
			if(f == stuff.length){
				f = 0; 
			}
			ret += stuff[f] + ", ";
			f++;
		}
		if (size != 0)
			ret = ret.substring(0, ret.length() - 2);
		return ret + "]";
    }
    
}

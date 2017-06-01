import java.util.ArrayList;
import java.util.Collections;
public class Quiz2Redux{
	public static String name(){
		return "Leung, Brian";
		
	}
	public static ArrayList<String> combinations(String s){
		ArrayList<String>words = new ArrayList<String>();
		combinationH(s,words,s.length());
		for (int i = 0; i<words.size(); i++)
		{
			words.set(i, reverse(words.get(i)));
		}
		Collections.sort(words);
		return words;
	}
	public static void combinationH(String s, ArrayList<String> words, int position)
	{
		int placehold = words.size();
		if(position<0){return;}
		if (words.size() == 0){
			words.add("");
		}
		else{
			words.add(""+s.charAt(position));
			for (int i = 1; i<placehold; i++){
				words.add(words.get(i) + words.get(placehold));
			}	
		}
		combinationH(s,words,position-1);
	}
	
	/*
	heres a reverse function because apparently i've been placing the items in the wrong order
	*/
	private static String reverse(String str) 
	{
		String reverse = "";
		int length = str.length();
		for(int i = length - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		return reverse;
	}
	/*
	public static void main(String[] args){
		System.out.println(Quiz2Redux.combinations("kji"));
	}
	*/
	
}

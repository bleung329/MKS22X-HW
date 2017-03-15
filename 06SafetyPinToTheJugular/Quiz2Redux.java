 import java.util.ArrayList;
public class Quiz2Redux{
	public static ArrayList<String> combinations(String s){
		Arraylist<String>words = new ArrayList<String>();
		combinationH(s,words,s.length()-1);
		return words;
	}
	
}

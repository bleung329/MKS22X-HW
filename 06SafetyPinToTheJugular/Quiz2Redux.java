import java.util.ArrayList;
public class Quiz2Redux{
	public static ArrayList<String> combinations(String s){
		ArrayList<String>words = new ArrayList<String>();
		combinationH(s,words,s.length());
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
	public static void p(Object a){
		System.out.println(a);
	}
	public static void main(String[] args){
		System.out.println(Quiz2Redux.combinations("abc"));
	}
	
	
}

public class Recursion{
	public static String name(){
		return "Leung,Brian";
	}
	public static boolean equal(double a, double b){
		return ((a/b >= 0.99999)&&(a/b <= 1.00001));
	}
	public static double sqrt(double n){
		return sqrti(n,1);
	}
	public static double sqrti(double n,double guess){
		if (n<0){
			throw new IllegalArgumentException();
		}
		if (equal(guess*guess,n)){
			return guess;
		}else{
			return sqrti(n,( n / guess + guess) / 2);
		}
	}/*
	public static void main(String[] noargs){
		System.out.println(sqrt(169));
		System.out.println(name());
		System.out.println(sqrt(-1));
	}*/
}

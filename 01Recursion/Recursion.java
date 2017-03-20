public class Recursion{
	public static String name(){
		return "Leung,Brian";
	}
	public static boolean equal(double a, double b){
		return ((a/b >= 0.999999999)&&(a/b <= 1.0000001));
	}
	public static double sqrt(double n){
		//System.out.println("Testing "+n);
		return sqrti(n,1);
	}
	public static double sqrti(double n,double guess){
		if (n<0){
			throw new IllegalArgumentException();
		}
		if (n==0){
			return 0;
		}
		if (equal(guess*guess,n)){
			return guess;
		}else{
			return sqrti(n,(n / guess + guess)/ 2);
		}
	}
	public static void main(String[] noargs){
		System.out.println(sqrt(1024));
		//System.out.println(name());
		System.out.println(sqrt(-1));
	}
}
// In 6 and 15
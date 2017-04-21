public class Eval
{
	public static double eval(String S)
	{
		String[] s = S.split(" ");	
		return 1.0;
	}
	public static boolean isOp(String s)
	{
		return (s.equals("+")|s.equals("-")|s.equals("/")|s.equals("*")|s.equals("%"));
	}
	public static double apply(String A, String B, String OP)
	{
		if (isOp(OP))
		{
			double a = Double.parseDouble(A);
			double b = Double.parseDouble(B);
			switch (OP)
			{
				case "+":
					return (a+b);
				case "-":
					return (a-b);
				case "/":
					return (a/b);
				case "*":
					return (a*b);
				case "%":
					return (a%b);
				default:
					break;
			}
		}
		
		return -0.0;
		
	}
	public static void main(String[] args)
	{
		
	}
}
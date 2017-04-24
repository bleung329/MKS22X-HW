import java.util.Stack;
import java.util.Arrays;

public class Eval
{
	public static void p(Stack a)
	{
		System.out.println("The stack is currently: "+Arrays.toString(a.toArray()));
	}
	public static double eval(String S)
	{
		String[] s = S.split(" ");	
		Stack<String> ops = new Stack<String>();
		for (int i = s.length-1; i>-1; i--)
		{
			//System.out.println(s[i]);
			ops.add(s[i]);
		}
		String[] holder = new String[3];
		String temp = "";
		while (ops.size() > 1)
		{
			for (int i = 0; i<holder.length; i++)
			{
				holder[i] = ops.pop();
			}
			p(ops);
			System.out.println(Arrays.toString(holder));
			if (isOp(holder[2]))
			{
				temp = Double.toString(apply(holder[0],holder[1],holder[2]));
				ops.add(temp);
			}
			else
			{
				for(String item: holder)
				{
					ops.add(item);
				}
			}
		}
		return Double.parseDouble(ops.pop());
	}
	public static boolean isOp(String s)
	{
		return (s.equals("+")|s.equals("-")|s.equals("/")|s.equals("*")|s.equals("%"));
	}
	public static double apply(String A, String B, String OP)
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
			return 0;
	}
	public static void main(String[] args)
	{
		System.out.println(eval("3 1 2 3 + + +"));
	}
} 
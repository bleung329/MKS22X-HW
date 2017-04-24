import java.util.Stack;
import java.util.Arrays;
import java.util.Queue;

public class Eval
{
	public static void p(Stack a)
	{
		System.out.println("The stack is currently: "+Arrays.toString(a.toArray()));
	}
	public static double eval(String S)
	{
		//PARSE STRING
		String[] s = S.split(" ");	
		Stack<String> ops = new Stack<String>();
		for (int i = s.length-1; i>-1; i--)
		{
			//System.out.println(s[i]);
			ops.add(s[i]);
		}
		//END PARSE STRING
		
		String[] holder = new String[3];
		String temp = "";
		
		for (int i = 0; i<3; i++)
		{
			holder[i] = ops.pop();
		}
		System.out.println(ops.size());
		while (ops.size() > 0 && holder.length >= 0)
		{
			System.out.println("what");
			if (isOp(holder[2]))
			{
				temp = Double.toString(apply(holder[0],holder[1],holder[2]));
				ops.add(temp);
				p(ops);
				System.out.println("Holder is: "+Arrays.toString(holder));
			}
			else
			{
				ops.add(holder[0]);
				p(ops);
				holder[0] = holder[1];
				holder[1] = holder[2];
				holder[2] = ops.pop();
			}
			p(ops); //print stuff here
			System.out.println("Holder is: "+Arrays.toString(holder));
		}
		p(ops);
		System.out.println("Holder is: "+Arrays.toString(holder));
		ops.add(holder[0]);
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
		System.out.println(eval("2 3 +"));
	}
}
import java.util.Stack;
import java.util.Arrays;
import java.util.Queue;

public class StackCalc
{
	public static void p(Stack a)
	{
		System.out.println("The stack is currently: "+Arrays.toString(a.toArray()));
	}
	public StackCalc()
	{
	}
	/*
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
		
		System.out.println(ops.size());
		while (ops.size()!=1)
		{
			
			for (int i = 0; i<3; i++)
			{
				holder[i] = ops.pop();
			}
			
			if (isOp(holder[2]))
			{
				temp = Double.toString(apply(holder[0],holder[1],holder[2]));
				ops.add(temp);
				for (int i = 0; i<3; i++)
				{
					holder[i] = null;
				}
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
		return Double.parseDouble(ops.pop());
	}*/
	public static boolean isOp(String s)
	{
		return (s.equals("+")|s.equals("-")|s.equals("/")|s.equals("*")|s.equals("%"));
	}
	public static double eval(String s)
	{
		String[] tokens = s.split(" ");
		Stack<String> nums = new Stack<String>();
		for (String token:tokens)
		{
			if (isOp(token))
			{
				nums.push(Double.toString(apply(token,nums.pop(),nums.pop())));
			}
			else
			{
				nums.push(token);
			}
		}
		return Double.parseDouble(nums.pop());
	}
	public static double apply(String OP, String A, String B)
	{
			double a = Double.parseDouble(A);
			double b = Double.parseDouble(B);
			switch (OP)
			{
				case "+":
					return (a+b);
				case "-":
					return (b-a);
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
	/*public static void main(String[] args)
	{
		System.out.println(eval("2 3 +"));
		System.out.println(eval("3 1 2 3 + + +"));
	}*//*
	public static void main(String[] args)
	{
    System.out.println(StackCalc.eval("10 2 +"));//12.0
    System.out.println(StackCalc.eval("10 2 -"));//8.0
    System.out.println(StackCalc.eval("10 2.0 +"));//12.0
    System.out.println(StackCalc.eval("11 3 - 4 + 2.5 *"));//30.0
    System.out.println(StackCalc.eval("8 2 + 99 9 - * 2 + 9 -"));//893.0
    System.out.println(StackCalc.eval("10 2 + 10 * 1 + 1 1 1 + + + 10 10 + -"));//104.0
	}*/
} 

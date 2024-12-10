class num
{
	public int max(int a, int b)
	{
		if(a < b)
			return b;

		else
			return a;
	}
	
	public double max(double a, double b)
	{
		if(a < b)
			return b;

		else
			return a;
	}
	public int max(int a, int b, int c)
	{
		if(a<b)
		{
			if(b<c)
				return c;
			else
				return b;
		}
		else
		{
			if(a<c)
				return c;
			else
				return a;
		}
	}

	public double max(double a, double b, double c)
	{
		if(a<b)
		{
			if(b<c)
				return c;
			else
				return b;
		}
		else
		{
			if(a<c)
				return c;
			else
				return a;
		}
	}

}

public class numerical 
{
	public static void main(String[] args)
	{
		num calc;
		calc = new num();

		System.out.println(calc.max(1,2));
		System.out.println(calc.max(5,4,3));
		System.out.println(calc.max(6.0, 7.0));
		System.out.println(calc.max(10.0, 8.0, 9.0));

	}
}

package JavaAssignment1;

public class HighestNum {

	public static void main(String[] args)
	{
		HighestNum.Highestnum(30,30,150);
	}
	public static void Highestnum(int a, int b, int c)
		{
			
			if(a>b && a>c)
			{
			System.out.println("a is largest");
			}
			else

			if(b>a && b>c)
			{
			System.out.println("b is largest");
			}
			else
			if(c>a && c>b)
			{
			System.out.println("c is largest");
			}
				
		}

	}



public class Main
{
	public static void PNumber(int n)
	{

		int tempInt = 0;
		int isItZero = 0;

		tempInt = n / 2;

		for (int i = 2; i <= tempInt; i++)
		{

			if (n % i == 0)
			{
				System.out.println(n + " is not prime number");
				isItZero = 1;
				break;
			}
			if (n == 0 || n == 1)
			{
				System.out.println(n + " is not prime number");
				break;
			}
		}
		if (isItZero == 0)
		{
			System.out.println(n + " is a prime number");
		}

	}

	public static void main(String[] args)
	{
		PNumber(13);

	}

}

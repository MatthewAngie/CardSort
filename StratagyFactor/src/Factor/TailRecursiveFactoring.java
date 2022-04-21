package Factor;

public class TailRecursiveFactoring extends Factorizer
{
	public void computeFactorization(int value)
	{
		System.out.println("Calculating Factors of "+value+" using TAIL RECURSION");
		tailFactor(value, value-1);
	}

	private void tailFactor(int num, int cand)
	{
		if (cand <= 1) {
			return;
		}

		if (num % cand == 0)
		{
			num = num / cand;
			factors[index++] = num;
			display(cand);

			tailFactor(cand, cand-1);          
		}
		else {
			tailFactor(num, cand-1); 
		}
	}

	public void display(int num)
	{
		System.out.print(num);
		for (int i=index-1;i>=0;i--)
		{
			System.out.print(" x " + factors[i]);
		}
		System.out.println();
	}

}


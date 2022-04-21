package Factor;

public class FrontRecursiveFactoring extends Factorizer
{
	// This class contains a method that recursively computes
	// the factors of a number 


	public void computeFactorization(int value)
	{
		System.out.println("Calculating Factors of "+value+" using FRONT RECURSION");
		frontFactor(value, 2);
	}

	public void frontFactor(int num, int cand)
	{
		if (cand > Math.sqrt((double)num)) {
			return;
		}

		if (num % cand == 0)
		{
			factors[index++] = cand;

			num = num / cand;
			display(num);
			frontFactor(num, cand);

		}
		else {
			frontFactor(num, cand+1); 
		}
	}

	public void display(int num)
	{
		for (int i=0;i<index;i++)
		{
			System.out.print(factors[i] +" x ");
		}
		System.out.println(num);
	}
}


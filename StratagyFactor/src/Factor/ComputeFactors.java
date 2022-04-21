package Factor;

public class ComputeFactors {

	private Factorizer factorCalculator;

	public void findFactors(int value)
	{
		factorCalculator.computeFactorization(value);
	}

	public void setFactorAlgorithm(Factorizer factorAlgorithm)
	{
		factorCalculator = factorAlgorithm;
	}

	public static void main(String args[])
	{
		new ComputeFactors().runCode();
	}
	
	public void runCode()
	{
		//int numToFactor = (int)(Math.random()*7000);
		int numToFactor = 5100;
		ComputeFactors program = new ComputeFactors();
		program.setFactorAlgorithm(new FrontRecursiveFactoring());
		program.findFactors(numToFactor);

		System.out.println();

		program.setFactorAlgorithm(new TailRecursiveFactoring());
		program.findFactors(numToFactor);

		System.out.println();


		program.setFactorAlgorithm(new TreeRecursiveFactoring());
		program.findFactors(numToFactor);

	}
}

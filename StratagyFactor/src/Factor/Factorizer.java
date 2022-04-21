package Factor;

public abstract class Factorizer {

    public int factors[] = new int[100];
    public int index = 0;

    public abstract void computeFactorization(int value);

}

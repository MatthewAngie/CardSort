package Factor;

public class TreeRecursiveFactoring extends Factorizer
{
	Node root;

	public void computeFactorization(int value)
	{
		System.out.println("Calculating Factors of "+value+" using TREE RECURSION");
		root = new Node(value);
		treeFactor(value, (int)Math.sqrt((double)value), root );

	}

	public void treeFactor(int num, int cand, Node subTree)
	{
		if (cand <= 1) {
			return;
		}

		if (num % cand == 0)
		{
			num = num / cand;

			subTree.makeLeftChild(num);
			subTree.makeRightChild(cand);           

			display(root);
			System.out.println();

			treeFactor(num, (int)Math.sqrt((double)num), subTree.getLeft());
			treeFactor(cand, (int)Math.sqrt((double)cand), subTree.getRight());

		}
		else 
		{
			treeFactor(num, cand-1, subTree); 
		}
	}

	public void display(Node node)
	{
		if (node == null) return;

		if (node.getLeft() == null && node.getRight() == null)
		{
			System.out.print(node.getValue());
		}
		else
		{
			display(node.getLeft());
			System.out.print(" x ");
			display(node.getRight());
		}
	}


}

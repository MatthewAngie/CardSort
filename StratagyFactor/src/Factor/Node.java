package Factor;

public class Node{
	private int value;
	private Node left, right;

	public Node(int num)
	{
		value = num;
		left = null;
		right = null;
	}

       public int getValue()
       {
		return value;
	}

	public Node getLeft()
	{
		return left;
        }

	public Node getRight()
	{
		return right;
	}

	public void makeLeftChild( int num)
	{
		Node temp = new Node(num);
		left = temp;
	}
	
	public void makeRightChild(int num)
        {
		Node temp = new Node(num);
		right = temp;
	}
}

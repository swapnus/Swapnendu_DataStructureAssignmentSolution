package com.greatlearning.b2s;

class Node
{
	int value;
	Node left, right;
	
	
	Node(int item)
	{
		value = item;
		left = right = null;
	}
}
class Main
{
	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	
	static void skewed(Node root,int order)
	{
	
		
		if(root == null)
		{
			return;
		}
	
		
		
			skewed(root.left, order);
		
		Node rNode = root.right;
		Node lNode = root.left;
	
		
		if(headNode == null)
		{
			headNode = root;
			root.left = null;
			prevNode = root;
		}
		else
		{
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
	
		
	
			skewed(rNode, order);
		
	}


	static void traverse(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.value + " ");
		traverse(root.right);	
	}

	
	public static void main (String[] args)
	{
	
		Main tree = new Main();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.left.right = new Node(40);
	
	
		int order = 0;
		skewed(node, order);
		traverse(headNode);
	}
}


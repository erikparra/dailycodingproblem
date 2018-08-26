package August2018;

/*
 * Given the root to a binary tree, 
 * implement serialize(root), which serializes the tree into a string, 
 * and deserialize(s), which deserializes the string back into the tree.
 * 
 * For example, given the following Node class
 * class Node:
 * 	def __init__(self, val, left=None, right=None):
 * 	self.val = val
 * 	self.left = left
 * 	self.right = right
 * 
 * The following test should pass:
 * 
 * node = Node('root', Node('left', Node('left.left')), Node('right'))
 * assert deserialize(serialize(node)).left.left.val == 'left.left'
 * 
*/

public class Day26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = new Node("root", new Node("left", new Node("left.left")), new Node("right"));
		String n1 = node.serialize();
		System.out.println( n1 );	
		
		Node newNode = new Node();
		newNode.deserialize( n1 );
		System.out.println( newNode.left.left.val);
	}
}
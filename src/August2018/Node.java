package August2018;

import java.util.Stack;

public class Node {
	String val = null;
	Node left = null;
	Node right = null;
	
	public Node(String v, Node l, Node r) {
		this.val = v;
		this.left = l;
		this.right = r;
	}
	public Node(String v, Node l) {
		this.val = v;
		this.left = l;
	}
	public Node(String v) {
		this.val = v;
	}
	public Node() {
	}
	
	public String serialize() {
		String ret = "";
		if( this.right != null ) {
			ret = "Node('"+this.val+"', "+this.left.serialize()+", "+this.right.serialize()+")";
		}
		else if( this.left != null ) {
			ret = "Node('"+this.val+"', "+this.left.serialize()+")";
		}
		else {
			ret = "Node('"+this.val+"')";
		}
		return ret;
	}
	
	
	/*
	 * NOT COMPLETE
	 */
	public Node deserialize(String n1) {
		Stack<Character> stack = new Stack<>();
		int start = 0;
		int end = 0;
		
		for(int i = 0; i < n1.length(); i++ ) {
			if( n1.charAt(i) == '(' ) {
				if( stack.isEmpty() ) {
					start = i;
				}
				stack.push('(');
			}
			
			if( n1.charAt(i) == ')' ) {
				stack.pop();
				if( stack.isEmpty() ) {
					end = i;
				}
			}
		}
			
		
		return new Node();
	}
}
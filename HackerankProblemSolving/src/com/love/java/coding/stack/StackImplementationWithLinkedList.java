package com.love.java.coding.stack;

public class StackImplementationWithLinkedList {
	
	Node root;
	
	
	static class Node {
		
		Object data;
		Node next;
		
		public Node(Object data) {
			this.data = data;
		}
		
		
	}
	
	public void push(Object val) {
		
		Node node = new Node(val);
		
		if(isEmpty()) {
			root = node;
		} else {
			Node tempNode = root;
			root = node;
			root.next = tempNode;
		}
		
	}
	
	public Object pop() {
		
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			System.exit(-1);
		}
		
		Object popValue = root.data;
		root = root.next;
		return popValue;
	}
	
	public Object peek() {
		
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			System.exit(-1);
		}
		return root.data;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	

	public static void main(String[] args) {

	}

}

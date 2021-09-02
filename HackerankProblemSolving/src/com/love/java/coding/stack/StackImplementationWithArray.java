package com.love.java.coding.stack;

public class StackImplementationWithArray {
	
	int[] array;
	int capacity;
	int top = -1;
	
	public StackImplementationWithArray(int size) {
		this.capacity = size;
		array = new int[size];
	}
	
	public void push(int value) {
		
		if(isFull()) {
			System.out.println("Stack is full");
			System.exit(1);
		}
		System.out.println("Pushing value "+ value);
		array[++top] = value;
	}
	
	public int pop() {
		
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			System.exit(1);
		}
		int value = array[top--];
		System.out.println("Popping value "+ value);
		return value;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			System.exit(1);
		}
		System.out.println("Peeking value "+ array[top]);
		return array[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public int size() {
		return top + 1;
	}
	
	public boolean isFull() {
		return capacity == size();
	}
	
	public static void main(String[] args) {
		
		StackImplementationWithArray stackWithArray = new StackImplementationWithArray(3);
		stackWithArray.push(2);
		stackWithArray.push(3);
		stackWithArray.push(5);
		System.out.println("Size:"+stackWithArray.size());
		
		stackWithArray.peek();
		stackWithArray.pop();
		stackWithArray.pop();
		stackWithArray.pop();
		System.out.println("Size:"+stackWithArray.size());
		
		stackWithArray.push(4);
		stackWithArray.peek();
		
		System.out.println("Size:"+stackWithArray.size());
		
		
		
		
	}

}

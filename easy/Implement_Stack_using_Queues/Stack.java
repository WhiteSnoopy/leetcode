package com.org.Implement_Stack_using_Queues;
/*
 * ����ջ���Ƚ���� �������������Ƚ��ȳ���ֻ��Ҫ�Ѷ����е�˳��ת���ɣ������е�ʵ�������ͨ��list��ʵ�֣����߿���ͨ��ѭ��������ʵ��
 */
import java.util.*;
public class Stack {
	public Queue<Integer> queue;
	public Stack(){
		this.queue=(Queue<Integer>) new LinkedList<Integer>();
	}
	public void push(int x) {
		queue.add(x);
		for(int i=0;i<queue.size()-1;i++)
			queue.add(queue.poll());
	}
	// Removes the element on top of the stack.
	public void pop() {
		queue.poll();
	}

	// Get the top element.
	public int top() {
		return queue.peek();
	}
	// Return whether the stack is empty.
	public boolean empty() {
		return queue.isEmpty();
	}
}

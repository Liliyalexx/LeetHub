/***/
class MyStack{
	Queue<Integer> s1 = new LinkedList<>();
	Queue<Integer> s2 = new LinkedList<>();

	public void push(int x) {
		s1.add(x);
		int i = 0;
		while(i < s1.size() - 1){
			s2.add(s1.remove());
			s1.add(s2.remove());
			i++;
		}
	}

	/** Removes the element on top of the stack and returns that element. */
	public int pop() {
		return s1.remove();
	}

	/** Get the top element. */
	public int top() {
		return s1.peek();
	}

	/** Returns whether the stack is empty. */
	public boolean empty() {
		return s1.isEmpty();
	}
}
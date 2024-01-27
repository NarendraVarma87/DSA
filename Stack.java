public class Stack {

	int[] array;
	int topOfStack;

	public void createStack(int size) {
		array = new int[size];
		topOfStack = -1;
	}

	public void push(int data) {
		if (array.length - 1 == topOfStack) {
			System.out.println("Stack Overflow Error!");
			return;
		} else {
			array[topOfStack + 1] = data;
			topOfStack++;
			System.out.println("Inserted!");
		}
	}

	public void pop() {
		if (topOfStack == -1) {
			System.out.println("Stack Underflow Error!");
		} else {
			int tmp = array[topOfStack];
			topOfStack--;
			System.out.println(tmp);
		}
	}

	public void peek() {
		if (topOfStack == -1) {
			System.out.println("Stack is Empty!");
		} else {
			int tmp = array[topOfStack];
			System.out.println(tmp);
		}
	}

	public boolean isEmpty() {
		if (topOfStack == -1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {
		if (array.length - 1 == topOfStack) {
			return true;
		} else {
			return false;
		}
	}

	public void deleteStack() {
		array = null;
	}

	public void printStack() {
		if (topOfStack == -1) {
			System.out.println("Stack is empty");
		} else {
			for (int i = 0; i <= topOfStack; i++) {
				System.out.print(array[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		Stack stack1 = new Stack();

		// create stack of size 5
		stack1.createStack(5);

		// insert 1 to the stack
		stack1.push(1);
		stack1.push(2);
		stack1.push(5);
		stack1.push(8);
		stack1.push(12);

		// pop from the stack
		stack1.pop();
		stack1.pop();

		// check whether stack is empty or not
		System.out.println(stack1.isEmpty());

		// peek top element from stack
		stack1.peek();

		// isFull method will check whether stack is full or not
		System.out.println(stack1.isFull());

		// Stack
		stack1.printStack();

	}

}
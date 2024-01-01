class Stack {
	public void meth1(int num1) {
		System.out.println(num1);
	}

	public void meth1(int num2, int num3) {
		System.out.println(num2 + num3);
	}

	public static void main(String[] args) {
		Stack stk = new Stack();
		stk.meth1(5, 10);
		stk.meth1(25);
	}
}
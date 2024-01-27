public class StackArray {
    int[] array;
    int topStackElement;

    public void createStack(int size) {
        array = new int[size];
        topStackElement = -1;
    }

    public void push(int data) {
        if (array.length - 1 == topStackElement) {
            System.out.println("stack overflow error!");
        } else {
            array[topStackElement + 1] = data;
            topStackElement++;
            System.out.println("Data Inserted : " + data + ".");
        }
    }

    public void pop() {
        if (topStackElement == -1) {
            System.out.println("stack underflow error!");
        } else {
            int temp = array[topStackElement];
            topStackElement--;
            System.out.println(temp);
        }
    }

    public void peek() {
        if (topStackElement == -1) {
            System.out.println("Stack is Empty");
        } else if (array == null) {
            System.out.println("Stack is Empty / deleted.");
        } else {
            int tmp = array[topStackElement];
            System.out.println("Peek Element is : " + tmp);
        }
    }

    public void higestValueInStack() {
        int max = array[0];
        for (int j = 1; j <= topStackElement; j++) {
            if (array[j] > max) {
                max = array[j];
            }
        }
        System.out.println("highest element is " + max);
    }

    public boolean isEmpty() {
        if (topStackElement == -1)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if (array.length - 1 == topStackElement)
            return true;
        else
            return false;
    }

    public void deleteStack() {
        array = null;
    }

    public void printStack() {
        if (topStackElement == -1) {
            System.out.println("stack is empty");
        } else if (array == null) {
            System.out.println("Stack is Empty / deleted.");
        } else {
            for (int i = 0; i <= topStackElement; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        StackArray str = new StackArray();

        str.createStack(10);

        str.push(2);
        str.push(5);
        str.push(10);
        str.push(15);
        str.push(18);
        str.push(20);
        str.push(27);
        str.push(32);
        str.push(36);
        str.push(27);

        str.peek();

        System.out.println(str.isEmpty());

        System.out.println(str.isFull());

        str.pop();

        str.printStack();

        str.higestValueInStack();

        str.deleteStack();

        str.printStack();

    }
}

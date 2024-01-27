public class QueueArray {
    int[] array;
    int rear;
    int front;

    public void createQueue(int size) {
        array = new int[size];
        rear = -1;
        front = -1;
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (array.length - 1 == rear) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("queque overflow error!");
        } else if (rear == -1) {
            front = 0;
            rear++;
            array[rear] = data;
            System.out.println("Data Inserted");
        } else {
            rear++;
            array[rear] = data;
            System.out.println("Data Inserted");
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("queque underflow error0!");
        } else {
            int temp = array[front];
            System.out.println(temp);
            array[front] = 0;
            front++;
            if (front > rear) {
                front = rear = -1;
            }
        }
    }

    public void peek() {
        if (front == -1) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(array[front]);
        }
    }

    public void deleteQueue() {
        array = null;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        QueueArray queue = new QueueArray();
        queue.createQueue(6);
        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);
        queue.push(50);

        queue.pop();

        queue.push(25);

        System.out.println(queue.isEmpty());

        System.out.println(queue.isFull());

        queue.printQueue();
    }
}

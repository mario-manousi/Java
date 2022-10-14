public class Stack {
    final int SIZE= 10;
    private int[] array;
    private int top;
    Stack() {
        array = new int[SIZE];
        top = -1;
    }
    public void push(int value) {
        if (top < SIZE -1) {
            top +=1;
            array[top] =value;
        }
        else {
            System.out.println("Stack is full..");
        }
    }
    public int pop() {
        if (top >=0) {
            top --;
            return array[top +1];
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
    public boolean empty() {
        return top ==-1;
    }
}



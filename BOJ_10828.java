import java.util.*;

class Stack {
    private static final int MAX_SIZE = 100;
    private int[] data;
    private int size;

    public Stack() {
        data = new int[MAX_SIZE];
        size = -1;
    }

    public int getSize() {
        return size + 1;
    }

    public boolean isEmpty() {
        return (size == -1);
    }

    public boolean isFull() {
        return (size == MAX_SIZE - 1);
    }

    public void push(int val) {
        if (isFull()) {
            return;
        }
        data[++size] = val;
    }    

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        return data[size--];
    }

    public int top() {
        if (isEmpty()) {
            return -1;
        }
        return data[size];
    }
}

public class BOJ_10828 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        int testcase = 0;

        testcase = sc.nextInt();

        while(testcase-- > 0) {
            String s = sc.next();

            if(s.equals("push")) {
                stack.push(sc.nextInt());
            }
            else if(s.equals("pop")) {
                System.out.println(stack.pop());
            }
            else if(s.equals("size")) {
                System.out.println(stack.getSize());
            }
            else if(s.equals("empty")) {
                if(stack.isEmpty() == true) {
                    System.out.println(1);
                }
                else {
                    System.out.println(0);
                }
            }
            else if(s.equals("top")) {
                System.out.println(stack.top());
            }
        }
        sc.close();
    }
}